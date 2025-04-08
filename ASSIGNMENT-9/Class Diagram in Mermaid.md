## 📦 Class Diagram for E-Learning Platform

```mermaid
classDiagram
    class User {
        -userId: String
        -name: String
        -email: String
        -role: String
        +register()
        +login()
        +updateProfile()
    }

    class Course {
        -courseId: String
        -title: String
        -status: String
        +publish()
        +archive()
    }

    class Lesson {
        -lessonId: String
        -title: String
        -content: String
        -status: String
        +review()
        +update()
    }

    class Enrollment {
        -enrollmentId: String
        -status: String
        -progress: Float
        +activate()
        +complete()
        +drop()
    }

    class Assignment {
        -assignmentId: String
        -title: String
        -status: String
        +publish()
        +archive()
    }

    class Submission {
        -submissionId: String
        -status: String
        -timestamp: String
        +submit()
        +resubmit()
        +getFeedback()
    }

    class Quiz {
        -quizId: String
        -status: String
        +start()
        +submit()
        +review()
    }

    class SupportTicket {
        -ticketId: String
        -status: String
        -issue: String
        +open()
        +assign()
        +resolve()
        +escalate()
    }

    User "1" -- "0..*" Enrollment : enrolls
    Enrollment "1" --> "1" Course : for
    Course "1" --> "0..*" Lesson : includes
    Course "1" --> "0..*" Assignment : has
    User "1" --> "0..*" Submission : submits
    Assignment "1" --> "0..*" Submission : receives
    Course "1" --> "0..*" Quiz : contains
    User "1" --> "0..*" SupportTicket : opens
