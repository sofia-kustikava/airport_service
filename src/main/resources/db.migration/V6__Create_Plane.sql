CREATE TABLE IF NOT EXISTS airport_db.public.Plane
(
    id       bigint      NOT NULL PRIMARY KEY,
    "number" varchar(10) NOT NULL,
    model    varchar(20) NOT NULL
);

INSERT INTO Plane (id, "number", model)
VALUES (1, 'XS-34268', 'Boeing 737');
INSERT INTO Plane (id, "number", model)
VALUES (2, 'BS-02194', 'Airbus A330-300');
INSERT INTO Plane (id, "number", model)
VALUES (3, 'DF-84562', 'Airbus A380');
INSERT INTO Plane (id, "number", model)
VALUES (4, 'KR-19379', 'Airbus A321neo');
INSERT INTO Plane (id, "number", model)
VALUES (5, 'XS-84502', 'Boeing 757-200BCF');
INSERT INTO Plane (id, "number", model)
VALUES (6, 'DF-97608', 'Boeing 737');
INSERT INTO Plane (id, "number", model)
VALUES (7, 'UK-55438', 'Airbus A330-300');
INSERT INTO Plane (id, "number", model)
VALUES (8, 'LF-39560', 'Airbus A321neo');
INSERT INTO Plane (id, "number", model)
VALUES (9, 'VK-10387', 'Boeing 737');
INSERT INTO Plane (id, "number", model)
VALUES (10, 'AL-45895', 'Boeing 757-200BCF');

