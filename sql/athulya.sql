CREATE TABLE Employee (
    employee_id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(20),
    hire_date DATE NOT NULL,
    job_title VARCHAR(50) NOT NULL,
    department_id INT NOT NULL,
    salary DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (employee_id),
    FOREIGN KEY (department_id) REFERENCES Department(department_id)
);
CREATE TABLE Department (
    department_id INT NOT NULL AUTO_INCREMENT,
    department_name VARCHAR(50) NOT NULL,
    manager_id INT,
    location VARCHAR(100),
    PRIMARY KEY (department_id)
    );
    DESC DEPARTMENT;
    DESC EMPLOYEE;
    INSERT INTO DEPARTMENT
    VALUES(1,"finance", 13,"thsr");
    SELECT * FROM DEPARTMENT;
	INSERT INTO DEPARTMENT
    VALUES(2,"Accounts", 14,"kkm");
    SELECT * FROM DEPARTMENT;
    INSERT INTO DEPARTMENT
    VALUES(3,"Support", 25,"tvm");
    SELECT * FROM DEPARTMENT;
    INSERT INTO EMPLOYEE
    VALUES(1,"Ath","vij","ath@gmail.com",9188854680, "10-08-23", "developer",2,45000);
    INSERT INTO EMPLOYEE
    SELECT * FROM EMPLOYEE;
    SELECT UPPER(first_name) FROM  employee;
    SELECT COUNT(*) FROM DEPARTMENT where DEPARTMENT = "HR";
    SELECT CURRENT _DATE;
   
  
    
    
    
    
    
    
    
    
    






