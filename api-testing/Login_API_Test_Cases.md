# Login API – Test Cases

## Test Case 1: Valid Login
Endpoint: POST /api/login
Request Body:
{ "username": "validUser", "password": "validPass" }

Expected Result:
- Status Code: 200
- Response contains a non-empty "token" field

---

## Test Case 2: Invalid Password
Endpoint: POST /api/login
Request Body:
{ "username": "validUser", "password": "wrongPass" }

Expected Result:
- Status Code: 401
- Response contains "error": "Invalid credentials"

---

## Test Case 3: Missing Fields
Endpoint: POST /api/login
Request Body:
{ }

Expected Result:
- Status Code: 400
- Response contains "error": "Username and password required"
