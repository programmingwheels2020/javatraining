DROP TABLE IF EXISTS book;

CREATE TABLE book (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  author VARCHAR(250) NOT NULL
);

INSERT INTO book (title, author) VALUES  
('LOTR', 'Tolkein'),
('Inferno', 'Dante');
