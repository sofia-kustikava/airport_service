package com.service.airport.security;


import com.service.airport.entity.UserEntity;
import io.jsonwebtoken.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class JwtProvider {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expired}")
    private String expired;

    public String generateToken(UserEntity user) {
        Date now = new Date();
        Date timeline = new Date(now.getTime()+expired);
        return Jwts.builder()
                .setId(Long.toString(user.getId()))
                .setSubject(user.getEmail())
                .claim("firstname", user.getFirstName())
                .claim("lastname", user.getLastName())
                .claim("age", user.getAge())
                .claim("passport", user.getPassport())
                .setExpiration(timeline)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return true;
        } catch (ExpiredJwtException expEx) {
            log.debug("Token expired");
        } catch (UnsupportedJwtException unsEx) {
            log.debug("Unsupported jwt");
        } catch (MalformedJwtException mjEx) {
            log.debug("Malformed jwt");
        } catch (SignatureException sEx) {
            log.debug("Invalid signature");
        } catch (Exception e) {
            log.debug("invalid token");
        }
        return false;
    }

    public String getEmailFromToken(String token) {
        Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        return claims.getSubject();
    }
}
