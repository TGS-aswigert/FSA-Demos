USE sakila;
DROP TABLE IF EXISTS theatre;
CREATE TABLE theatre (
	theatre_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE,
    address_id SMALLINT UNSIGNED NOT NULL UNIQUE,
    student_discount DOUBLE(3,2) UNSIGNED,
    FOREIGN KEY (address_id) REFERENCES address(address_id)
);
INSERT INTO theatre (name, address_id, student_discount)
VALUES ("AMC Parks", 1, NULL),
	("Cinemark 27", 2, .25),
	("Studio Movie Grill Plano", 3, NULL),
	("Cinemark 48", 4, 1);
UPDATE theatre SET student_discount = 1.25
WHERE theatre_id = 3;
-- SELECT * FROM theatre
-- WHERE student_discount IS NOT NULL;
DELETE FROM theatre
WHERE name LIKE "%Cinemark%";
SELECT * FROM theatre;