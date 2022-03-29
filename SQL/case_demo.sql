USE sakila;
SELECT city AS city_name,
	CASE country_id
		WHEN 100 THEN 'Ukraine'
        WHEN 101 THEN 'United Arab Emirates'
        WHEN 102 THEN 'United Kingdom'
        WHEN 103 THEN 'United States'
        WHEN 104 THEN 'Venezuela'
        WHEN 105 THEN 'Vietnam'
        ELSE 'Somewhere else'
	END country
FROM city
WHERE country_id BETWEEN 100 AND 107
ORDER BY city;