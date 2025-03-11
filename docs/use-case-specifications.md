# Use Case Specifications – E-Learning Platform

This document outlines 8 core use cases for the E-Learning Platform.

---

## Use Case 1: Register/Login
**Actor**: Student, Instructor, Admin  
**Description**: Allows users to securely register and log into the platform.  
**Precondition**: User is not logged in.  
**Postcondition**: User is redirected to their role-based dashboard.  
**Basic Flow**:
1. User opens login page.
2. Enters email and password.
3. Clicks "Login".
4. System verifies credentials.
5. User is redirected to their dashboard.  
**Alternative Flow**:
- Invalid credentials → Show error: “Invalid email or password”.

---

## Use Case 2: Enroll in Course  
**Actor**: Student  
**Description**: Enables students to browse and enroll in available courses.  
**Precondition**: Student is logged in.  
**Postcondition**: Student is added to the course enrollment list.  
**Basic Flow**:
1. Student navigates to course catalog.
2. Selects a course.
3. Clicks “Enroll”.
4. System verifies prerequisites.
5. Enrollment confirmed.  
**Alternative Flow**:
- Course is full → Display “Enrollment closed”.

---

## Use Case 3: Submit Assignment  
**Actor**: Student  
**Description**: Allows students to submit assignments for grading.  
**Precondition**: Assignment is open for submission.  
**Postcondition**: Assignment is saved and timestamped.  
**Basic Flow**:
1. Student opens assignment page.
2. Uploads file.
3. Clicks “Submit”.
4. System saves the file and confirms submission.  
**Alternative Flow**:
- Upload fails → Show “Upload unsuccessful. Try again.”

---

## Use Case 4: Grade Assignment  
**Actor**: Instructor  
**Description**: Enables instructors to view and grade submitted student work.  
**Precondition**: Assignments have been submitted.  
**Postcondition**: Student grade and feedback are saved.  
**Basic Flow**:
1. Instructor logs in.
2. Opens course dashboard.
3. Selects assignment to grade.
4. Reviews submission.
5. Enters grade and feedback.
6. Submits grade.  
**Alternative Flow**:
- Assignment not found → Display error.

---

## Use Case 5: Create/Edit Course  
**Actor**: Instructor  
**Description**: Allows instructors to create and modify course content.  
**Precondition**: Instructor is logged in.  
**Postcondition**: Course data is saved to the system.  
**Basic Flow**:
1. Instructor navigates to "My Courses".
2. Clicks “Create New Course”.
3. Enters course info, uploads materials.
4. Saves course.  
**Alternative Flow**:
- Save fails → Display error message.

---

## Use Case 6: Make Payment  
**Actor**: Student, Parent  
**Description**: Handles course fee payment through a secure payment gateway.  
**Precondition**: User is enrolled in a paid course.  
**Postcondition**: Payment is processed and confirmed.  
**Basic Flow**:
1. User selects payment option.
2. Enters card details.
3. Clicks “Pay”.
4. System confirms payment with Stripe API.  
**Alternative Flow**:
- Payment declined → Show error: “Payment failed. Try another method.”

---

## Use Case 7: Generate Reports  
**Actor**: Admin, Finance Team  
**Description**: Allows stakeholders to generate platform-wide reports.  
**Precondition**: User has report access privileges.  
**Postcondition**: Report file is generated and ready for download.  
**Basic Flow**:
1. User selects report type.
2. Chooses date range.
3. Clicks “Generate”.
4. System creates report.  
**Alternative Flow**:
- No data → Show message: “No data found for selected range.”

---

## Use Case 8: View Progress  
**Actor**: Student, Parent, Instructor  
**Description**: Displays real-time student progress for courses.  
**Precondition**: User is logged in.  
**Postcondition**: Progress dashboard is displayed.  
**Basic Flow**:
1. User opens dashboard.
2. System loads student’s course progress.
3. Progress is visualized using charts/percentages.  
**Alternative Flow**:
- Course data missing → Display “Progress not available.”

---

