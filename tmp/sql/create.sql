DROP TABLE IF EXISTS users;

CREATE TABLE users(
    id          SMALLSERIAL PRIMARY KEY,
    username    VARCHAR(50) UNIQUE,
    password    VARCHAR(50),
    active      BOOLEAN
);
