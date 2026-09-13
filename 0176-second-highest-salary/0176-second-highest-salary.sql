# Write your MySQL query statement below
SELECT max(salary) as SecondHighestSalary
From Employee
Where salary<(SELECT Max(salary) from Employee);