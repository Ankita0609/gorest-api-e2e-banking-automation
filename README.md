🔍 Featured Project — API Automation (GoRest E2E)
🧪 GoRest API End-to-End Automation Framework

Java · Rest Assured · TestNG · Maven

A real-world API automation framework built to validate end-to-end REST workflows with proper authentication, negative testing, and clean architecture.

This project focuses on how APIs are actually tested in production systems, not just happy-path demos.

🔗 Repository:
👉 gorest-api-e2e-banking-automation

🎯 What this project demonstrates

End-to-end API lifecycle testing (Create → Read → Delete)

Bearer token authentication using environment variables

Negative & edge-case validation aligned with REST standards

Clean separation of concerns (test logic vs API client vs config)

CI/CD-ready execution (headless, Maven-driven)

🏗️ Framework Highlights

BaseTest layer for common setup & authentication

API client abstraction (no test logic inside HTTP calls)

Config management via environment variables (secure & CI-safe)

TestNG execution model for scalable test grouping

tests/
 ├── core        → Base setup & request specification
 ├── clients     → API interaction layer
 ├── e2e         → End-to-end test flows
 └── negative    → Negative & validation scenarios

🔐 Authentication Strategy

Uses Bearer Token authentication

Token injected via environment variable

No hardcoded secrets (CI/CD compatible)

GOREST_TOKEN=<your_token_here>

🔁 Test Coverage
✔ Positive Scenarios

Create user → validate 201

Fetch user → validate response body

Delete user → validate successful deletion

❌ Negative Scenarios

Invalid user ID → 404

Unauthorized access → 401

Input validation failures

🧪 Manual + Automation Validation

All APIs were:

Manually validated in Postman

Then automated using Rest Assured

This ensures automation is built on verified API behavior, not assumptions.

🔄 CI/CD Readiness

Maven-based execution

Environment-driven configuration

Jenkins-ready architecture

Designed for non-interactive execution

(CI integration intentionally kept separate to keep the framework clean and focused.)

🧠 Why this matters

Most QA repos show syntax.
This project shows testing judgment, structure, and real-world readiness.

It reflects how APIs are tested in fintech / banking / SaaS environments, not toy examples.

📌 Tech Focus Areas

API Automation (Rest Assured)

Test Framework Design

REST Standards & Status Codes

Secure Auth Handling

Debugging CI vs Local Failures

Clean, maintainable automation code

📫 Open to Opportunities

I’m actively exploring QA Automation / SDET roles where:

API quality matters

Automation is treated as engineering

CI/CD is part of the workflow

⭐ Tip for reviewers

Start with the E2E test, then look at the client layer — that’s where the design intent is clear.
