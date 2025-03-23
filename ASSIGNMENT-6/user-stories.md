# 📋 User Stories – E-Learning Platform

Below is a list of functional and non-functional user stories written in Agile format, each with clear acceptance criteria.

---

## ✅ Functional User Stories

| ID  | User Story                                                                                   | Priority | Acceptance Criteria                                                                 |
|-----|-----------------------------------------------------------------------------------------------|----------|--------------------------------------------------------------------------------------|
| US1 | As a student, I want to register and log in so that I can access my learning dashboard.      | High     | User can create an account, log in, and is redirected to a personalized dashboard.  |
| US2 | As a student, I want to enroll in courses so that I can begin learning.                      | High     | Available courses are listed and enrollment updates the student’s course list.      |
| US3 | As an instructor, I want to upload course materials so that students can view them.          | High     | Instructor can upload files and links; students can access them via the course page.|
| US4 | As an instructor, I want to grade assignments so that students can get feedback.             | Medium   | Instructors can assign scores and comments visible to students.                     |
| US5 | As a student, I want to view my course progress so that I can track how far I’ve come.       | Medium   | Progress bars or percentages update automatically after each activity is completed.|
| US6 | As an admin, I want to manage user accounts so that the system stays secure and updated.     | High     | Admins can activate, deactivate, and assign roles to user accounts.                 |
| US7 | As a student, I want to submit assignments so that I can be evaluated.                       | High     | File upload is successful, with confirmation message and visible submission status. |
| US8 | As a parent, I want to view my child’s progress so that I can support their learning.        | Low      | Parent dashboard displays current courses, grades, and completion status.           |

---

## 🔐 Non-Functional User Stories

| ID    | User Story                                                                                                  | Priority | Acceptance Criteria                                                                 |
|-------|-------------------------------------------------------------------------------------------------------------|----------|--------------------------------------------------------------------------------------|
| NFR1  | As a system admin, I want user data encrypted with AES-256 so that security compliance is met.             | High     | All sensitive data is encrypted at rest using AES-256. Data cannot be read without keys. |
| NFR2  | As a student, I want pages to load quickly so that I can stay focused on learning.                         | Medium   | 95% of all page loads occur in under 2 seconds on a standard broadband connection.  |
| NFR3  | As an instructor, I want the system to be available 99.9% of the time so that I can manage courses anytime.| High     | The system uptime is monitored and reported monthly, with automated failover in place. |
| NFR4  | As a visually impaired user, I want screen reader support so that I can navigate the platform.             | High     | All elements have ARIA labels and proper semantic structure for screen readers.     |

