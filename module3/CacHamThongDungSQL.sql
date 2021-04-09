create database hoc_vien;
use hoc_vien;
create table hoc_vien_codegym(
id int primary key not null,
ten varchar(50),
tuoi int,
khoahoc char(10),
sotien decimal(18,0)
);

insert into hoc_vien_codegym
values (1,'Hoang',21,'CNTT',4000000),
	   (2,'Viet',19,'DTVT',3200000),
	   (3,'Thanh',18,'KTDN',4000000),
	   (4,'Hoang',19,'CNTT',4500000),
	   (5,'Huong',20,'TCHH',5000000),
	   (6,'Huong',20,'TCNH',2000000);

select *
from hoc_vien_codegym
where ten='Huong';


select sum(sotien)
from hoc_vien_codegym
where ten='Huong';

select distinct ten
from hoc_vien_codegym;