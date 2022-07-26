package com.service.airport.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "flight")
public class FlightEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "from_airport")
    private AirportEntity fromAirport;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "to_airport")
    private AirportEntity toAirport;

    @Column(name = "take_off")
    private LocalDateTime takeOff;

    @Column(name = "arrival")
    private LocalDateTime arrival;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plane_id")
    private PlaneEntity plane;

    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
    private List<TicketEntity> tickets;
}
