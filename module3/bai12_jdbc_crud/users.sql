create database user_management;
use user_management;

create table users(
    id int not null primary key auto_increment,
    `name` varchar(30) not null,
    email varchar(50) not null,
    country varchar(30) not null
);

insert into users(`name`, email, country)
values('Minh','minh@codegym.vn','Viet Nam');

insert into users
(`name`, email, country)
 values('Kante','kante@che.uk','Kenia');
      