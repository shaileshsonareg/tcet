database: company
table: employees (id PK int A_I, name varchar (50), department varchar (255), salary int )

CW1: SELECT ALL employees who has salary greater than 50000
CW2: 
SELECT ALL employees who has salary greater than 50000 and less than 70000
mysql> SELECT name AS "Full Name", salary FROM employees WHERE salary
> 50000 AND salary < 70000;

CW3: SELECT all employees from HR department
SELECT * FROM employees WHERE department = 'Human Resources';

CW4: SELECT all emploees from HR and Engineering Department
mysql> SELECT * FROM employees WHERE department = 'Human Resources' OR department = "Engineering";

CW5: SELECT all employees from HR, Sales and Engineering department 
mysql> SELECT * FROM employees WHERE department IN ('Human Resources', "Engineering", "Sales");

CW6: Show only department list from employees
mysql> SELECT DISTINCT department FROM employees;


CW7: Find max, min, avg, total salary from employees
mysql> SELECT MAX(salary), MIN(salary), AVG(salary), SUM(salary) FROM employees\G

CW8: Show employees sort by salary in descending order 
mysql> SELECT * FROM employees ORDER BY salary DESC;

CW9: Show highest salaried employees
mysql> SELECT * FROM employees WHERE salary = (SELECT MAX(salary) FROM employees);


CW10: Show 2nd highest salaried employees
mysql> SELECT * FROM employees WHERE salary = (SELECT DISTINCT salary FROM employees ORDER BY salary DESC LIMIT 1, 1);


CW11: name start with a
mysql> SELECT * FROM employees WHERE name LIKE 'a%';


CW12: find all female employees (names ends with vowels - a e i o u)
mysql> SELECT * FROM employees WHERE name LIKE '%a %' OR name LIKE '%i %'
OR name LIKE '%e %' OR name LIKE '%o %' OR name LIKE '%u %';

CW13: find all employees whose first name has 4 characters
mysql> SELECT * FROM employees WHERE name LIKE '____ %';

CW14: write query for page number 2 (5 records per page)
mysql> SELECT * FROM employees LIMIT 5, 5;





CREATE TABLE `students` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB


INSERT INTO students (name) VALUES
('Rahul Kumar'), ('Sneha Sharma'), ('Arjun Patel'), ('Kavya Reddy'), ('Rohan Singh');







CREATE TABLE department_master (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100)
);

INSERT INTO department_master (name) VALUES
('IT'), ('CS'), ('AI'), ('ML'), ('DevOps');










CREATE TABLE result (
    id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    department_id INT,
    marks INT,
    FOREIGN KEY (student_id) REFERENCES students(id),
    FOREIGN KEY (department_id) REFERENCES department_master(id)
);

INSERT INTO result (student_id, department_id, marks) VALUES
(1, 1, 85),
(2, 3, 90),
(3, 2, 78),
(4, 5, 88),
(5, 4, 92);

CW: Show result with id, student_name, department_name, marks using left join

CREATE VIEW student_result AS 
(SELECT r.id, s.name AS student_name, d.name AS department_name, r.marks FROM 
result AS r LEFT JOIN students AS s
ON r.student_id = s.id 
LEFT JOIN department_master AS d
ON d.id = r.department_id);


mysql> SHOW FULL TABLES;
+----------------------------+------------+
| Tables_in_tcet_mca_company | Table_type |
+----------------------------+------------+
| department_master          | BASE TABLE |
| employees                  | BASE TABLE |
| result                     | BASE TABLE |
| student_result             | VIEW       |
| students                   | BASE TABLE |
+----------------------------+------------+
5 rows in set (0.01 sec)



















CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(255),
    salary INT
);

Insert 10 records of indian employees  
INSERT INTO employees (name, department, salary) VALUES
('Amit Sharma', 'Engineering', 75000),
('Priya Verma', 'Human Resources', 58000),
('Rohit Patel', 'Finance', 65000),
('Sneha Reddy', 'Marketing', 60000),
('Vikram Singh', 'Engineering', 82000),
('Neha Gupta', 'Sales', 55000),
('Arjun Mehta', 'IT Support', 50000),
('Kavya Nair', 'Design', 62000),
('Sandeep Kulkarni', 'Operations', 70000),
('Pooja Iyer', 'Administration', 48000);

















mysql> desc employees;
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| id         | int          | NO   | PRI | NULL    | auto_increment |
| name       | varchar(50)  | YES  |     | NULL    |                |
| department | varchar(255) | YES  |     | NULL    |                |
| salary     | int          | YES  |     | NULL    |                |
+------------+--------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

create new table deleted_employees with column (id, name, department, salary)
add extra column deleted_at with default value NOW()


CW: Create trigger which will add new entry in deleted_employees after deleting records from employees table 

CREATE TABLE deleted_employees (
    id INT,
    name VARCHAR(50),
    department VARCHAR(255),
    salary INT,
    deleted_at TIMESTAMP DEFAULT NOW()
);

DELIMITER $$

CREATE TRIGGER after_employee_delete
AFTER DELETE ON employees
FOR EACH ROW
BEGIN
    INSERT INTO deleted_employees (id, name, department, salary)
    VALUES (OLD.id, OLD.name, OLD.department, OLD.salary);
END $$

DELIMITER ;




create table activity_log with column (id (int), username (varchar 50), activity (varchar 255), created_at (date time now()))

Insert 5 records per minute

Create event which will remove records older than 5 minutes


CREATE TABLE activity_log (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    activity VARCHAR(255),
    created_at DATETIME DEFAULT NOW()
);

SET GLOBAL event_scheduler = ON;

CREATE EVENT delete_old_activity_logs
ON SCHEDULE EVERY 1 MINUTE
DO
    DELETE FROM activity_log
    WHERE created_at < NOW() - INTERVAL 5 MINUTE;

INSERT INTO activity_log (username, activity) VALUES
('rahul', 'Logged in'),
('sneha', 'Viewed dashboard'),
('arjun', 'Updated profile'),
('kavya', 'Logged out'),
('rohan', 'Changed password');















































