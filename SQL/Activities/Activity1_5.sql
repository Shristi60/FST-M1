--Activity 1:Create Salesman table--
CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20),salesman_city varchar(20), commission int);
DESCRIBE salesman

--Activity 2:Insert Data into Salesman table
INSERT ALL
     INTO salesman VALUES(5001,'James Hoog','New York',15)
     INTO salesman VALUES(5002,'Nail Knite','Paris',13)
     INTO salesman VALUES(5005,'Pit Alex','London',11)
     INTO salesman VALUES(5006,'McLyon','Paris', 14)
     INTO salesman VALUES(5007,'Paul Adam','Rome',13)
     INTO salesman VALUES(5003,'Lauson Hen','San Jose',12)
SELECT 1 from DUAL;
--Activity 3: Display data from Salesman table

--Show data from the salesman_id and salesman_city columns
SELECT salesman_ID, salesman_city from salesman;
--Show data of salesman from Paris
SELECT * from salesman where salesman_city='Paris';
Show salesman_id and commission of Paul Adam
SELECT salesman_id,commission from salesman where salesman_name='Paul Adam';

--Activity 4: Add a new column Grade to Salesman--
ALTER table salesman ADD grade int; 
DESCRIBE salesman;
UPDATE salesman SET grade=100;
Select * from salesman;

--Activity 5: Modify values in salesman table
--Update the grade score of salesmen from Rome to 200.
UPDATE salesman SET grade=200 where salesman_city='Rome';
--Update the grade score of James Hoog to 300.
UPDATE salesman SET grade=300 where salesman_name='James Hoog';
Select * from salesman;
--Update the name McLyon to Pierre.
UPDATE salesman SET salesman_name='Pierre' where salesman_name='McLyon';
SELECT * FROM salesman;
