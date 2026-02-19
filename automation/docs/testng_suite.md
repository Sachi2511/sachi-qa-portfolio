# 🧩 TestNG Suite (testng.xml)

This document explains how the TestNG suite file (`testng.xml`) is used in this automation framework.

The suite file controls:

- Which tests run  
- In what order  
- Under which groups  
- With what configuration  

It acts as the **entry point** for executing the entire automation suite.

---

## 📁 Location of testng.xml

The suite file is stored under:
/automation/framework/testng.xml

---

## 🧩 Purpose of testng.xml

The TestNG suite file allows you to:

- Run specific test classes  
- Run multiple classes together  
- Organize tests into groups  
- Control parallel execution (optional)  
- Integrate with CI/CD tools  

In this framework, the suite file is kept simple and clean for readability.

---

## 📄 Example testng.xml (Used in This Framework)

```xml
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Automation Suite">

    <test name="Login Tests">
        <classes>
            <class name="Practice.LoginTest"/>
        </classes>
    </test>

</suite>
```
## 🧠 Key Concepts Demonstrated
✔ Suite Level:
The <suite> tag defines the entire automation suite.
✔ Test Level:
The <test> tag groups related test classes.
Here, we have a single group: Login Tests.
✔ Class Level:
The <class> tag specifies which Java test class to run:
Practice.LoginTest


This must match the package + class name exactly.

## 🏆 Best Practices Followed
- Simple and readable suite structure
- Only required classes included
- No unnecessary parallel execution
- No hard‑coded browser settings inside XML
- Clean separation between:
- Test logic (LoginTest)
- Page logic (Login)
- Driver logic (DriverFactory1)
- Suite configuration (testng.xml)

## ▶️ How to Run the Suite
You can run the suite in multiple ways:
1. Using IntelliJ / Eclipse
Right‑click testng.xml → Run
2. Using Maven
If TestNG is configured in pom.xml, run:
mvn test
3. Using CI/CD (Jenkins, GitHub Actions)
Point the runner to:
automation/framework/testng.xml

## 📌 Summary
The testng.xml file is the central configuration file that controls how automated tests are executed.
In this framework, it is kept clean and minimal, running only the LoginTest class as a demonstration of:
- TestNG
- Page Object Model
- BaseTest
- DriverFactory1
---
