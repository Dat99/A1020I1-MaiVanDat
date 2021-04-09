drop database if exists selling;
create database selling;
use selling;

create table productlines ( -- mô tả sản phẩm
productLine  varchar(50) primary key not null,
textDescription  varchar(50) null, -- mô tả
image  varchar(30) null
);

create table offices (
	officeCode  varchar(10) primary key not null,
    city  varchar(50) not null,
    phone  varchar(50) not null,
    addressLine1  varchar(50) not null,
    addressLine2 varchar(50) null,
    state varchar(50) null,
	country varchar(100) not null,
    postalCode  varchar(15) not null
);

create table employees (
 employeeNumber  int primary key auto_increment not null,
 lastName  varchar(50) not null,
 firstName  varchar(50) not null,
 email varchar(100) not null,
jobTitle  varchar(50) not null,
reportTo int,
foreign key(reportTo) references employees(employeeNumber),
officeCode varchar(10),
foreign key(officeCode) references offices(officeCode)
);

create table customers(
 customerNumber int primary key  not null,
 customerName  varchar(50) not null, -- tên công ty khách hàng
 contactLastName  varchar(50) not null, -- họ khách hàng
 contactFirstName  varchar(50) not null, -- tên khách hàng
 phone varchar(50) not null,
 addressLine1  varchar(50) not null,
 addressLine2 varchar(50) null,
 city varchar(50) not null,
 state  varchar(50) not null, -- bang, vùng
 postalCode varchar(15)  not null, 	 -- mã vùng
 country varchar(50) not null,
 creditLimit float null, -- hạn mức tín dụng
 salesRepEmployeeNumber int,
 foreign key(salesRepEmployeeNumber) references employees( employeeNumber)
);


create table products (
  productCode  varchar(15) primary key not null,
  productName  varchar(75) not null,
  productScale  varchar(10) not null,-- phạm vi sản phẩm
  productVendor  varchar(50) not null,-- nhà cung cấp
  productDescription  text not null, -- mô tả sản phẩm
  quantityInStock  int not null,
  buyPrice  float not null, -- giá nhập
  MSRP float not null, -- giá bán lẻ
  productLine varchar(50),
  foreign key(productLine) references productlines( productLine)
);

create table orders(
orderNumber int  primary key not null,
orderDate  date not null, -- ngày mua hàng
requiredDate  date not null, -- ngày yêu cầu giao hàng
shippedDate  date null, -- ngày giao hàng thực tế
status varchar(15) not null, 
comments  text null,
quantityOrdered  int not null, -- số lương đặt hàng
priceEach  float not null, -- đơn giá
customerNumber int,
foreign key(customerNumber) references customers(customerNumber)
);

create table payments(
payment_id  int primary key  not null,
checkNumber  varchar(50) not null,
paymentDate  date not null,
amount float not null,
customerNumber int,
foreign key(customerNumber) references customers(customerNumber)
); 



create table OrderDetails (
productCode  varchar(15),
orderNumber int,
primary key(productCode,orderNumber),
foreign key(orderNumber) references products(productCode),
foreign key(productCode) references orders(orderNumber)
);





