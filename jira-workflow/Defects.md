# 🐞 Defects Report – Sprint 1

This document contains all defects identified during the execution of Sprint 1 test cases.  
Each defect follows a Jira‑style structure with clear traceability to test cases and user stories.

---

## 🐞 BUG‑003 – Incorrect Error Message for Invalid Login

**Defect ID:** BUG‑003  
**Module:** Login (UI)  
**Severity:** Medium  
**Priority:** High  
**Status:** Open  
**Linked Test Case:** TC‑LOGIN‑002  
**Linked User Story:** US‑001  

### 📌 Description  
When a user enters invalid login credentials, the application displays a generic error message instead of the expected validation message.

### 🧪 Steps to Reproduce  
1. Navigate to the login page  
2. Enter an invalid username and/or password  
3. Click the **Login** button  

### ✔ Expected Result  
A clear validation message should appear:  
**“Invalid username or password.”**

### ❌ Actual Result  
A generic error message is displayed with no clear explanation.

### 📎 Evidence  
N/A (UI behaviour observed during execution)

---

## 🐞 BUG‑007 – API Returns 500 Instead of 401 for Invalid Login

**Defect ID:** BUG‑007  
**Module:** Login API  
**Severity:** Critical  
**Priority:** High  
**Status:** Open  
**Linked Test Case:** API‑TC‑003  
**Linked User Story:** US‑004  

### 📌 Description  
The Login API returns a **500 Internal Server Error** when invalid credentials are provided.  
It should return a **401 Unauthorized** response with an appropriate error message.

### 🧪 Steps to Reproduce  
1. Send a POST request to `/api/login`  
2. Use invalid username/password  
3. Inspect the API response  

### ✔ Expected Result  
- HTTP Status: **401**  
- Body: `{ "error": "Invalid credentials" }`

### ❌ Actual Result  
- HTTP Status: **500**  
- Body: Server error response  

### 📎 Evidence  
N/A (API response captured during execution)

---

## 🐞 ENV‑12 – Profile Service Down (HTTP 500)

**Defect ID:** ENV‑12  
**Module:** Profile Service / Backend  
**Severity:** Blocker  
**Priority:** High  
**Status:** In Progress (DevOps)  
**Linked Test Case:** TC‑PROFILE‑001  
**Linked User Story:** US‑002  

### 📌 Description  
The Profile page fails to load due to a backend service outage.  
This prevents execution of all profile‑related test cases.

### 🧪 Steps to Reproduce  
1. Log in with a valid user  
2. Navigate to **My Profile**  
3. Observe the page load failure  

### ✔ Expected Result  
Profile page should load successfully and allow editing of user information.

### ❌ Actual Result  
- HTTP Status: **500**  
- Page displays “Service unavailable”  

### 📎 Evidence  
N/A (Environment issue confirmed by DevOps)

---

# 📊 Defect Summary

| Defect ID | Severity | Priority | Status | Linked Test Case |
|-----------|----------|----------|--------|------------------|
| BUG‑003 | Medium | High | Open | TC‑LOGIN‑002 |
| BUG‑007 | Critical | High | Open | API‑TC‑003 |
| ENV‑12 | Blocker | High | In Progress | TC‑PROFILE‑001 |

---

# 📌 Notes  
- API defect (BUG‑007) impacts UI login validation.  
- ENV‑12 must be resolved before re‑executing profile test cases.  
- All defects logged in Jira‑style format for clarity and traceability.
