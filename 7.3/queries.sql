DROP DATABASE IF EXISTS CurrencyDB1;
CREATE DATABASE CurrencyDB1;
USE CurrencyDB1;

CREATE TABLE Currency (
                          id INT PRIMARY KEY AUTO_INCREMENT,
                          abbreviation VARCHAR(3) NOT NULL UNIQUE,
                          name VARCHAR(50) NOT NULL,
                          rate DECIMAL(10,6) NOT NULL
);

INSERT INTO Currency (abbreviation, name, rate) VALUES
                                                    ('EUR', 'Euro', 1.000000),
                                                    ('USD', 'United States Dollar', 1.0539),
                                                    ('GBP', 'British Pound', 0.82706);

DROP USER IF EXISTS 'appuser'@'localhost';

CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'root';

GRANT SELECT, INSERT, UPDATE ON CurrencyDB1.Currency TO 'appuser'@'localhost';

FLUSH PRIVILEGES;