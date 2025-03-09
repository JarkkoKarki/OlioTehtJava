DROP DATABASE IF EXISTS CurrencyDB2;
CREATE DATABASE CurrencyDB2;
USE CurrencyDB2;

CREATE TABLE Currency (
                          id INT PRIMARY KEY AUTO_INCREMENT,
                          abbreviation VARCHAR(3) NOT NULL UNIQUE,
                          name VARCHAR(50) NOT NULL,
                          rate DECIMAL(10,6) NOT NULL
);

CREATE TABLE transaction (
                             id BIGINT AUTO_INCREMENT PRIMARY KEY,
                             amount DOUBLE NOT NULL,
                             currency_id INT,
                             fromCurrency VARCHAR(255),
                             toCurrency VARCHAR(255),
                             result DOUBLE NOT NULL,
                             FOREIGN KEY (currency_id) REFERENCES currency(id)
);


INSERT INTO Currency (abbreviation, name, rate) VALUES
                                                    ('EUR', 'Euro', 1.000000),
                                                    ('USD', 'United States Dollar', 1.053900),
                                                    ('GBP', 'British Pound', 0.827060);

DROP USER IF EXISTS 'appuser'@'localhost';

CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'root';

GRANT SELECT, INSERT, UPDATE, DELETE ON CurrencyDB2.* TO 'appuser'@'localhost';
GRANT CREATE, DROP ON CurrencyDB2.* TO 'appuser'@'localhost';

FLUSH PRIVILEGES;