# 🧪 Test Cases  
### Project: Sachi-QA Portfolio – Jira Workflow Simulation  
### Module: Login & Authentication

This document contains detailed **test cases** derived from the Test Scenarios and Acceptance Criteria.  
Each test case includes steps, expected results, and traceability to scenarios.

---

# 🔐 Login Module – Test Cases

---

## **TC01 – Verify successful login with valid credentials**
**Scenario:** TS01  
**Precondition:** User is on the Login page  

### **Steps**
1. Enter valid username: `tomsmith`  
2. Enter valid password: `SuperSecretPassword!`  
3. Click the **Login** button  

### **Expected Result**
- User is redirected to the Secure Area page  
- Success message: *“You logged into a secure area!”* is displayed  

---

## **TC02 – Verify error message for invalid username**
**Scenario:** TS02  

### **Steps**
1. Enter invalid username  
2. Enter valid password  
3. Click the **Login** button  

### **Expected Result**
- Error message: *“Your username is invalid!”* is displayed  

---

## **TC03 – Verify error message for invalid password**
**Scenario:** TS03  

### **Steps**
1. Enter valid username  
2. Enter invalid password  
3. Click the **Login** button  

### **Expected Result**
- Error message: *“Your password is invalid!”* is displayed  

---

## **TC04 – Verify error message for blank username**
**Scenario:** TS04  

### **Steps**
1. Leave username field blank  
2. Enter valid password  
3. Click the **Login** button  

### **Expected Result**
- Error message is displayed indicating username is required  

---

## **TC05 – Verify error message for blank password**
**Scenario:** TS05  

### **Steps**
1. Enter valid username  
2. Leave password field blank  
3. Click the **Login** button  

### **Expected Result**
- Error message is displayed indicating password is required  

---

## **TC06 – Verify error message for both fields blank**
**Scenario:** TS06  

### **Steps**
1. Leave username field blank  
2. Leave password field blank  
3. Click the **Login** button  

### **Expected Result**
- Error message is displayed indicating both fields are required  

---

## **TC07 – Verify password masking**
**Scenario:** TS07  

### **Steps**
1. Click inside the password field  
2. Type any characters  

### **Expected Result**
- Characters appear as masked dots or asterisks  

---

## **TC08 – Verify “Forgot Password” navigation**
**Scenario:** TS08  

### **Steps**
1. Click the **Forgot Password** link  

### **Expected Result**
- User is redirected to the Password Reset page  

---

# 🔄 Password Reset Module – Test Cases

---

## **TC09 – Verify password reset with valid email**
**Scenario:** TS09  

### **Steps**
1. Enter a registered email  
2. Click **Submit**  

### **Expected Result**
- Confirmation message: *“Your e-mail’s been sent!”*  

---

## **TC10 – Verify error message for unregistered email**
**Scenario:** TS10  

### **Steps**
1. Enter an unregistered email  
2. Click **Submit**  

### **Expected Result**
- Error message indicating email not found  

---

## **TC11 – Verify error message for blank email**
**Scenario:** TS11  

### **Steps**
1. Leave email field blank  
2. Click **Submit**  

### **Expected Result**
- Validation message indicating email is required  

---

# 👤 Profile Module – Test Cases

---

## **TC12 – Verify user can view profile details**
**Scenario:** TS12  

### **Steps**
1. Log in with valid credentials  
2. Navigate to Profile page  

### **Expected Result**
- Profile details are displayed correctly  

---

## **TC13 – Verify user can update profile details**
**Scenario:** TS13  

### **Steps**
1. Log in  
2. Navigate to Profile page  
3. Edit profile fields  
4. Click **Save**  

### **Expected Result**
- Updated details are saved and displayed  

---

## **TC14 – Verify validation messages for invalid profile inputs**
**Scenario:** TS14  

### **Steps**
1. Log in  
2. Navigate to Profile page  
3. Enter invalid data (e.g., numbers in name field)  
4. Click **Save**  

### **Expected Result**
- Appropriate validation messages are displayed  

---

# 🔐 Logout Module – Test Cases

---

## **TC15 – Verify successful logout**
**Scenario:** TS15  

### **Steps**
1. Log in  
2. Click **Logout**  

### **Expected Result**
- User is redirected to Login page  
- Session is terminated  

---

## **TC16 – Verify restricted pages cannot be accessed after logout**
**Scenario:** TS16  

### **Steps**
1. Log in  
2. Log out  
3. Attempt to access secure page via URL  

### **Expected Result**
- User is redirected to Login page  
- Access is denied  

---

# 📌 Summary

These test cases provide detailed, step‑by‑step validation of all functional flows in the Login, Password Reset, Profile, and Logout modules.  
They are linked to Test Scenarios and Acceptance Criteria for full traceability.
