/* Write your T-SQL query statement below */
select d.name as Department, e.name as Employee, e.salary as Salary
from Employee e join Department d
on e.departmentId = d.id
where e.salary=(
    select max(e2.Salary) from Employee e2
    where e2.departmentId = e.departmentId
);