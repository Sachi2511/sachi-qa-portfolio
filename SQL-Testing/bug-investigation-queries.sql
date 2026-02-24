-- Investigate duplicate user accounts by email
SELECT email, COUNT(*) AS duplicates
FROM users
GROUP BY email
HAVING COUNT(*) > 1;

-- Investigate orders stuck in PENDING for more than 24 hours
SELECT id, user_id, status, created_at
FROM orders
WHERE status = 'PENDING'
  AND created_at < NOW() - INTERVAL '24 HOURS';
