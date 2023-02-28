-- create database
CREATE DATABASE Jaegers;

-- create table
CREATE TABLE Jaegers (
    id        SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      TEXT,
    height    INTEGER,
    weight    INTEGER,
    status    TEXT,
    origin    TEXT,
    launch    INTEGER,
    kaijuKill INTEGER
);

\i init_db.sql;
\i queries.sql;

DROP TABLE Jaegers;