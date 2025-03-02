DROP DATABASE IF EXISTS CurrencyDB;
CREATE DATABASE CurrencyDB;
USE CurrencyDB;

CREATE TABLE Currency (
                          id INT PRIMARY KEY AUTO_INCREMENT,
                          code VARCHAR(3) NOT NULL UNIQUE,
                          name VARCHAR(50) NOT NULL,
                          rate DECIMAL(10,6) NOT NULL -- To Euro
);

INSERT INTO Currency (code, name, rate) VALUES
                                            ('EUR', 'Euro', 1.000000),
                                            ('USD', 'United States Dollar', 0.925926),
                                            ('GBP', 'British Pound', 1.175926);

DROP USER IF EXISTS 'appuser'@'localhost';

CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'root';

GRANT SELECT, INSERT, UPDATE ON CurrencyDB.Currency TO 'appuser'@'localhost';

FLUSH PRIVILEGES;

