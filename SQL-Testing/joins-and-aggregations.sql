-- Orders with user details
SELECT o.id AS order_id,
       u.name AS customer_name,
       o.total_amount,
       o.status
FROM orders o
INNER JOIN users u ON o.user_id = u.id
WHERE o.status = 'COMPLETED';

-- Count orders per user (used to validate business rule)
SELECT user_id,
       COUNT(*) AS total_orders
FROM orders
GROUP BY user_id
HAVING COUNT(*) >= 5;
