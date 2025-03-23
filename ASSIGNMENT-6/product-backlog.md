# 📝 Product Backlog – E-Learning Platform

| Story ID | User Story                                                                                   | Priority (MoSCoW) | Effort Estimate | Dependencies       |
|----------|-----------------------------------------------------------------------------------------------|------------------|------------------|--------------------|
| US1      | As a student, I want to register and log in so that I can access my learning dashboard.      | Must             | 3 points         | None               |
| US2      | As a student, I want to enroll in courses so that I can begin learning.                      | Must             | 3 points         | US1                |
| US3      | As an instructor, I want to upload course materials so that students can view them.          | Must             | 5 points         | US1                |
| US4      | As an instructor, I want to grade assignments so that students can get feedback.             | Should           | 4 points         | US7                |
| US5      | As a student, I want to view my course progress so that I can track how far I’ve come.       | Should           | 2 points         | US2, US7           |
| US6      | As an admin, I want to manage user accounts so that the system stays secure and updated.     | Must             | 3 points         | US1                |
| US7      | As a student, I want to submit assignments so that I can be evaluated.                       | Must             | 4 points         | US2, US3           |
| US8      | As a parent, I want to view my child’s progress so that I can support their learning.        | Could            | 2 points         | US5                |
| NFR1     | As a system admin, I want user data encrypted with AES-256 so that security compliance is met.| Must             | 3 points         | US1, US6           |
| NFR3     | As an instructor, I want 99.9% uptime so I can manage courses anytime.                        | Must             | 2 points         | Infrastructure     |

