CREATE DATABASE Cafe;
USE Cafe;

CREATE TABLE Cakes (
    id int AUTO_INCREMENT NOT NULL,
    name_ varchar(50) NOT NULL,
    flavour varchar(50) NOT NULL,
    frosting varchar(50) NOT NULL,
    price int NOT NULL,
    PRIMARY KEY (id)
); 

CREATE TABLE Drinks (
    id int AUTO_INCREMENT NOT NULL,
    name_ varchar(50) NOT NULL,
    sugar boolean,
    temperature varchar(10),
    price int NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Customers (
    id int NOT NULL,
    firstName varchar(50) NOT NULL,
    lastName varchar(50) NOT NULL,
    phoneNumber int NOT NULL,
    address varchar(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Orders (
     id int AUTO_INCREMENT NOT NULL,
     customerId int,
     cakeId int,
     drinkId int,
     date_ datetime NOT NULL,
	 PRIMARY KEY (id)
);


ALTER TABLE Orders
ADD CONSTRAINT FK_CustomerOrder
FOREIGN KEY (customerId) REFERENCES Customers(id);

ALTER TABLE Orders
ADD CONSTRAINT FK_OrderCake
FOREIGN KEY (cakeId) REFERENCES Cakes(id);

ALTER TABLE Orders
ADD CONSTRAINT FK_OrderDrink
FOREIGN KEY (drinkId) REFERENCES Drinks(id);
