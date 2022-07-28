package com.service.airport.security;

import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static io.jsonwebtoken.lang.Strings.hasText;

@Component
public class JwtUtils {

    @Value("${jwt.secret}")
    private String secret;

    public static final String AUTHORIZATION = "Authorization";

    public static final String PREFIX = "Bearer ";

    public String getTokenFromRequest(HttpServletRequest request) {
        String bearer = request.getHeader(AUTHORIZATION);
        if (hasText(bearer) && bearer.startsWith(PREFIX)) {
            return bearer.substring(7);
        }
        return null;
    }

    public Long getUserFromToken(HttpServletRequest request) {
        return Long.valueOf(Jwts.parser().setSigningKey(secret)
                .parseClaimsJws(getTokenFromRequest(request))
                .getBody().getId());
    }
}
