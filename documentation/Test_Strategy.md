# Test Strategy

## 1. Introduction
The Test Strategy defines the overall testing approach for the application. It outlines the testing levels, types, tools, environments, and responsibilities involved in the testing process.

## 2. Testing Levels
- **Unit Testing** – Performed by developers
- **Integration Testing** – Ensures modules work together
- **System Testing** – End-to-end validation of the application
- **User Acceptance Testing (UAT)** – Final validation by business users

## 3. Testing Types
- **Functional Testing**
- **Regression Testing**
- **Smoke Testing**
- **API Testing**
- **UI Testing**
- **Compatibility Testing**
- **Usability Testing**

## 4. Test Approach
### Manual Testing
- Used for UI validation, exploratory testing, and new feature testing
- Test cases will be created and executed manually

### Automation Testing
- Selenium + TestNG will be used for regression and smoke suites
- Page Object Model (POM) will be followed
- Reports generated using ExtentReports

### API Testing
- Performed using Postman
- Includes positive, negative, and boundary scenarios

## 5. Test Environment
- **Environment:** QA/Staging
- **Browsers:** Chrome, Firefox, Edge
- **API Tools:** Postman
- **Automation Tools:** Selenium WebDriver, TestNG, Maven

## 6. Test Data Strategy
- Test data will be created manually and stored in a shared location
- Sensitive data will be masked
- Reusable test data sets will be maintained

## 7. Defect Management
- Defects will be logged in Jira
- Severity and priority will be assigned
- Defect lifecycle: New → Open → In Progress → Fixed → Retest → Closed

## 8. Roles and Responsibilities
- **QA Engineer:** Test case creation, execution, bug reporting
- **Automation QA:** Script development, maintenance, regression suite execution
- **Developer:** Fixing defects, unit testing
- **Product Owner:** Requirement clarification, UAT approval

## 9. Risks and Mitigation
### Risks
- Unclear requirements
- Delayed builds
- Environment downtime

### Mitigation
- Early requirement discussions
- Daily sync with developers
- Backup test environment

## 10. Tools Used
- Selenium WebDriver
- TestNG
- Maven
- Postman
- Jira
- ExtentReports

## 11. Approval
- QA Lead
- Product Owner
- Project Manager
