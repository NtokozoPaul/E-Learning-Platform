# 📡 Assignment 13: CI/CD with GitHub Actions – E-Learning Platform

This repository implements CI/CD for the E-Learning Platform using GitHub Actions. It automates testing, enforces pull request rules, and builds artifacts on every push to `main`.

---

## 🧪 How to Run Tests Locally

To run all unit and API tests locally:

```bash
# Install dependencies
pip install -r requirements.txt

# Run tests
pytest
🔁 CI/CD Pipeline Overview
✅ Continuous Integration (CI)
The pipeline ensures that code quality is maintained before merging to main.

Triggers on every push and pull request

Sets up the environment (Java or Python)

Installs dependencies

Runs all unit and integration tests

Blocks pull requests if tests fail

✅ Continuous Deployment (CD)
Triggered only when code is pushed or merged into the main branch.

Builds the app (e.g., creates a JAR or ZIP archive)

Uploads the artifact under the GitHub Actions “Artifacts” section

🧱 Branch Protection Rules
The main branch is protected with the following rules:

✅ Require at least 1 pull request review

✅ Require status checks to pass before merging

✅ Prevent direct pushes (changes must go through PRs)

This ensures all code is tested and reviewed before it reaches production.

🔁 Pull Request Workflow
Developers work on feature branches

Open a PR targeting main

CI automatically runs:

✅ All tests

❌ PR is blocked if any test fails

When PR passes and is merged:

🎯 CD builds and uploads release artifacts

📦 Artifacts
Build artifacts (such as JAR or ZIP files) are uploaded to GitHub Actions for every successful run on main.

To download:

Go to the Actions tab

Click on the latest workflow run under main

Scroll down to the Artifacts section

Click to download the packaged release

