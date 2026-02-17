# 📊 Test Summary Report – Sprint 1

**Project:** Jira Workflow Simulation  
**Tester:** Sachi  
**Sprint:** 1  
**Environment:** QA Environment (Build 1.0.3)  
**Execution Type:** Manual UI + API  
**Date:** 16 Feb 2026  

This Test Summary Report provides a high‑level overview of testing activities, results, defects, risks, and recommendations for Sprint 1.

---

## 📘 1. Test Objectives

- Validate core login, profile, and password reset functionality  
- Verify API authentication and error handling  
- Ensure end‑to‑end flows meet acceptance criteria  
- Identify defects early to support development team  
- Provide clear traceability from requirements to execution  

---

## 📋 2. Scope of Testing

### ✔ In Scope
- UI Login functionality  
- Password reset flow  
- Profile page access  
- Authentication API  
- Negative test scenarios  
- Validation checks  

### ❌ Out of Scope
- Performance testing  
- Security penetration testing  
- Cross‑browser testing  
- Mobile responsiveness  
- Non‑functional requirements  

---

## 🧪 3. Test Execution Summary

| Status   | Count |
|----------|--------|
| Passed   | 5 |
| Failed   | 2 |
| Blocked  | 1 |
| Not Run  | 0 |

A total of **8 test cases** were executed during Sprint 1.

---

## 🐞 4. Defect Summary

| Defect ID | Title | Severity | Status |
|-----------|--------|----------|--------|
| BUG‑003 | Incorrect error message for invalid login | Medium | Open |
| BUG‑007 | API returns 500 instead of 401 | Critical | Open |
| ENV‑12 | Profile service down | Blocker | In Progress |

### Key Notes
- API defect (BUG‑007) impacts both API and UI login validation  
- ENV‑12 prevented execution of profile‑related test cases  
- No regression defects identified in password reset flow  

---

## 📝 5. Risks & Issues

### ⚠ Current Risks
- **API instability** may cause further delays in UI testing  
- **Environment reliability** is inconsistent (ENV‑12)  
- **Error handling gaps** could affect user experience  

### ⚠ Potential Impact
- Delayed sprint completion  
- Increased retesting effort  
- Possible spillover into Sprint 2  

---

## 📌 6. Recommendations

- Prioritise fixing **BUG‑007** (API error handling)  
- Resolve **ENV‑12** before next test cycle  
- Re‑execute failed and blocked test cases after fixes  
- Strengthen validation logic for login and error messages  
- Conduct a short regression cycle once defects are resolved  

---

## 📈 7. Overall Assessment

Sprint 1 testing achieved **partial completion** due to environment and API issues.  
Core functionality such as password reset and valid login is stable, but critical defects must be addressed before moving forward.

Testing will continue in Sprint 2 with a focus on:
- Re‑testing fixed defects  
- Completing blocked scenarios  
- Expanding coverage to additional modules  

---

## ✔ 8. Conclusion

Testing for Sprint 1 provided valuable insights into system stability and highlighted key areas requiring improvement. With timely defect resolution and environment stabilisation, the project is on track for successful progression into Sprint 2.
