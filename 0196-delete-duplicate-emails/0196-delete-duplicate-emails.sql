# Write your MySQL query statement below
delete from Person 
where id not in (select min(id) from (select * from Person) as p group by email);