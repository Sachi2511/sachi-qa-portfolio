# Automation Framework

This section contains my Java + Selenium + TestNG automation framework.
It is kept separate from the manual UI/API testing sprint to clearly demonstrate automation skills.

## 🎥 Automation Demo (YouTube)

**Watch the end‑to‑end Selenium automation demo here:**  
👉 **[YouTube Video Link](https://youtu.be/5SgnmkcjBAY)**

This video shows the execution of my Selenium WebDriver test for the Swag Labs application.  
The test is triggered from the command line using Maven (`mvn test`), demonstrating a CI/CD‑ready workflow similar to Jenkins, GitHub Actions, and Azure DevOps pipelines.  
The flow includes login validation, product selection, cart verification, checkout steps, and ExtentReports‑based reporting.

**Watch the Parallel Execution Demo (3 Selenium Tests running simultaneously):**   
👉 **[YouTube Video Link](https://youtu.be/mluwpqzVyF4)**  
This video demonstrates parallel execution of Selenium WebDriver tests using Java, TestNG, and Maven, showcasing how multiple automated tests can run simultaneously for faster, scalable execution. The setup mirrors real CI/CD pipelines and highlights how this framework is designed for modern automation environments.  
The suite includes three independent tests, each validating a different functional area of the Swag Labs application:  
**Test 1 — End‑to‑End User Journey**  
A complete flow covering login, adding a product to the cart, and proceeding to checkout. This test represents a typical high‑value regression scenario and demonstrates stable UI automation.  
**Test 2 — Cart Item Count Verification**  
A focused functional test that adds a single item to the cart and asserts that exactly one item is present. This ensures cart logic and state management work as expected.  
**Test 3 — Sorting by Price (Low → High)**  
A UI behaviour test that applies the “Price: Low to High” filter and verifies that products are sorted correctly. This validates both UI updates and underlying sorting logic.  
Parallel Execution + Maven Command Line  
All tests are executed in parallel using TestNG’s configuration and a ThreadLocal WebDriver setup.
The video also shows the suite being triggered from the command line using Maven (mvn test), demonstrating how easily it integrates with CI/CD tools such as Jenkins, GitHub Actions, Azure DevOps, and GitLab CI.  

## 🔹 Components

- [Page Object Model](docs/page_object_model.md)
- [TestNG Suite](docs/testng_suite.md)
- [Maven Project Structure](docs/maven_structure.md)
- [ExtentReports](docs/extentreports.md)
- [Sample Test Scripts](docs/sample_tests.md)

  ---

## 📁 Framework Structure
/automation 
├── docs 
│   ├── extent-reports.md 
│   ├── maven-structure.md 
│   ├── page-object-model.md 
│   ├── sample-tests.md 
│   └── testng-suite.md 
│ 
└── framework 
    ├── pom.xml 
    ├── testng.xml 
    └── src 
        ├── main/java/Practice 
        │   ├── DriverFactory1.java 
        │   ├── CommonActions.java 
        │   ├── Login.java 
        │   └── reporting 
        │       ├── ExtentManager.java 
        │       └── ExtentTestManager.java 
        │ 
        └── test/java/Practice 
            ├── BaseTest.java 
            ├── LoginTest.java 
            └── listeners 
                └── TestListener.java 

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
