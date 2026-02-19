# Automation Framework

This section contains my Java + Selenium + TestNG automation framework.
It is kept separate from the manual UI/API testing sprint to clearly demonstrate automation skills.

## 🔹 Components

- [Page Object Model](docs/page_object_model.md)
- [TestNG Suite](docs/testng_suite.md)
- [Maven Project Structure](docs/maven_structure.md)
- [ExtentReports](docs/extentreports.md)
- [Sample Test Scripts](docs/sample_tests.md)

  ---

## 📁 Framework Structure
/automation ├── docs │     ├── extent-reports.md │     ├── maven-structure.md │     ├── page-object-model.md │     ├── sample-tests.md │     └── testng-suite.md │ └── framework ├── pom.xml ├── testng.xml └── src ├── main/java/Practice │       ├── DriverFactory1.java │       ├── CommonActions.java │       └── Login.java │ └── test/java/Practice ├── BaseTest.java └── LoginTest.java

---
## 🔧 Key Features

- Page Object Model (POM)
- ThreadLocal DriverFactory for parallel-safe WebDriver
- BaseTest for setup/teardown
- CommonActions for explicit waits
- TestNG for structured execution
- Maven for dependency management
- Ready for ExtentReports integration

---

## ▶️ How to Run Tests

### **Run via IntelliJ/Eclipse**
Right‑click `testng.xml` → Run

### **Run via Maven**
mvn test

### **Run via CI/CD**
Point the pipeline to:
automation/framework/testng.xml

---
## 📌 Summary

This automation framework demonstrates:
- Strong understanding of automation architecture  
- Ability to build modular, scalable frameworks  
- Clean coding practices  
- Practical use of Selenium, TestNG, Maven, and POM  

It complements the manual testing project and provides a complete picture of my QA skill set.
