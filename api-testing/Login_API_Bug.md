# Bug Report: Login API Returns 200 for Invalid Password

Bug ID: API_LOGIN_001
Severity: High
Environment: QA Server, Postman
Endpoint: POST /api/login

## Steps to Reproduce
1. Send a POST request with:
   { "username": "validUser", "password": "wrongPass" }
2. Observe the response.

## Expected Result
- Status Code: 401 Unauthorized
- Response body: "Invalid credentials"

## Actual Result
- Status Code: 200 OK
- Response body contains a token

## Impact
- Security risk: invalid credentials are treated as valid
- Users can gain access without correct password

## Suggested Fix
- Update backend logic to return 401 for invalid credentials
