CREATE TABLE department(
  dept_id number(4) constraint PK PRIMARY KEY,
  prod_id number(4) references product(prod_id),
  dept_name varchar(25) unique,
  dept_head varchar(25) NOT NULL
);
