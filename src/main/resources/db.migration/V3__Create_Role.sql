CREATE TABLE airport_db.public.Role
(
    id        bigint      NOT NULL PRIMARY KEY,
    role_name varchar(25) NOT NULL
);

CREATE TABLE IF NOT EXISTS airport_db.public.User_Role
(
    user_id bigint NOT NULL,
    role_id bigint NOT NULL,
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES airport_db.public.Users(id) ON UPDATE CASCADE,
    FOREIGN KEY (role_id) REFERENCES airport_db.public.Role(id) ON UPDATE CASCADE
);

alter table if exists airport_db.public.User_Role
    add constraint role_user_fk
        foreign key (user_id) references airport_db.public.Users;

