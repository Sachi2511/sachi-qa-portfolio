-- Get all active users
SELECT id, name, email
FROM users
WHERE status = 'ACTIVE'
ORDER BY created_at DESC;

-- Find a specific user by email (used to verify registration)
SELECT *
FROM users
WHERE email = 'test.user1@example.com';
