
-- Display all the information of the EMP table?
-- Display all the information from all Tables

select * from dept;
select * from branch;
select * from emp;

================================================================================
-- Display unique Jobs from EMP table?

select job from emp group by job;

================================================================================
-- List the emps in the asc order of their Salaries?

select * from emp order by sal;
select empno,ename,job,sal,deptno from emp;

================================================================================
-- List the details of the emps in asc order of the Dptnos and desc of Jobs?

select * from emp group by job order by deptno,job;
select deptno,job,empno,ename,sal from emp order by deptno,job;

================================================================================
-- Display all the unique job groups in the descending order?

select job from emp group by job order by job desc;

================================================================================
-- Display all the details of all ‘Mgrs’

select mgr,deptno,empno,ename from emp;
select mgr from emp;
select mgr from emp order by mgr;
select * from emp where mgr in (select mgr from emp );  
================================================================================
-- List the emps who joined before 1981 

select * from emp where hiredate<('01-01-1981');

================================================================================
-- List the Empno, Ename, Sal, Daily sal of all emps in the asc order of Annsal

select empno,ename,sal,sal*12 as annsal,sal/30 as daily_sal from emp order by annsal;

================================================================================
-- Display the Empno, Ename, job, Hiredate, Exp of all Mgrs

select empno,ename,job,hiredate,trunc(months_between(sysdate,hiredate)/12) as exp from emp where mgr is not null;

================================================================================
-- List the Empno, Ename, Sal, Exp of all emps working for Mgr 7369
-- no data available like mgr=7369

select empno,ename,sal,trunc(months_between(sysdate,hiredate)/12) as exp from emp where mgr=7369;

================================================================================
-- Display all the details of the emps whose Comm  Is more than their Sal

select * from emp where sal<comm;

================================================================================
-- List the emps along with their Exp and Daily Sal is more than Rs 100

select empno,ename,sal,trunc(months_between(sysdate,hiredate)/12) as exp,sal/30 as dsal from emp where (sal/30)>100;

================================================================================
-- List the emps who are either ‘CLERK’ or ‘ANALYST’ in the Desc order

select empno,ename,job from emp where job='CLERK' or job='ANALYST' order by job desc;

================================================================================
-- List the emps who joined on 1-MAY-81,3-DEC-81,17-DEC-81,19-JAN-80 in asc order of seniority

select empno,ename,job,hiredate from emp where hiredate='1-may-81' or hiredate='3-dec-81' or hiredate='17-dec-81' or hiredate='19-dec-80' order by hiredate;
select empno,ename,job,hiredate from emp where hiredate in ('1-may-81','3-dec-81','17-dec-81','19-dec-80') order by hiredate;

================================================================================
-- List the emp who are working for the Deptno 10 or20

select * from emp where deptno in (10,20);

================================================================================
-- List the emps who are joined in the year 81

select * from emp where to_char(hiredate,'yy')=81;

================================================================================
-- List the emps Who Annual sal ranging from 22000 and 45000

select empno,ename,job,sal,sal*12 as annsal from emp where sal*12 between 22000 and 45000;

================================================================================
-- List the Enames those are having five characters in their Names

select empno,ename from emp where length(ename)=5;

================================================================================
-- List the Enames those are starting with ‘S’ and with five characters

select empno,ename from emp where ename like 'S%' and length(ename)=5;

================================================================================
-- List the emps those are having four chars and third character must be ‘r’

select empno,ename from emp where ename like '__R%' and length(ename)=4;

================================================================================
-- List the Five character names starting with ‘S’ and ending with ‘H’

select empno,ename from emp where ename like 'S%H' and length(ename)=5;

================================================================================
-- List the emps who joined in January

select * from emp where to_char(hiredate,'mon')='jan';

================================================================================
-- List the emps whose names having a character set ‘ll’ together

select * from emp where length(ename)=11;
select * from emp where length(ename)=10;

================================================================================
-- List the emps who does not belong to Deptno 20

select * from emp where deptno!=20;

================================================================================
-- List all the emps except ‘PRESIDENT’ & ‘MGR' in asc order of Salaries

select * from emp where job not in ('PRESIDENT','MANAGER') order by sal;

================================================================================
-- List the emps whose Empno not starting with digit78

select * from emp where trim(to_char(empno,'9999')) not like '78%';

================================================================================
-- List the emps who are working under ‘MGR’

select * from emp where job='MANAGER';
select * from emp where mgr is not null;

================================================================================
-- List the emps who joined in any year but not belongs to the month of March

select * from emp where to_char(hiredate,'mon')!='mar';

================================================================================
-- List all the Clerks of Deptno 20

select * from emp where job='CLERK' and deptno=20;

================================================================================
-- List the emps of Deptno 30 or 10 joined in the year 1981

select * from emp where to_char(hiredate,'yy')=81 and deptno in (30,10) order by deptno;

================================================================================
-- Display the details of SMITH

select * from emp where ename='SMITH';

================================================================================
-- Display the location of SMITH

select location from branch where branchno=(select branchno from emp where ename='SMITH');

================================================================================
