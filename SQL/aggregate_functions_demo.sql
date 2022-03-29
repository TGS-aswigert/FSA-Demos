USE sakila;
-- SELECT COUNT(*) AS active_customers,
-- (SELECT COUNT(*) FROM customer) AS total_customers
-- FROM customer WHERE active = 1;
SELECT customer_id, SUM(amount) AS customer_total
FROM payment GROUP BY customer_id;