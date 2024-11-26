# Write your MySQL query statement below
Select firstName, lastName, city, state
FROM 
    Person
    Left join Address using (personId);
