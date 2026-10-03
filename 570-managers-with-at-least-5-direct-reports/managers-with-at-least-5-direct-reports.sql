# Write your MySQL query statement below
SELECT b.name
FROM Employee e
JOIN Employee b
ON e.managerId=b.id
GROUP BY b.id, b.name
HAVING COUNT(e.id) >=5;