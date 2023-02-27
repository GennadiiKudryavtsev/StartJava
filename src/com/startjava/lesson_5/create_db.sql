-- create database
CREATE DATABASE Jaegers;

-- create table
CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark TEXT, height INTEGER,
    weight INTEGER, status TEXT,
    origin TEXT,
    launch INTEGER,
    kaijuKill INTEGER);

\echo \i 'Desktop/init_db.sql';
\echo \i 'Desktop/queries.sql';