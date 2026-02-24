-- Verify that all completed orders have a non-null payment_id
SELECT id, payment_id
FROM orders
WHERE status = 'COMPLETED'
  AND payment_id IS NULL;

-- Check that product prices are not negative
SELECT id, name, price
FROM products
WHERE price < 0;
