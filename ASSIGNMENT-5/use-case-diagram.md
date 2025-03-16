# 🧩 Use Case Diagram – E-Learning Platform

> ❗ **Important:** GitHub does not support Mermaid diagram rendering in markdown previews.  
> 👉 To view the diagram, copy the Mermaid code below into [https://mermaid.live](https://mermaid.live)

## 📌 Mermaid Code

````mermaid
graph TD;
  %% Define Actors
  Student["Student"]:::actor
  Instructor["Instructor"]:::actor
  Administrator["Administrator"]:::actor
  ITSupport["IT Support"]:::actor
  Finance["Finance Team"]:::actor
  Parent["Parent"]:::actor

  %% Student Use Cases
  Student -->|Logs in| UC1["Register/Login"]
  Student -->|Enrolls| UC2["Enroll in Course"]
  Student -->|Submits| UC3["Submit Assignment"]
  Student -->|Makes| UC4["Make Payment"]
  Student -->|Views| UC5["View Progress"]

  %% Instructor Use Cases
  Instructor -->|Logs in| UC1
  Instructor -->|Creates| UC6["Create/Edit Course"]
  Instructor -->|Grades| UC7["Grade Assignment"]
  Instructor -->|Sends| UC8["Send Notifications"]
  Instructor -->|Views| UC5

  %% Admin Use Cases
  Administrator -->|Logs in| UC1
  Administrator -->|Manages| UC9["Manage Users"]
  Administrator -->|Generates| UC10["Generate Reports"]
  Administrator -->|Sends| UC8

  %% IT Support Use Cases
  ITSupport -->|Manages| UC9
  ITSupport -->|Supports| UC1

  %% Finance Team Use Cases
  Finance -->|Monitors| UC4
  Finance -->|Generates| UC10

  %% Parent Use Cases
  Parent -->|Views| UC5
  Parent -->|Pays| UC4

  %% Styling
  classDef actor fill:#f9f,stroke:#333,stroke-width:1px;
  class Student,Instructor,Administrator,ITSupport,Finance,Parent actor;


