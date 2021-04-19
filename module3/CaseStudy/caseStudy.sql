drop database if exists furama_resorts;
create database furama_resorts;
use furama_resorts;

create table loai_dich_vu(
id_loai_dich_vu int primary key not null auto_increment,
ten_loai_dich_vu varchar(45)
);
create table vi_tri(
id_vi_tri int primary key not null auto_increment,
ten_vi_tri varchar(45)
);
create table trinh_do(
id_trinh_do int primary key not null auto_increment,
ten_trinh_do varchar(45)
);
create table bo_phan(
id_bo_phan int primary key not null auto_increment,
ten_bo_phan varchar(45)
);
create table kieu_thue(
id_kieu_thue int primary key not null auto_increment,
ten_kieu_thue varchar(45),
gia decimal(18,0)
);
create table loai_khach(
id_loai_khach int primary key not null auto_increment,
ten_loai_khach varchar(45)
);

create table dich_vu(
id_dich_vu int primary key not null auto_increment,
id_loai_dich_vu int,
id_kieu_thue int,
ten_dich_vu varchar(45),
dien_tich int,
so_tang int,
so_nguoi_toi_da varchar(45),
chi_phi_thue varchar(45),
trang_thai varchar(45),
constraint fk_id_loai_dich_vu_dich_vu foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu),
constraint fk_id_kieu_thue_dich_vu foreign key (id_kieu_thue) references kieu_thue(id_kieu_thue)
);



create table dich_vu_di_kem(
id_dich_vu_di_kem int primary key not null auto_increment,
id_dich_vu int ,
ten_dich_vu_di_kem varchar(45),
gia decimal(18,0),
donvi int,
trang_thai_kha_dung varchar(45),
constraint fk_id_dich_vu_di_kem
foreign key (id_dich_vu) references dich_vu(id_dich_vu)
);

create table khach_hang(
id_khach_hang int primary key not null auto_increment,
id_loai_khach int,
ho_ten varchar(45),
ngay_sinh date,
so_cmnd char(9),
sdt char(10),
email varchar(50),
dia_chi varchar(50),
constraint fk_id_loai_khach_hang_khach_hang
foreign key (id_loai_khach) references loai_khach(id_loai_khach)
);


create table nhan_vien(
id_nhan_vien int primary key not null auto_increment,
id_vi_tri int,
id_trinh_do int,
id_bo_phan int,
ho_ten varchar(50),
ngay_sinh date,
cmnd char(9),
luong decimal(18,0),
sdt char(11),
email varchar(45),
dia_chi varchar(45),

constraint fk_id_vi_tri_nhan_vien
foreign key(id_vi_tri) references vi_tri(id_vi_tri),

constraint fk_id_trinh_do_nhan_vien
foreign key (id_trinh_do) references trinh_do(id_trinh_do),

constraint fk_id_bo_phan_nhan_vien
foreign key (id_bo_phan) references bo_phan(id_bo_phan)
);



create table hop_dong(
id_hop_dong int primary key not null auto_increment,
id_nhan_vien int ,
id_khach_hang int,
id_dich_vu int,
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc decimal(18,0),
tong_tien decimal(18,0),

constraint fk_id_nhan_vien_hop_dong
foreign key (id_nhan_vien) references nhan_vien(id_nhan_vien),

constraint fk_id_khach_hang_hop_dong
foreign key (id_khach_hang) references khach_hang(id_khach_hang),

constraint fk_id_dich_vu_hop_dong
foreign key (id_dich_vu) references dich_vu(id_dich_vu)
);

create table hop_dong_chi_tiet(
id_hop_dong_chi_tiet  int primary key not null auto_increment,
id_hop_dong int,
id_dich_vu_di_kem int,
so_luong int,

constraint fk_id_hop_dong_hop_dong_chi_tiet
foreign key (id_hop_dong) references hop_dong(id_hop_dong),

constraint fk_id_dich_vu_di_kem_hop_dong_chi_tiet
foreign key (id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem)
);

