customersdrop database if exists student;
create database student;

use student;
create table contacts(
 contact_id INT(11) NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(30) NOT NULL,
  first_name varchar(25),
  birthday DATE,
  constraint contacts_pk PRIMARY KEY (contact_id)
);

create table customers(
     customer_name varchar(50),
     phone int ,
     city varchar(30),
     country varchar(30)
     );

drop table contacts;

alter table customers
add email varchar(50) not null
after customer_name;

alter table customers
drop column email;

 alter table customers -- chỉnh sử mô tả của cột
 modify city varchar(50) NULL;
 
 ALTER TABLE customers   -- thay đổi tên cột city thành ct
  CHANGE COLUMN  city ct
    varchar(20) NOT NULL;



