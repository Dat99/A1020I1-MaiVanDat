drop database module3_final;
create database module3_final;
use module3_final ;

CREATE TABLE matBang (
    id INT  PRIMARY KEY,
    loaiMatBang VARCHAR(50),
    trangThai VARCHAR(50),
    dienTich INT NOT NULL,
    tang INT NOT NULL,
    giaTien INT NOT NULL,
    ngayBatDau date,
    ngayKetThuc date
);
insert into matBang(id,loaiMatBang,trangThai,dienTich,tang,giaTien,ngayBatDau,ngayKetThuc)
values
(1,"Văn phòng trọn gói","trống",30,10,2000000,"2020-12-01","2021-04-01"),
(2,"Văn phòng chia sẽ","trống",30,4,5000000,"2020-07-05","2021-12-01"),
(3,"Văn phòng trọn gói","trống",50,10,3000000,"2020-05-04","2021-12-01");



