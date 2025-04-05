# 📝 Reflection – E-Learning Platform

This reflection discusses the challenges encountered during the **Object State Modeling** and **Activity Workflow Modeling** tasks, how these diagrams align with **Agile user stories**, and compares **state diagrams** versus **activity diagrams**.

---

## 1. Challenges in Object State Modeling

### Choosing Granularity for States
One of the main challenges in object state modeling was determining the right level of granularity for each state. For example, in the **User Account** object, I initially considered adding additional states such as **Pending Approval** or **Email Pending**, but these were not necessary for the platform's requirements. Ultimately, I had to strike a balance between too much detail, which could make the diagram overly complicated, and too little detail, which might not capture all the necessary stages in the object lifecycle.

- **Key Decisions:**
  - Focused on high-level states like **Active**, **Suspended**, and **Deactivated** for **User Account** instead of including intermediate states.
  - Avoided overly specific transitions that weren’t required by the functional requirements.

### Transitions and Guard Conditions
Another challenge was defining clear transitions and establishing guard conditions. For instance, in the **Submission** object, specifying the guard condition “**Rejected** if submission is late” required understanding the platform’s business rules, which I had to interpret based on the user stories and the functional requirements. Making sure that transitions were triggered by the correct events, and that guard conditions made sense within the context of the platform, was a task requiring close attention to detail.

- **Solution:**
  - Used the **User Story** and **Functional Requirements** as a guide to define

