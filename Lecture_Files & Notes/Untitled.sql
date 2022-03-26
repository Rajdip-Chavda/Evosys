create table account
(
    acc_no number(3) Primary key,
    acc_name char(30) not null,
    acc_dob date not null,
    acc_op_date date not null,
    acc_balance number(11,2) not null,
    acc_type char(1) not null,
    acc_status char(1) not null,
    acc_chk_flag number(1) not null,
    acc_gender char(1) not null
) 

insert into account values(1,'samir','10/05/1975','10/05/1996',530000,'s','0',1,'m');
insert into account values('&acc_no','&acc_name','&acc_dob','&acc_op_date','&acc_balance','&acc_type','&acc_status','&acc_chk_flag','&acc_gender');

