USE sakila;
SELECT CONCAT(address, ' in ', UPPER(district))
AS full_address FROM address;