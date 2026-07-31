# 🚀 ShopFlow Full-Stack Developer Curriculum — Version 2 (v2 / Revised Edition)

> A production-grade, interview-complete roadmap for becoming a professional **Full-Stack Developer** from OOP fundamentals through cloud-native operations, advanced DSA, and career readiness.

---

## 🗺️ Master Roadmap Structure (v2)

Version 2 is organized into five core Parts (A through E), covering 10 integrated phases:

```
Part A: Backend Engineering (Revised) ──► Part B: Frontend Engineering (Revised)
                   │                                         │
                   └──────────────────┬──────────────────────┘
                                      ▼
                      Part C: Deployment, Cloud & Integrations (v2)
                                      │
                                      ▼
                      Part D: Data Structures & Algorithms (Revised)
                                      │
                                      ▼
                      Part E: Career & Interview Readiness (Redesigned)
```

---

## 📊 Curriculum Overview & At-a-Glance Metrics

| Part | Title | Included Phases | Topics | Duration | Difficulty | Hands-on Projects |
| :--- | :--- | :--- | :---: | :---: | :--- | :---: |
| **[Part A](Part-A-Backend-Engineering.md)** | **Backend Engineering (Revised Edition)** | Phases 1–5 | 35 topics | 17–20 weeks | Beginner → Intermediate | 2–5 per topic + 5 Phase Capstones |
| **[Part B](Part-B-Frontend-Engineering.md)** | **Frontend Engineering (Revised Edition)** | Phases 5–6 | 15 topics | 8–10 weeks | Beginner → Intermediate | 2–4 per topic + 2 Phase Capstones |
| **[Part C](Part-C-Deployment-Cloud-Integrations.md)** | **Deployment, Cloud & Integrations (v2)** | Phases 7–9 | 24 topics | 10–12 weeks | Intermediate → Production | 3–5 per topic + 3 Phase Capstones |
| **[Part D](Part-D-Data-Structures-and-Algorithms.md)** | **Data Structures & Algorithms (Revised)** | Phase 9 / DSA | 17 topics (16 core + 1 opt) | 10–13 weeks | Intermediate → Advanced | 85 hands-on projects (~163 LeetCode problems) |
| **[Part E](Part-E-Career-and-Interview-Readiness.md)** | **Career & Interview Readiness (Redesigned)** | Phase 10 / Career | 6 topics | 4 weeks | Interview Ready | 3-project portfolio, 4-round mock circuit, 1 PR |

---

## 🆕 Key Changes & Upgrades in Version 2

### 1. **Part A — Backend Engineering (Revised)**
- **Reordered Execution**: Concurrency follows Java Streams; Request Validation & Global Exception Handling precedes REST API Design to build a single error-response shape once.
- **Modern Java & Toolkit**: Added **Records & Sealed Classes** (Java 17+ DTOs), **CompletableFuture**, **Virtual Threads (Project Loom)**, and **Testcontainers** for real Postgres integration tests.
- **API & Storage Enhancements**: Added **OpenAPI/Swagger** documentation, **Redis Caching**, and **OAuth2/OIDC awareness** alongside JWT.
- **New Phase 5 — Production Readiness**: Exposing **Actuator metrics/health**, **Resilience4j** rate limiting/circuit breakers, multi-stage **Dockerization**, and **Transactional Outbox Pattern** / messaging basics.

### 2. **Part B — Frontend Engineering (Revised)**
- **Modern Ecosystem**: Replaced Bootstrap with **Tailwind CSS & shadcn/ui** (Radix primitives + Tailwind).
- **Deepened Foundations**: Added CSS **container queries** & logical properties, JS **event loop** (microtasks vs macrotasks), React `useReducer`, custom hooks, error boundaries, and focus management.
- **Ecosystem Standard Tools**: Added **Component Architecture & Composition Patterns**, **React Hook Form + Zod**, **Axios + TanStack Query** (replacing `useEffect` fetching), **Context vs Zustand** state management audit, **Vitest + RTL + Playwright** testing, **Code-Splitting & Core Web Vitals**, and a **Next.js Primer** (App Router & Server Components).

### 3. **Part C — Deployment, Cloud & Integrations (v2)**
- **Split & Re-architected**: Split deployment into **Phase 8 (Deployment Core)** and **Phase 9 (Production Operations & Reliability)**.
- **12 New Production Topics**: Reverse Proxies & Nginx, Secrets & Environment Management, Infrastructure as Code (Terraform), Blue-Green Deployments & Rollbacks, Kubernetes (Intro), CDN, Metrics & Prometheus, Grafana Dashboards, OpenTelemetry & Distributed Tracing, Queues & Async Processing (RabbitMQ/SQS).

### 4. **Part D — Data Structures & Algorithms (Revised)**
- **Interview-Complete DSA**: Added **Recursion (9.0)**, **Backtracking (9.7)**, **Tries (9.10)**, **Greedy Algorithms (9.13)**, **Bit Manipulation (9.14)**, and **Segment Trees / Fenwick Trees (9.16)**.
- **Reordered & Elevated**: Binary search moved before Trees/Graphs/DP. Hashing moved right after Arrays. Elevated **Union-Find (9.12)** into its own focused topic. Added ~163 tagged LeetCode problems and 85 hands-on projects.

### 5. **Part E — Career & Interview Readiness (Redesigned)**
- **Panels & Missing Skills**: Sourcing strategy, ATS-safe resume formatting, recruiter outreach scripts, salary negotiation, code review, pair programming, take-home assignment execution under a clock.
- **4-Round Mock Circuit**: DSA solo (think-aloud on video), System Design feature prompt, Pair programming on an unfamiliar codebase, and Behavioral + Take-home defense.
- **3-Project Portfolio**: ShopFlow full-stack capstone + A tiny public API with docs + A CLI/automation script + 1 merged Open-Source Pull Request.

---

## 📁 Document Index

- 📘 [Part A — Backend Engineering (Revised)](Part-A-Backend-Engineering.md)
- 📙 [Part B — Frontend Engineering (Revised)](Part-B-Frontend-Engineering.md)
- 📗 [Part C — Deployment, Cloud & Integrations (v2)](Part-C-Deployment-Cloud-Integrations.md)
- 📕 [Part D — Data Structures & Algorithms (Revised)](Part-D-Data-Structures-and-Algorithms.md)
- 📑 [Part E — Career & Interview Readiness (Redesigned)](Part-E-Career-and-Interview-Readiness.md)
- 📜 [Fullstack-v2.md (Single Consolidated File)](Fullstack-v2.md)
