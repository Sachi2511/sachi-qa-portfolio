# Requirements Traceability Matrix (RTM)

The RTM ensures that all requirements are covered by test cases and that defects can be traced back to specific requirements.

## Purpose of RTM
- To ensure complete test coverage
- To track requirement-to-test mapping
- To identify gaps early
- To link defects to impacted requirements

## RTM Table

| Requirement ID | Requirement Description              | Test Case ID(s)           | Defect ID(s)        | Status     |
|----------------|--------------------------------------|----------------------------|----------------------|------------|
| REQ-001        | User should be able to log in        | TC-LOGIN-001, TC-LOGIN-002 | BUG_LOGIN_001       | Completed  |
| REQ-002        | Invalid login should show error      | TC-LOGIN-003               | BUG_LOGIN_001       | Completed  |
| REQ-003        | User should be able to update profile| TC-PROFILE-001            | None                | In Progress|
| REQ-004        | API should return valid token        | API-TC-001                | API_LOGIN_001       | Completed  |
| REQ-005        | Missing fields should return 400     | API-TC-003                | None                | Completed  |

## Notes
- RTM is updated throughout the project lifecycle
- Helps ensure no requirement is left untested
- Supports impact analysis during defect fixes
