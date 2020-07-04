/*Create new user*/

CREATE USER 'springmvc'@'localhost' IDENTIFIED BY 'springmvc';
GRANT ALL PRIVILEGES ON * . * TO 'springmvc'@'localhost';

CREATE SCHEMA springmvc;



/*create table feedback*/
CREATE TABLE IF NOT EXISTS feedback (
  
    name VARCHAR(20),
    email VARCHAR(30),
    message VARCHAR(10000),
    reading int,
    code VARCHAR(10),
    rating int
);


/*Sample data */
insert into feedback(name,email,message,reading,code,rating) values('chanaka','chanakaroshan@gmail.com','good',1,'code 101',1);