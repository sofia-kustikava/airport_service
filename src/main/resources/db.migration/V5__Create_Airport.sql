CREATE TABLE IF NOT EXISTS airport_db.public.Airport
(
    id    bigint       NOT NULL PRIMARY KEY,
    name  varchar(100) NOT NULL,
    state varchar(50)  NOT NULL
);

INSERT INTO Airport (id, name, state)
VALUES (1, 'Hartsfield-Jackson Atlanta International', 'Georgia');
INSERT INTO Airport (id, name, state)
VALUES (2, 'Ted Stevens Anchorage International Airport', 'Alaska');
INSERT INTO Airport (id, name, state)
VALUES (3, 'Austin-Bergstrom International', 'Texas');
INSERT INTO Airport (id, name, state)
VALUES (4, 'Logan International Airport', 'Massachusetts');
INSERT INTO Airport (id, name, state)
VALUES (5, 'Charlotte Douglas International', 'North Carolina');

INSERT INTO Airport (id, name, state)
VALUES (6, 'Beijing Capital International Airport', 'Beijing');
INSERT INTO Airport (id, name, state)
VALUES (7, 'Hinton-in-the-Hedges Airfield', 'Brackley');
INSERT INTO Airport (id, name, state)
VALUES (8, 'Sturgate Airfield', 'Lincoln');
INSERT INTO Airport (id, name, state)
VALUES (9, 'City Airport & Manchester Heliport', 'Eccles');
INSERT INTO Airport (id, name, state)
VALUES (10, 'Liverpool John Lennon Airport', 'Liverpool');
INSERT INTO Airport (id, name, state)
VALUES (11, '«Kyiv» International Airport', 'Kyiv');
INSERT INTO Airport (id, name, state)
VALUES (12, 'Minsk Airport Transfer', 'Minsk');
INSERT INTO Airport (id, name, state)
VALUES (13, 'Warsaw Frederic Chopin Airport', 'Warsaw');