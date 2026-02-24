-- Insert test user
INSERT INTO users (name, email, status)
VALUES ('Test User', 'test.user1@example.com', 'ACTIVE');

-- Insert test product
INSERT INTO products (name, price, stock)
VALUES ('Test Product', 9.99, 100);

-- Clean up test data
DELETE FROM users
WHERE email = 'test.user1@example.com';
