USE sakila;
-- SELECT city.city, country.country
-- FROM city
-- LEFT JOIN country
-- ON city.country_id = country.country_id;
SELECT CONCAT(actor.first_name, ' ', actor.last_name), category.name
FROM actor
CROSS JOIN category;