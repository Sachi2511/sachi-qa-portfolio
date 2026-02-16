# Acceptance Criteria

Acceptance criteria define the conditions that must be met for a user story to be considered complete.

---

## User Story: US-001 (Login Functionality)

### Acceptance Criteria
- User must enter a valid username and password
- System must validate credentials against the database
- Successful login redirects user to dashboard
- Invalid login shows an error message
- Login API must return correct status codes

---

## User Story: US-002 (Profile Update)

### Acceptance Criteria
- User can update name, email, and phone number
- System must validate email format
- Changes must be saved in the database
- User receives confirmation message

---

## User Story: US-003 (Password Reset)

### Acceptance Criteria
- User enters registered email
- System sends password reset link
- Link must expire after 30 minutes
- User can set a new password successfully

---

## User Story: US-004 (Login API Token Generation)

### Acceptance Criteria
- API must return status code 200 for valid credentials
- API must return a non-empty token
- API must return 401 for invalid credentials
- Token must expire after configured time
