-- Truy vấn bảng customes
-- select * 
-- from customers

-- truy vấn một số cột nhất định từ bảng customers
-- select customerName, phone,city, country
-- from customers

-- truy vấn dữ liệu có điều kiện
/*select * 
from customers
where customerName = 'Atelier Graphique'*/

-- truy vấn dữ liệu với tên khách hàng có chứa ký tự là A
/*select *
from customers
where customerName like "%A%"*/

-- lọc dữ liệu 
select*
from customers
where city in("Nantes","Las Vegas")

