CREATE TABLE IF NOT EXISTS airport_db.public.Flight
(
    id           bigint NOT NULL PRIMARY KEY,
    from_airport bigint NOT NULL,
    to_airport   bigint NOT NULL,
    take_off     date,
    arrival      date,
    plane_id     bigint NOT NULL
        CONSTRAINT from_airport FOREIGN KEY (from_airport)
        REFERENCES airport_db.public.airport (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT plane_id FOREIGN KEY (plane_id)
        REFERENCES airport_db.public.plane (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT to_airport FOREIGN KEY (to_airport)
        REFERENCES airport_db.public.airport (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

INSERT INTO Flight (id, from_airport, to_airport, take_off, arrival, plane_id)
VALUES (1, 1, 3, '2022-09-02', '2022-09-03', 3);
INSERT INTO Flight (id, from_airport, to_airport, take_off, arrival, plane_id)
VALUES (2, 3, 4, '2022-08-04', '2022-08-05', 4);
INSERT INTO Flight (id, from_airport, to_airport, take_off, arrival, plane_id)
VALUES (3, 5, 8, '2022-09-09', '2022-09-10', 7);
INSERT INTO Flight (id, from_airport, to_airport, take_off, arrival, plane_id)
VALUES (4, 11, 13, '2022-09-03', '2022-09-04', 9);
INSERT INTO Flight (id, from_airport, to_airport, take_off, arrival, plane_id)
VALUES (5, 10, 1, '2022-09-02', '2022-09-02', 8);
INSERT INTO Flight (id, from_airport, to_airport, take_off, arrival, plane_id)
VALUES (6, 12, 3, '2022-07-29', '2022-07-30', 1);
INSERT INTO Flight (id, from_airport, to_airport, take_off, arrival, plane_id)
VALUES (7, 6, 1, '2022-08-02', '2022-08-03', 2);
INSERT INTO Flight (id, from_airport, to_airport, take_off, arrival, plane_id)
VALUES (8, 7, 9, '2022-08-12', '2022-08-13', 2);
INSERT INTO Flight (id, from_airport, to_airport, take_off, arrival, plane_id)
VALUES (9, 1, 13, '2022-08-19', '2022-08-20', 10);
INSERT INTO Flight (id, from_airport, to_airport, take_off, arrival, plane_id)
VALUES (10, 9, 12, '2022-09-14', '2022-09-15', 6);