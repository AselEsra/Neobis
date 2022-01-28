CREATE DATABASE Cafe;
USE Cafe;

CREATE TABLE Cake (
    ID int NOT NULL,
    Flavour nvarchar(50),
    Frosting nvarchar(50),
    Price int,
    PRIMARY KEY (ID)
); 

CREATE TABLE Drink (
    ID int NOT NULL,
    [Type] nvarchar(50) NOT NULL,
    Sugar bit,
    Temperature nvarchar(50),
    Price int,
    PRIMARY KEY (ID)
);

CREATE TABLE Customer (
    ID int NOT NULL,
    FirstName nvarchar(50),
    LastName nvarchar(50) NOT NULL,
    Address nvarchar(255),
    PhoneNumber int,
    PRIMARY KEY (ID)
);
