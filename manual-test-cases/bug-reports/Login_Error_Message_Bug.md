# Bug Report: Incorrect Error Message on Invalid Login

**Bug ID:** BUG_LOGIN_001  
**Severity:** Medium  
**Environment:** Chrome 120, Windows 11  
**Module:** Login Page  

## Steps to Reproduce
1. Navigate to the login page
2. Enter a valid username
3. Enter an invalid password
4. Click "Login"

## Expected Result
User should see:  
**"Invalid username or password."**

## Actual Result
User sees:  
**"Something went wrong. Try again later."**

## Notes
- The error message is misleading
- No API failure occurred in the backend

## Attachments
*(Screenshot placeholder)*
