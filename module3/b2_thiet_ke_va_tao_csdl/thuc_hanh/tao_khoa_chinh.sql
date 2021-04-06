drop database if exists customers;
create database customers;
use customers;


CREATE TABLE users(  
   user_id INT AUTO_INCREMENT PRIMARY KEY,  -- tạo khóa chính cách 1
   username VARCHAR(40),
   password VARCHAR(255),
   email VARCHAR(255)
);
CREATE TABLE roles(
   role_id INT AUTO_INCREMENT,
   role_name VARCHAR(50),
   PRIMARY KEY(role_id) -- tạo khóa chính cách 2
);

CREATE TABLE userroles(
   user_id INT NOT NULL,
   role_id INT NOT NULL,
   PRIMARY KEY(user_id,role_id), -- tạo khóa chính tổ hợp
   FOREIGN KEY(user_id) REFERENCES users(user_id),
   FOREIGN KEY(role_id) REFERENCES roles(role_id)
);

-- cách thêm khóa chính cho table
-- ALTER TABLE table_name
  --  ADD PRIMARY KEY(primary_key_column);

