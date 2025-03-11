
# Reflection – Translating Requirements into Use Cases and Tests

Converting system and stakeholder requirements into structured use cases and test scenarios was both insightful and challenging. While functional requirements give a clear picture of what the system should do, translating those into realistic user interactions and testable events required careful analysis and stakeholder empathy.

One major challenge was avoiding vague or overly broad use cases. For example, “manage user accounts” sounds simple, but in practice it involves multiple actors (admins, IT support) and actions (create, update, deactivate). Breaking this down into focused, singular use cases helped maintain clarity and traceability to the original requirements.

Another difficulty was ensuring that every use case had enough depth while still being concise. Use cases like “Make Payment” required thinking about security protocols, external API interactions (Stripe), and handling failure scenarios like declined transactions. Balancing technical detail with user-facing simplicity was key to writing usable documentation.

Creating test cases also revealed gaps in the requirements. Some functional requirements didn’t specify how errors should be handled or what success looked like. In those cases, I had to make assumptions based on best practices and typical user behavior. For example, what message should be displayed when a student tries to enroll in a full course? This led to refining the requirements for better completeness.

Performance and security testing were particularly tricky. Non-functional requirements are often overlooked, but while writing test cases for them, I realized the need for clear metrics and tools (e.g., response times under 2 seconds, input validation for SQL injection). Simulating realistic user loads and attack scenarios pushed me to think beyond just the interface and focus on the system’s robustness.

Another challenge was maintaining consistency across use cases, requirements, and test cases. It was easy to lose track of whether a use case covered all stakeholder concerns or if a test case fully validated a requirement. To solve this, I kept cross-referencing everything back to the stakeholder analysis and functional requirement IDs from Assignment 4.

Lastly, the UML use case diagram had its own learning curve. Identifying the right actors and use cases required filtering out background processes that weren’t directly initiated by a user. Ensuring that the diagram aligned with both the functional flow and real-world usage helped bring the whole system view together visually.

In conclusion, this assignment deepened my understanding of the systems analysis and design process. It highlighted how important clarity, structure, and traceability are when moving from high-level requirements to practical implementation and testing. It also showed that stakeholder needs should continuously guide design decisions at every level of system development.
