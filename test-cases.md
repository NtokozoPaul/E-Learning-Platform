
# Test Cases – E-Learning Platform

This document outlines the test scenarios to validate system functionality and quality attributes.

---

## ✅ Functional Test Cases

| Test Case ID | Requirement ID | Description                        | Steps                                                                 | Expected Result                                              | Actual Result | Status |
|--------------|----------------|------------------------------------|-----------------------------------------------------------------------|--------------------------------------------------------------|----------------|--------|
| TC-001       | FR1            | User login                         | 1. Go to login page<br>2. Enter valid credentials<br>3. Click Login  | User is redirected to the dashboard                          | -              | -      |
| TC-002       | FR2            | Enroll in course                   | 1. Login as student<br>2. Open course catalog<br>3. Click Enroll     | Enrollment success message is shown                          | -              | -      |
| TC-003       | FR3            | Submit assignment                  | 1. Login<br>2. Navigate to assignment<br>3. Upload and submit file   | Assignment submitted and confirmation shown                  | -              | -      |
| TC-004       | FR4            | Grade assignment                   | 1. Login as instructor<br>2. View submissions<br>3. Assign grade     | Grade is saved and visible to student                        | -              | -      |
| TC-005       | FR5            | Create/edit course                 | 1. Login as instructor<br>2. Click "Create Course"<br>3. Save form   | Course appears in instructor’s course list                   | -              | -      |
| TC-006       | FR7            | Make payment                       | 1. Enroll in paid course<br>2. Enter payment details<br>3. Confirm   | Payment is processed and receipt shown                       | -              | -      |
| TC-007       | FR10           | View progress                      | 1. Login<br>2. Open dashboard                                        | Progress graph and completion % are displayed                | -              | -      |
| TC-008       | FR12           | Generate report                    | 1. Login as admin<br>2. Choose report type<br>3. Click Generate      | CSV or PDF file is downloaded                                | -              | -      |

---

## 🔒 Non-Functional Test Cases

### 🔸 TC-NF1: Performance Test – Concurrent Users
**Related Requirement**: NFR6  
**Description**: Simulate 1,000 users accessing course content simultaneously.  
**Steps**:
1. Use load testing tool to simulate 1,000 concurrent sessions.  
2. Monitor server response time.

**Expected Result**: Response time remains under 2 seconds for 95% of requests.

---

### 🔸 TC-NF2: Security Test – SQL Injection Prevention
**Related Requirement**: NFR7  
**Description**: Test login input fields for SQL injection.  
**Steps**:
1. Go to login form.  
2. Enter malicious input: `' OR '1'='1` as username/password.

**Expected Result**: System blocks input and shows error without executing query.

---