insert into loai_khach
values  (1,'Diamond'),
		(2,'Platinium'),
		(3,'Gold'),
		(4,'Silver'),
		(5,'Member');

insert into khach_hang
values  (1,3,'Mai Văn Đạt','2000/09/18','181112345','1234567890','dat@gmail.com','Đà Nẵng'),
		(2,4,'Trần A','1999/10/12','181112345','1234567190',null,'Đà Nẵng'),
		(3,1,'Lê Trung Thông ','2002/07/18','181112845','1234563890','thong@gmail.com','Quảng Trị'),
		(4,5,'Đặng Văn Thuận','2001/12/30','181212345','1234567890','thuan@gmail.com','Huế'),
		(5,1,'Hồ Đức Thắng','2000/09/18','181532345','1238267890',null,'Quảng Ngãi'),
        (8,1,'Nguyễn Thị A','2000/09/18','181532345','1238267890',null,'Đà Nẵng');
insert into loai_dich_vu
values(1,'Villa'),
	  (2,'Room'),
	  (3,'House');

insert into kieu_thue
values (1,'year',500000),
	   (2,'month',600000),
	   (3,'day',700000);
insert into dich_vu
values (1,1,3,'Villa theo ngay',350,3,'15','150000000','Tot'),
	   (2,2,2,'Room theo tháng',120,4,'10','300000000','Tốt'),
 	   (3,3,3,'House theo ngày',241,6,'15','150000000','bình Thường'),
       (4,1,1,'Villa theo năm',350,3,'6','1500000000','Tốt'),
	   (5,3,1,'House theo năm',250,3,'15','250000000','Tot');
insert into dich_vu_di_kem
values  (1,1,'karaoke',350000,35000,'Chưa ai thuê'),
	   (2,2,'massage',150000,15000,'Đã có'),
	   (3,3,'thuê xe',750000,75000,'Chưa ai thuê'),
	   (4,4,'thức ăn',250000,25000,'Chưa ai thuê');

insert into trinh_do
values (1,'Đại học'),
	   (3,'Cao đẳng'),
	   (2,'trung cấp'),
	   (4,'Sau đại học');
insert into bo_phan
values (1,'Sale – Marketing'),
       (2,'Hành chính'),
       (3,'Quản lí'),
       (4,'Phục vụ');
insert into vi_tri
values (1,'Giám đốc'),
	   (2,'Quản lí'),
	   (3,'Giám sát'),
	   (4,'chuyên viên'),
	   (5,'phục vụ'),
	   (6,'Lễ tân');
insert into nhan_vien
values (1,6,3,4,'Văn Đức','2000/09/11','123456789',6000000,'12345678999','duc@gmail.com','Đà Nẵng'),
	   (2,1,1,2,'Nguyễn Hường','2000/09/18','123456787',100000000,'33345678999','huong@gmail.com','Quảng Trị'),
	   (3,5,2,4,'Trung Thông','2001/10/12','123456653',4000000,'33345678542','thong@gmail.com','Đà Nẵng'),
	   (4,5,2,4,'Văn Thuận','2001/10/12','123456653',10000000,'33345678111','thuan@gmail.com','Huế');
insert into hop_dong
values (1,4,5,1,'2019/03/02','2021/03/05',2000000,10000000),
	   (2,4,2,1,'2019/02/22','2021/03/01',2000000,11000000),
	   (3,3,4,2,'2019/03/29','2021/04/02',1500000,9000000),
	   (4,1,1,3,'2019/02/21','2021/02/25',1000000,80000000),
       (6,4,5,5,'2020/04/02','2021/04/02',3000000,20000000),
       (7,4,3,3,'2018/05/01','2018/05/20',3000000,20000000),
       (8,3,5,4,'2018/10/01','2018/11/20',4000000,50000000),
       (9,3,8,4,'2015/04/02','2015/07/20',4000000,50000000);
       
insert into hop_dong_chi_tiet
values (1,1,1,2),
	   (1,2,1,2);


