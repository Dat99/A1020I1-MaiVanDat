	drop database if exists foreign_primary_key;
    create database foreign_primary_key;
    use foreign_primary_key;
    
    create table customers(
         customer_number int primary key auto_increment,
         `name` varchar(50),
         address varchar(70),
         email varchar(30),
         phone date
    );
    
    create table accounts(
    account_number int primary key auto_increment,
    account_type varchar(30),
    account_date date,
    balance date,
    customer_number int, --  trường khóa ngoại
    foreign key(customer_number) references customers(customer_number)
        
    );
    
    create table transactions (
    tran_number int primary key auto_increment,
    account_number date,
    tran_date date,
    amounts date,
    descriptions date,
    account_number int, -- trường khóa ngoại
    foreign key(account_number ) references accounts(account_number)
    );