INSERT INTO Role (id, role_name)
VALUES (1, 'ADMIN');
INSERT INTO Role (id, role_name)
VALUES (2, 'USER');

INSERT INTO User_Role (user_id, role_id)
VALUES (1, 1);
INSERT INTO User_Role (user_id, role_id)
VALUES (2, 2);
INSERT INTO User_Role (user_id, role_id)
VALUES (3, 2);