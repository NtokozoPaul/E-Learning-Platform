# 🧠 Assignment 9: Domain Modeling and Class Diagram Development – E-Learning Platform

## 1. 📘 Domain Model (30 Marks)

| Entity        | Attributes                                          | Methods                                              | Relationships                                         |
|---------------|-----------------------------------------------------|------------------------------------------------------|------------------------------------------------------|
| User          | userId, name, email, role, isActive                 | register(), login(), deactivate()                    | Enrolls in Courses, submits Assignments              |
| Course        | courseId, title, description, status                | publish(), archive(), updateContent()                | Has Lessons, Assignments; taught by Instructor       |
| Lesson        | lessonId, title, content, status                    | review(), approve(), update()                        | Belongs to Course                                     |
| Assignment    | assignmentId, title, deadline, status               | post(), archive(), grade()                           | Belongs to Course; linked to Submissions             |
| Submission    | submissionId, filePath, status, grade               | submit(), resubmit(), markLate()                     | Linked to Assignment and User                        |
| Quiz          | quizId, title, status, score                        | launch(), autoGrade(), releaseResults()              | Belongs to Course                                     |
| SupportTicket | ticketId, subject, status, priority, assignedTo     | escalate(), resolve(), close()                       | Linked to User                                        |

### 📌 Business Rules

- A user can only enroll in active courses.
- Only instructors can publish courses.
- Submissions past the deadline are marked as late.
- Users can resubmit rejected assignments once.
- A course can only be archived if all lessons and assignments are closed.

---

