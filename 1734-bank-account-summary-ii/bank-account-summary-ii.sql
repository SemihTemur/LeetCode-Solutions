-- Write your PostgreSQL query statement below
SELECT u.name AS name,SUM(t.amount) AS balance FROM Users u
INNER JOIN Transactions t on t.account = u.account
GROUP BY u.account,u.name HAVING(SUM(t.amount)>10000)