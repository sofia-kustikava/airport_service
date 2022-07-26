CREATE TABLE IF NOT EXISTS airport_db.public.Ticket
(
    id        bigint NOT NULL PRIMARY KEY,
    flight_id bigint NOT NULL,
    user_id   bigint NOT NULL,
    CONSTRAINT flight_id FOREIGN KEY (flight_id)
        REFERENCES airport_db.public.flight (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT user_id FOREIGN KEY (user_id)
        REFERENCES airport_db.public."user" (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

INSERT INTO Ticket (id, flight_id, user_id)
VALUES (1, 1, 1);
INSERT INTO Ticket (id, flight_id, user_id)
VALUES (2, 2, 2);
INSERT INTO Ticket (id, flight_id, user_id)
VALUES (3, 3, 3);
INSERT INTO Ticket (id, flight_id, user_id)
VALUES (4, 4, 1);
INSERT INTO Ticket (id, flight_id, user_id)
VALUES (5, 5, 2);
INSERT INTO Ticket (id, flight_id, user_id)
VALUES (6, 6, 3);
INSERT INTO Ticket (id, flight_id, user_id)
VALUES (7, 7, 1);
INSERT INTO Ticket (id, flight_id, user_id)
VALUES (8, 8, 2);
INSERT INTO Ticket (id, flight_id, user_id)
VALUES (9, 9, 3);
INSERT INTO Ticket (id, flight_id, user_id)
VALUES (10, 10, 1);