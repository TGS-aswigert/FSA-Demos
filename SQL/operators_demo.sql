USE sakila;
-- SELECT * FROM payment
-- WHERE amount > customer_id + staff_id
-- AND rental_id < 10000;
SELECT first_name, last_name FROM customer
WHERE first_name NOT LIKE "M%";