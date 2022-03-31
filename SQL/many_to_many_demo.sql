USE practice;
-- CREATE TABLE books (
-- 	book_id SMALLINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
--     title VARCHAR(255) UNIQUE NOT NULL
-- );
-- CREATE TABLE authors (
-- 	author_id SMALLINT NOT NULL	AUTO_INCREMENT PRIMARY KEY,
--     full_name VARCHAR(100) UNIQUE NOT NULL
-- );
DROP TABLE IF EXISTS book_authors;
CREATE TABLE book_authors (
	book_author_id SMALLINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    book_id SMALLINT,
    author_id SMALLINT,
    FOREIGN KEY (book_id) REFERENCES books(book_id),
    FOREIGN KEY (author_id) REFERENCES authors(author_id)
);
INSERT INTO book_authors (book_id, author_id)
VALUES (1, 6),  (1,7), (1,8), (1,9),
(2, 2), (2, 3), (2, 4), (2, 5),
(3, 1), (4,1);
SELECT * FROM book_authors;