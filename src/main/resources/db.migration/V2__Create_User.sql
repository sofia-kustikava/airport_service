CREATE TABLE airport_db.public.Users
(
    id         bigint      NOT NULL PRIMARY KEY,
    first_name varchar(70) NOT NULL,
    last_name  varchar(70) NOT NULL,
    age        integer     NOT NULL,
    email      varchar(50) NOT NULL,
    password   varchar(255) NOT NULL,
    passport   varchar(25) NOT NULL
);



INSERT INTO airport_db.public.Users (id, first_name, last_name, age, email, password, passport)
VALUES (1, 'Admin', 'Adminovich', 40, 'admin@mail.com', '$2a$12$XmFno4d.H65Xo6hdwIiwqepfBjkq9e86HTKnG5LLlF4Z8RPbRIY5K',
        'HB9999999');
INSERT INTO airport_db.public.Users (id, first_name, last_name, age, email, password, passport)
VALUES (2, 'User', 'Userovich', 28, 'user@mail.com', '$2a$12$uZZIRrElg9H/gdd3nx/52u8mx2Y5qaGHWVXHWb6LVjNPXDe1d5xdm',
        'SD2839204');
INSERT INTO airport_db.public.Users (id, first_name, last_name, age, email, password, passport)
VALUES (3, 'Anna', 'Ivanova', 32, 'anna@mail.com', '$2a$12$jHxrU5xPBg0JT9EmYbQuce12SfmXav.071MXYy1KgR4mOiPIkA8Yq',
        'KD1139834');