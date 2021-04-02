drop database if exists classicmodels;
create database classicmodels;
use classicmodels;

create table customers(
     customer_name varchar(50),
     phone int ,
     city varchar(30),
     country varchar(30)
     );
insert into customers
values 
('Mai Văn Đức',0971684146,'Da Nang','Viet Nam'),
('Mai Văn Đạt',0948529229,'Da Nang','Viet Nam');

 SELECT * FROM customers; -- truy vấn dữ liệu từ bảng customers
 select * from customers where customer_name="Mai Văn Đạt";
 select * from customers where customer_name like '%M%';
 select * from customers where city IN  ('Da Nang'); 
 
 update customers
 set customer_name ='Mai Thị Thương'
 where customer_name ='Mai Văn Đạt';
 
 delete from customers
 where customer_name like '%Mai Thị%';
 
 alter table customers

 
 

 
 
 