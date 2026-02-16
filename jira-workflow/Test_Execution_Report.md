# 🧪 Test Execution Report – Sprint 1

**Project:** Jira Workflow Simulation  
**Tester:** Sachi
**Environment:** QA Environment (Build 1.0.3)  
**Execution Type:** Manual UI + API  
**Date:** 14 Feb 2026  

---

## 📊 1. Test Execution Summary

| Status   | Count |
|----------|--------|
| Passed   | 5 |
| Failed   | 2 |
| Blocked  | 1 |
| Not Run  | 0 |

---

## 📘 2. Detailed Test Execution Results

### 🔵 UI Test Cases

| Test Case ID | Status | Actual Result | Defect ID | Comments |
|--------------|--------|---------------|-----------|----------|
| **TC‑LOGIN‑001** | Passed | User logged in successfully with valid credentials | — | Working as expected |
| **TC‑LOGIN‑002** | Failed | Incorrect error message shown for invalid login | BUG‑003 | Validation issue |
| **TC‑PROFILE‑001** | Blocked | Profile page not loading (HTTP 500) | — | Environment issue (ENV‑12) |
| **TC‑RESET‑001** | Passed | Reset link sent to registered email | — | Email received |
| **TC‑RESET‑002** | Passed | User reset password and logged in with new password | — | Flow working |

---

### 🟣 API Test Cases

| Test Case ID | Status | Actual Result | Defect ID | Comments |
|--------------|--------|---------------|-----------|----------|
| **API‑TC‑001** | Passed | API returned 200 with valid JWT token | — | Response time 180ms |
| **API‑TC‑003** | Failed | API returned 500 instead of 401 for invalid login | BUG‑007 | Critical issue |

---

## 🐞 3. Defects Raised

| Defect ID | Title | Severity | Priority | Status | Linked Test Case |
|-----------|--------|----------|----------|---------|------------------|
| **BUG‑003** | Incorrect error message for invalid login | Medium | High | Open | TC‑LOGIN‑002 |
| **BUG‑007** | API returns 500 instead of 401 | Critical | High | Open | API‑TC‑003 |
| **ENV‑12** | Profile service down | Blocker | High | In Progress | TC‑PROFILE‑001 |

---

## 📝 4. Key Observations

- API login error impacts UI login validation.  
- Profile module outage caused one test to be blocked.  
- Password reset flow is stable.  
- API performance is within acceptable limits.

---

## 📌 5. Recommendations

- Fix API error handling (BUG‑007) as priority.  
- Resolve environment issue (ENV‑12) before next cycle.  
- Re‑run failed and blocked test cases after fixes.  
