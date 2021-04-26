drop database if exists students_manager;
create database students_manager;
use students_manager;

create table class(
   IdClass int not null primary key auto_increment,
   NameClass varchar(10),
   TypeOfClass varchar(5)
);
create table student(
   IdStudent int not null primary key auto_increment,
   NameStudent varchar(30),
   DateOfBirth date,
   IdClass int,
   constraint IdStudent_IdClass
   foreign key(IdClass) references class(IdClass)
);

insert into student
values(2, 'Mai Văn Đạt', 21/05/1999, 1);

insert into class
values(1, 'A1020I1', 'night');



