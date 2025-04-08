## 🔍 Reflection (20 Marks)

Designing the domain model and class diagram for the E-Learning System provided both insightful learning opportunities and certain challenges.

### 🧠 Challenges Faced

One of the key challenges was determining the appropriate level of abstraction for entities. Initially, I considered creating more granular classes like `Video`, `PDF`, and `InteractiveQuiz`, but I realized that such detail might complicate the class diagram unnecessarily. Instead, I abstracted this into a `Lesson` class with appropriate attributes to handle various content types.

Defining the relationships and multiplicities between entities was another area that required deep thought. For instance, deciding whether a `User` could submit multiple assignments to the same `Assignment`, or how to model re-submissions in `Submission`, prompted detailed consideration of the real-world flow of an e-learning environment. These decisions had to align with business rules like “a user can only submit one active submission per assignment,” which influenced how the model was structured.

Method definition also posed a challenge. It was tempting to overload classes with too many methods, but I focused on assigning only those that directly reflect the entity’s responsibilities. For example, the `Assignment` class contains `publish()` and `archive()` methods—highlighting lifecycle management—while the `Submission` class contains `submit()` and `resubmit()` to represent student actions.

### 🔗 Alignment with Previous Assignments

The class diagram aligns closely with the use cases and behavioral models developed in previous assignments. For instance:
- The `User` entity supports actions like `register()`, `login()`, and `updateProfile()` that were outlined in Assignment 5 (Use Case Modeling).
- The `Enrollment` class and its `activate()`/`complete()` methods align with the activity diagram developed earlier.
- The `SupportTicket` and `Submission` classes reflect state changes and transitions modeled in Assignment 8.

This consistency ensures that our object-oriented design not only reflects technical needs but also respects user-centric workflows defined earlier.

### ⚖️ Trade-Offs Made

To keep the design manageable, I simplified some aspects of the model. For instance, I used composition and associations rather than implementing full inheritance hierarchies. While it could have been useful to create an abstract class like `ContentItem` with subclasses for `Lesson`, `Assignment`, and `Quiz`, I found it more practical to model each as a distinct class with clear responsibilities.

Additionally, I chose not to model authentication and authorization logic in detail within the `User` class, as that would involve another layer of security design which is beyond the scope of this assignment.

### 💡 Lessons Learned

This assignment reinforced the importance of thoughtful design in object-oriented modeling. Key takeaways include:
- **Clarity over complexity**: It’s better to have a clear, maintainable model than an overly detailed one that’s hard to follow.
- **Consistency matters**: Aligning the model with earlier work ensures coherence and avoids redesign down the line.
- **Relationships are powerful**: Proper use of associations and multiplicities can clarify system behavior more than method names alone.

Overall, the experience improved my ability to translate abstract system requirements into concrete class structures and helped me understand how to balance completeness with simplicity in modeling.
