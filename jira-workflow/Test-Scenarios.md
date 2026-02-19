# 🧪 Test Scenarios  
### Project: Sachi-QA Portfolio – Jira Workflow Simulation  
### Module: Login & Authentication

This document outlines the high‑level **test scenarios** derived from the User Stories and Acceptance Criteria.  
Each scenario represents a functional flow that will later be expanded into detailed test cases.

---

## 🔐 Login Module – Test Scenarios

### **TS01 – Verify successful login with valid credentials**
- User enters a valid username and valid password  
- User is redirected to the secure dashboard  
- Success message is displayed  

### **TS02 – Verify error message for invalid username**
- User enters an invalid username and valid password  
- Appropriate error message is displayed  

### **TS03 – Verify error message for invalid password**
- User enters a valid username and invalid password  
- Appropriate error message is displayed  

### **TS04 – Verify error message for blank username**
- User leaves username field empty  
- Attempts login  
- System displays validation message  

### **TS05 – Verify error message for blank password**
- User leaves password field empty  
- Attempts login  
- System displays validation message  

### **TS06 – Verify login attempt with both fields blank**
- User leaves both fields empty  
- Attempts login  
- System displays validation message  

### **TS07 – Verify password masking**
- Password field hides characters as the user types  

### **TS08 – Verify “Forgot Password” navigation**
- User clicks “Forgot Password”  
- System redirects to password reset page  

---

## 🔄 Password Reset Module – Test Scenarios

### **TS09 – Verify password reset with valid email**
- User enters a registered email  
- System sends reset instructions  

### **TS10 – Verify error message for unregistered email**
- User enters an email not in the system  
- System displays appropriate error  

### **TS11 – Verify error message for blank email**
- User leaves email field empty  
- Attempts to submit  
- System displays validation message  

---

## 👤 Profile Module – Test Scenarios

### **TS12 – Verify user can view profile details**
- User logs in  
- Navigates to profile page  
- Profile information is displayed correctly  

### **TS13 – Verify user can update profile details**
- User edits profile fields  
- Saves changes  
- Updated information is displayed  

### **TS14 – Verify validation messages for invalid profile inputs**
- User enters invalid data  
- System displays appropriate validation messages  

---

## 🔐 Logout Module – Test Scenarios

### **TS15 – Verify successful logout**
- User clicks logout  
- System ends session  
- User is redirected to login page  

### **TS16 – Verify restricted pages cannot be accessed after logout**
- User logs out  
- Attempts to access secure pages via URL  
- System redirects to login page  

---

## 📌 Summary

These scenarios provide a high‑level view of the functional flows to be tested.  
Each scenario will be expanded into detailed test cases in the **Test-Cases.md** file and linked back to Acceptance Criteria in **Linked-Test-Cases.md**.
