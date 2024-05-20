# order-management-service
A simple e-commerce application

query for customer table

CREATE TABLE IF NOT EXISTS customer(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255),
email VARCHAR(255) NOT NULL,
phone_number BIGINT(10) NOT NULL,
address VARCHAR(1024),
gender VARCHAR(255),
created_at DATETIME NOT NULL
);

