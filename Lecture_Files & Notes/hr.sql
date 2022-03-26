GRANT create session TO c##erpuser;
GRANT create table TO  c##erpuser;
GRANT create view TO c##erpuser;
GRANT create any trigger TO c##erpuser;
GRANT create any procedure TO c##erpuser;
GRANT create sequence TO c##erpuser;
GRANT create synonym TO c##erpuser;
GRANT ALL PRIVILEGES TO c##erpuser;

GRANT CONNECT TO c##erpuser;
GRANT RESOURCE TO c##erpuser;
GRANT DBA TO c##erpuser;

connect c##erpuser/root

select * from branch;
select * from emp;
select * from dept;

-- Display all records from dept
select * from dept;

-- Display all records from branch
select * from dept;

--select all records from employee table;
select * from emp;

