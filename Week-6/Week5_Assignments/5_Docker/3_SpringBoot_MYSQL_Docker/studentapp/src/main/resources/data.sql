-- Create table structure, (execute only once)
CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL
);

-- Insert sample data
--INSERT INTO students (name, age) VALUES
--('Royal', 25),
--('Sumukha', 30),
--('Nikhil', 28),
--('Shubham', 22);

INSERT INTO students (name, age) VALUES ('Royal', 28);
INSERT INTO students (name, age) VALUES ('Sumukha', 28);
INSERT INTO students (name, age) VALUES ('Nikhil', 28);
INSERT INTO students (name, age) VALUES ('Shubham', 28);
