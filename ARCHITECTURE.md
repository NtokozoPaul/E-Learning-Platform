# E-learning Platform

```mermaid
%% === Level 1: System Context Diagram ===
graph TD;
  A[Student] -->|Accesses| B[Web/Mobile App];
  C[Instructor] -->|Manages Courses| B;
  D[Admin] -->|Manages Platform| E[Admin Dashboard];
  B -->|Requests Data| F[Backend Server];
  E -->|Requests Data| F;
  F -->|Stores Data| G[Database];
  F -->|Processes Payments| H[Payment Gateway];
  F -->|Sends Notifications| I[Email/SMS Service];

%% === Level 2: Container Diagram ===
subgraph Web & Mobile Applications
    B[Web/Mobile App]
end

subgraph Admin Dashboard
    E[Admin Dashboard]
end

subgraph Backend Services
    F[Backend Server] -->|Stores Course Data| G[Database];
    F -->|Handles Payments| H[Payment Gateway];
    F -->|Sends Notifications| I[Email/SMS Service];
end

%% === Level 3: Component Diagram ===
subgraph Backend Components
    J[Authentication Service] -->|Authenticates Users| F;
    K[Course Management Module] -->|Manages Content| G;
    L[Assessment & Quiz Module] -->|Grades Exams| G;
    M[Notification System] -->|Sends Alerts| I;
    N[Payment Processing Module] -->|Handles Transactions| H;
end

F -->|Uses| J;
F -->|Processes| K;
F -->|Grades Exams| L;
F -->|Sends Messages| M;
F -->|Processes Payments| N;



