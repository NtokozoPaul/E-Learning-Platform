# 📝 Activity Workflow Diagrams – E-Learning Platform

This document contains UML activity diagrams and explanations for 8 complex workflows in the E-Learning Platform.

---

## 1. 🎓 User Registration Workflow

```mermaid
flowchart TD
    A[Start] --> B[Fill Registration Form]
    B --> C[Submit Form]
    C --> D{Is Form Valid?}
    D -->|No| E[Show Error]
    D -->|Yes| F[Send Email Verification]
    F --> G{Is Email Verified?}
    G -->|No| H[Wait for Email Verification]
    G -->|Yes| I[Create Account]
    I --> J[Redirect to Dashboard]
    J --> K[End]
```

**Explanation:**

- **Start/End Nodes**: Start, End  
- **Actions**: Fill Registration Form, Submit Form, Show Error, Send Email Verification, Create Account, Redirect to Dashboard  
- **Decisions**: Valid form check, Email verified  
- **Swimlanes**: User, System  
- **Traceability**:  
  - FR-001: Account creation  
  - US-002: As a user, I want to register for an account  

---

## 2. 📘 Course Creation Workflow

```mermaid
flowchart TD
    A[Start] --> B[Instructor fills course details]
    B --> C[Submit Course for Review]
    C --> D{Is Course Valid?}
    D -->|No| E[Reject Course]
    D -->|Yes| F[Publish Course]
    F --> G[Notify Learners]
    G --> H[End]
```

**Explanation:**

- **Start/End Nodes**: Start, End  
- **Actions**: Fill course details, Submit for Review, Reject Course, Publish Course, Notify Learners  
- **Decisions**: Course validation  
- **Swimlanes**: Instructor, System  
- **Traceability**:  
  - FR-002: Course creation and management  
  - US-005: Publish a course for learners  

---

## 3. 📄 Lesson Creation Workflow

```mermaid
flowchart TD
    A[Start] --> B[Instructor creates lesson]
    B --> C[Submit Lesson for Review]
    C --> D{Is Lesson Approved?}
    D -->|No| E[Reject Lesson]
    D -->|Yes| F[Publish Lesson]
    F --> G[Notify Learners]
    G --> H[End]
```

**Explanation:**

- **Start/End Nodes**: Start, End  
- **Actions**: Create lesson, Submit for Review, Reject Lesson, Publish Lesson, Notify Learners  
- **Decisions**: Lesson approval  
- **Swimlanes**: Instructor, System  
- **Traceability**:  
  - FR-003: Lesson creation  
  - US-007: Edit existing lessons  

---

## 4. 🧾 Enrollment Workflow

```mermaid
flowchart TD
    A[Start] --> B[User selects course]
    B --> C[Submit Payment]
    C --> D{Is Payment Valid?}
    D -->|No| E[Show Payment Error]
    D -->|Yes| F[Activate Enrollment]
    F --> G[Send Confirmation Email]
    G --> H[End]
```

**Explanation:**

- **Start/End Nodes**: Start, End  
- **Actions**: Select course, Submit Payment, Show Payment Error, Activate Enrollment, Send Confirmation Email  
- **Decisions**: Payment validation  
- **Swimlanes**: User, System  
- **Traceability**:  
  - FR-004: Course enrollment  
  - US-006: Track learners' course status  

---

## 5. 📝 Assignment Submission Workflow

```mermaid
flowchart TD
    A[Start] --> B[Student completes assignment]
    B --> C[Submit Assignment]
    C --> D{Is Submission Late?}
    D -->|No| E[Submit Assignment for Grading]
    D -->|Yes| F[Show Late Submission Warning]
    E --> G[Instructor Reviews Assignment]
    G --> H[Grade Assignment]
    H --> I[Send Feedback to Student]
    I --> J[End]
```

**Explanation:**

- **Start/End Nodes**: Start, End  
- **Actions**: Complete assignment, Submit Assignment, Show Late Submission Warning, Review, Grade Assignment, Send Feedback  
- **Decisions**: Submission timeliness  
- **Swimlanes**: Student, Instructor, System  
- **Traceability**:  
  - FR-005: Assignment submission  
  - US-008: Manage tasks for learners  

---

## 6. 📤 Submission Grading Workflow

```mermaid
flowchart TD
    A[Start] --> B[Instructor Reviews Submission]
    B --> C{Is Submission Valid?}
    C -->|No| D[Reject Submission]
    C -->|Yes| E[Grade Submission]
    E --> F[Send Feedback to Student]
    F --> G[End]
```

**Explanation:**

- **Start/End Nodes**: Start, End  
- **Actions**: Review submission, Reject Submission, Grade Submission, Send Feedback  
- **Decisions**: Submission validity check  
- **Swimlanes**: Instructor, System  
- **Traceability**:  
  - FR-006: Grading process  
  - US-009: Submit/resubmit work online  

---

## 7. 🧪 Quiz Attempt Workflow

```mermaid
flowchart TD
    A[Start] --> B[User Starts Quiz]
    B --> C[Complete Quiz]
    C --> D[Submit Quiz]
    D --> E{Is Time Over?}
    E -->|No| F[Wait for User to Submit]
    E -->|Yes| G[Submit Automatically]
    G --> H[Grade Quiz]
    H --> I[Send Results to User]
    I --> J[End]
```

**Explanation:**

- **Start/End Nodes**: Start, End  
- **Actions**: Start quiz, Complete quiz, Submit quiz, Automatically submit, Grade quiz, Send results  
- **Decisions**: Time check  
- **Swimlanes**: User, System  
- **Traceability**:  
  - FR-007: Quiz grading  
  - US-011: Show quiz results  

---

## 8. 🛠️ Support Ticket Handling Workflow

```mermaid
flowchart TD
    A[Start] --> B[User Submits Ticket]
    B --> C[Ticket Assigned to Agent]
    C --> D{Is Issue Resolved?}
    D -->|No| E[Escalate Ticket]
    D -->|Yes| F[Resolve Ticket]
    E --> F
    F --> G[Send Resolution Confirmation]
    G --> H[End]
```

**Explanation:**

- **Start/End Nodes**: Start, End  
- **Actions**: Submit ticket, Assign ticket to agent, Resolve ticket, Escalate ticket, Send confirmation  
- **Decisions**: Issue resolution check  
- **Swimlanes**: User, Agent, System  
- **Traceability**:  
  - FR-008: Ticket resolution  
  - US-012: Request support help  

---

## ✅ Summary

Each activity diagram:
- Aligns with at least one **functional requirement (Assignment 4)** and **user story (Assignment 6)**
- Uses **UML activity modeling** with decisions, parallel actions, and swimlanes
- Prepares the platform for **workflow automation, real-time tracking, and improved usability**

