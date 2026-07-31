# 🚀 Full-Stack Developer Study Roadmap — Version 2 (v2 / Revised Edition)

> A comprehensive, production-grade, and interview-complete curriculum for becoming a professional **Full-Stack Java & Web Developer**.

---

## 🗺️ Master Curriculum Overview

| Part | Title | Phases | Topics | Duration | Key Focus Areas |
| :--- | :--- | :---: | :---: | :---: | :--- |
| **[Part A](Part-A-Backend-Engineering.md)** | **Backend Engineering (Revised Edition)** | 1–5 | 35 | 17–20 wks | Java OOP, Core Java, Spring Boot, REST & GraphQL APIs, Postgres/Mongo/Redis databases, Docker & Actuator observability. |
| **[Part B](Part-B-Frontend-Engineering.md)** | **Frontend Engineering (Revised Edition)** | 5–6 | 15 | 8–10 wks | Semantic HTML/CSS, Tailwind & shadcn/ui, JS ES6+ (Event Loop), TypeScript, React, RHF+Zod, TanStack Query, Vitest/Playwright, Next.js. |
| **[Part C](Part-C-Deployment-Cloud-Integrations.md)** | **Deployment, Cloud & Integrations (v2)** | 7–9 | 24 | 10–12 wks | Stripe/PayMongo, SendGrid, OAuth, Cloudinary/S3, Claude AI, Nginx, Secrets, Terraform IaC, GitHub Actions CI/CD, Blue-Green, Prometheus/Grafana, OTel, SQS queues. |
| **[Part D](Part-D-Data-Structures-and-Algorithms.md)** | **Data Structures & Algorithms (Revised)** | 9/DSA | 17 | 10–13 wks | Recursion, Arrays/Strings, Hashing, Sliding Window, Stacks/Queues, Sorting/Searching, Linked Lists, Backtracking, Trees, Heaps, Tries, Graphs, Union-Find, Greedy, Bit Manipulation, DP, Segment Trees. |
| **[Part E](Part-E-Career-and-Interview-Readiness.md)** | **Career & Interview Readiness (Redesigned)** | 10/Career | 6 | 4 wks | 3-project portfolio, 4-round mock interview circuit, salary negotiation, open-source PR, networking, recruiter outreach, take-home prep. |

---

# PART A: Backend Engineering — Revised Edition

*(Phases 1 through 5: OOP fundamentals, Core Java, Spring Boot, Databases, and Production Readiness)*

## At a Glance
- **Phases:** 1–5 | **Topics:** 35 | **Duration:** 17–20 weeks | **Difficulty:** Beginner → Intermediate

## Phase 1 — OOP Fundamentals
Encapsulation · Inheritance · Abstraction · Polymorphism · Composition · Exceptions · SOLID Principles & Design Patterns · Records & Sealed Classes (NEW)

- **Encapsulation**: Private balance Bank Account; Student Grade Book; Immutable Point Class.
- **Inheritance**: Animal Hierarchy (`Dog`, `Cat`, `Bird`); Employee Payroll (`FullTime`, `PartTime`, `Contractor`).
- **Abstraction**: Payment Gateway (`CreditCard`, `GCash`, `PayMaya`); Notification System (`Email`, `SMS`, `Push`).
- **Polymorphism**: Discount Engine (`Regular`, `Senior`, `Student`); Game Character Moves.
- **Composition**: Computer Builder (`CPU`, `RAM`, `GPU`); Car Engine Swap (`GasEngine`, `ElectricEngine`).
- **Exceptions**: ATM Simulator custom exceptions; Resource Cleanup with try-with-resources.
- **SOLID & Patterns**: Factory Method (`ProductFactory`); Strategy (`DiscountStrategy`); Decorator (`Coffee Add-ons`).
- **Records & Sealed Classes (NEW)**: Record DTO conversion; Sealed `PaymentResult` interface with pattern matching switch.
- 🛒 **Final Project**: *ShopFlow Foundation (Mini E-Commerce Core)* console app with sealed `PaymentResult` and record `CartItem`.

## Phase 2 — Core Java Toolkit
2D & 3D Arrays · Java Collections Framework · Generics · Exception Handling Deep Dive · File I/O · Java Streams · Concurrency & Multithreading (UPDATED) · JDBC · Build Tools · Testing (JUnit & Mockito) · Logging

- **Arrays**: Matrix Addition & Multiplication; Tic-Tac-Toe 2D Board.
- **Collections**: Inventory Manager (List vs Map); Task Scheduler (`PriorityQueue`); Big-O Lookup Table reference sheet.
- **Generics**: Generic `Repository<T, ID>` interface; Generic `Stack<T>` class.
- **Exception Deep Dive**: Exception Chaining Logger; Checked vs Unchecked refactoring.
- **File I/O**: CSV Import/Export with `BufferedReader`/`BufferedWriter`; Directory Walker with `Files.walk()`.
- **Streams**: Product Query Pipeline (`filter`, `map`, `sorted`); Sales Report `groupingBy`; `parallelStream()` benchmark.
- **Concurrency & Multithreading (UPDATED)**: Parallel File Processor (`ExecutorService`); Race condition fix; `CompletableFuture` composition; Virtual Threads (Project Loom) benchmark.
- **JDBC**: Raw JDBC CRUD; SQL Injection demonstration & fix.
- **Build Tools**: Convert to Maven (`pom.xml`); Multi-module Maven project.
- **Testing**: Mockito repository test (`@Mock`, `when`); Parameterized JUnit test (`@ParameterizedTest`).
- **Logging**: SLF4J + Logback migration; Redact-sensitive-data filter.
- 🛒 **Final Project**: *ShopFlow Core Java Service Layer* with Maven, JUnit/Mockito, SLF4J, and `CompletableFuture`.

## Phase 3 — Framework & API
Spring Core & Dependency Injection · Request Validation & Exception Handling (REORDERED) · REST API Design · API Documentation with OpenAPI/Swagger (NEW) · JWT Authentication (UPDATED) · GraphQL · Testing Spring Boot Applications

- **Spring Core & DI**: First Spring Boot App; 3-Layer Wiring (Controller → Service → Repository).
- **Request Validation & Exception Handling (REORDERED)**: `@Valid` registration; `@ControllerAdvice` global handler; Field-level error messages.
- **REST API Design**: Todo REST API (CRUD + status codes); Product Catalog API (pagination/sorting); `Idempotency-Key` header support.
- **API Documentation (NEW)**: `springdoc-openapi` setup; `@Operation` and `@Schema` annotations at `/swagger-ui.html`.
- **JWT Authentication (UPDATED)**: Hashed password login/JWT flow; Role-based protection (`@PreAuthorize`); CORS configuration; OAuth2/OIDC awareness.
- **GraphQL**: Schema-first `.graphqls` Notes API; Product search port to GraphQL.
- **Testing**: Controller test with `MockMvc`; Security-aware JWT controller test.
- 🛒 **Final Project**: *ShopFlow Backend API Layer* with Swagger UI docs, CORS, global exception advice, and idempotency keys.

## Phase 4 — Databases
JPA Entity Mapping & Relationships · Lazy vs Eager Loading & N+1 · JPQL & Native Queries · PostgreSQL Indexing & Query Optimization · Transactions · MongoDB & Document Databases · Caching with Redis (NEW) · Schema Migrations (Flyway)

- **JPA Entity Mapping**: One-to-Many Category → Products; Bidirectional relationship syncing.
- **Lazy vs Eager**: Reproduce N+1 error logs; Fix with `JOIN FETCH` and `@EntityGraph`.
- **JPQL & Native Queries**: Custom JPQL finder methods; Pagination with `Pageable`.
- **PostgreSQL Indexing**: Baseline `EXPLAIN ANALYZE` before index; Composite index on `(category, price)`.
- **Transactions**: `@Transactional` fund transfer; `REQUIRES_NEW` propagation.
- **MongoDB**: Embedded reviews vs referenced User; Aggregation pipeline for average rating.
- **Caching with Redis (NEW)**: `@Cacheable` product catalog lookup; `@CacheEvict` on update; Latency comparison benchmark.
- **Schema Migrations**: Flyway `V1__create_products_table.sql`; Safe two-step column rename.
- 🛒 **Final Project**: *ShopFlow Database Layer* backed by Postgres, MongoDB, Redis cache, Flyway, and Testcontainers integration tests.

## Phase 5 — Production Readiness & Cloud-Native Basics (NEW)
Observability & Actuator · Resilience & Rate Limiting · Containerization with Docker · Messaging & Events (Awareness Level)

- **Observability & Actuator**: Expose `/actuator/health` and `/actuator/metrics`; MDC request tracing filter outputting JSON.
- **Resilience & Rate Limiting**: Resilience4j `RateLimiter` on product search; `CircuitBreaker` around external calls.
- **Containerization**: Multi-stage Dockerfile for Spring Boot; Full local stack with `docker-compose.yml`.
- **Messaging & Events**: In-process `ApplicationEventPublisher` domain events; Transactional Outbox pattern table.
- 🛒 **Final Project**: *ShopFlow Production Hardening* with Actuator health, MDC JSON logging, rate limiting, circuit breaking, outbox table, and `docker-compose`.

---

# PART B: Frontend Engineering — Revised Edition

*(Phases 5 and 6: HTML, CSS, Tailwind/shadcn, JavaScript, TypeScript, React, Testing, and Next.js)*

## At a Glance
- **Phases:** 5–6 | **Topics:** 15 | **Duration:** 8–10 weeks | **Difficulty:** Beginner → Intermediate

## Phase 5 — Frontend Foundations
HTML · CSS (+ Container Queries) · Tailwind CSS & shadcn/ui · JavaScript (ES6+ & Event Loop) · TypeScript

- **HTML**: Semantic Portfolio Page; Accessible Contact Form with validation; ARIA-Enhanced Dropdown Widget.
- **CSS (UPDATED)**: Responsive Flexbox Navbar; CSS Grid Photo Gallery; Container Query Card (`container-type: inline-size`).
- **Tailwind & shadcn/ui (UPDATED)**: Utility-first portfolio rebuild; Custom `tailwind.config`; shadcn/ui CLI copy-in Dialog & Select; Bootstrap comparison audit.
- **JavaScript ES6+ (UPDATED)**: Vanilla JS To-Do list DOM manipulation; Weather App `fetch()`; Event loop microtasks vs macrotasks prediction drill.
- **TypeScript**: JS to TS conversion (`Task` interface); Discriminated union type narrowing; Strict mode migration (`strict: true`).
- 🛒 **Final Project**: *ShopFlow Static Storefront* built in HTML/Tailwind/shadcn/TS with container queries and `localStorage` cart.

## Phase 6 — Frontend Application Layer
React + TypeScript · Component Architecture · Forms with RHF + Zod · Axios + TanStack Query · State Management (Context vs Zustand) · Types of APIs · Testing (Vitest, RTL, Playwright) · Performance & Core Web Vitals · Frontend Dev Tools · Next.js Primer

- **React + TS (UPDATED)**: Protected auth routes; Product listing with skeletons; Custom hook extraction (`useProducts`); `ErrorBoundary` + focus management.
- **Component Architecture (NEW)**: Compound Component `Tabs`; Controlled vs Uncontrolled form audit; Reusable library (`Button`, `Input`, `Modal`, `Table`, `Pagination`).
- **Forms with RHF + Zod (NEW)**: Checkout form with `zodResolver`; Async server validation; Reusable `FormField` component wrapper.
- **Axios + TanStack Query (UPDATED)**: Centralized Axios instance with interceptors; `useQuery` migration; Optimistic cart `useMutation`.
- **State Management (NEW)**: Cart in `Context`; Context re-render isolation with Zustand store; Server state vs Client state audit.
- **Types of APIs**: WebSocket/SSE Live Order Status Widget; Polling vs WebSocket comparison.
- **Testing (NEW)**: Vitest + RTL component tests for Button/Input; Mocked API component test; Playwright E2E test (login → cart → checkout).
- **Performance (NEW)**: Baseline Lighthouse audit; Route code-splitting with `React.lazy` + `Suspense`; `useMemo`/`useCallback` cost verification.
- **Dev Tools (UPDATED)**: Network/Application tab fluency pass; Storybook setup for isolated component testing.
- **Next.js Primer (NEW)**: App Router rebuild of product page; Client Component boundary (`"use client"`); View-source SEO comparison against SPA.
- 🛒 **Final Project**: *ShopFlow Production-Ready React Frontend* wired to Spring Boot backend, TanStack Query, RHF+Zod, Zustand, Vitest, Playwright, Storybook, and Next.js primer page.

---

# PART C: Deployment, Cloud & Integrations (v2)

*(Phases 7 through 9: External APIs, Deployment Core, Production Operations & Reliability)*

## At a Glance
- **Phases:** 7–9 | **Topics:** 24 (12 new) | **Duration:** 10–12 weeks | **Difficulty:** Intermediate → Advanced → Production

## Phase 7 — External APIs
- **Payment Integration**: Stripe/PayMongo checkout; Webhook signature verification; Idempotent webhook handling; Failed charge handling; Refund flow.
- **Email Integration**: SendGrid/Resend setup; Order confirmation HTML template; Password reset token email; Shipping notification; Failed email retry.
- **OAuth & Social Login**: Google OAuth authorization code flow; Account linking by email; New user creation; Error handling; GitHub OAuth provider.
- **File Storage & Uploads**: Multipart product image upload to Cloudinary/S3; Drag-and-Drop dropzone UI; Type/size validation; Automatic thumbnail transforms; Orphaned file cleanup.
- **AI API Integration**: AI Product Description Generator with Claude/OpenAI; Strict JSON response parsing; AI Search Assistant; Rate limit & cost guardrails; Graceful fallback.
- 🛒 **Final Project**: PayMongo/Stripe checkout + SendGrid emails + Google OAuth + Cloudinary uploads + Claude AI search bar.

## Phase 8 — Deployment Core
- **Docker & Containerization**: Spring Boot Dockerfile; Multi-stage React+Nginx Dockerfile; `docker-compose` full stack; Env vars; Named volumes.
- **Reverse Proxies & Nginx (NEW)**: Nginx reverse proxy `proxy_pass` to backend; Serving React build with `try_files`; Single domain entry point; `limit_req` rate limiting.
- **Secrets & Environment Management (NEW)**: Dev vs Prod profiles (`application-prod.yml`); Platform secret store (Railway/Render/GitHub Actions); `gitleaks` secret scanning; Credential rotation.
- **Infrastructure as Code (NEW)**: Terraform provider block for AWS S3 bucket; Recreating manual resources in code; Remote `terraform.tfstate` backend; Clean `terraform destroy`.
- **CI/CD with GitHub Actions**: `.github/workflows/ci.yml`; Multi-job parallel pipeline; Build & push Docker image to GHCR; Branch protection; Auto-deploy on merge.
- **Blue-Green Deployments & Rollbacks (NEW)**: Blue-green deployment on PaaS; Practiced rollback timing; Backward-compatible database migrations; Canary deployment awareness.
- **Cloud Compute Basics**: EC2 free-tier instance launch & SSH; Elastic Beanstalk deployment; Google Cloud Run deployment; Provider cost comparison; Resource termination routine.
- **Kubernetes (Intro Only) (NEW)**: Local `minikube`/`kind` cluster; Pod Deployment YAML; Service NodePort/port-forwarding; `kubectl scale` to 3 replicas & pod kill demo; Written "Why K8s" analysis.
- 🛒 **Final Project**: ShopFlow containerized with Nginx reverse proxy, Terraform infra, GitHub Actions CI/CD, encrypted secret store, and K8s deployment exercise.

## Phase 9 — Production Operations & Reliability
- **Cloud Storage**: AWS S3 bucket upload; Public vs pre-signed private URL access; GCS equivalent; Cloudinary transform rules; Storage lifecycle auto-delete rules.
- **CDN (NEW)**: Header inspection of Vercel/Netlify CDN; CloudFront in front of S3; Manual cache invalidation on deploy.
- **PaaS Hosting**: Frontend deployment to Vercel/Netlify; Backend deployment to Railway/Render; Env-based API base URLs; PR preview environments; PaaS vs Cloud Compute comparison.
- **Domains & HTTPS**: CNAME/A record DNS configuration; `api.yourdomain.com` subdomain setup; Automatic Let's Encrypt SSL HTTPS confirmation; DNS record types drill; Forced HTTPS redirect.
- **Metrics & Prometheus (NEW)**: Micrometer Prometheus registry endpoint `/actuator/prometheus`; Running Prometheus via Docker; Golden signals query (rate, latency, error); Custom business metric `orders_placed_total`.
- **Grafana Dashboards (NEW)**: Grafana data source connection; Community JVM dashboard import; Panel alert rules.
- **OpenTelemetry & Distributed Tracing (NEW)**: OpenTelemetry Java agent auto-instrumentation; End-to-end trace waterfall in Jaeger; Error span correlation.
- **Logging & Error Tracking**: Uptime monitor downtime alerts; Sentry error tracking integration; Structured JSON log review; Alerting rules; Incident postmortem practice.
- **Queues & Async Processing (NEW)**: Offloading order emails to RabbitMQ/SQS; Dead-letter queue retry with backoff; Async AI description generator worker; Queue depth metric monitoring.
- 🛒 **Final Project**: Fully deployed, observable, rollback-able ShopFlow stack with HTTPS, CDN, Prometheus, Grafana, OpenTelemetry, Sentry, RabbitMQ queues, and Terraform.

---

# PART D: Data Structures & Algorithms (Revised)

*(Phase 9 / DSA: 17 Topics, 85 Hands-on Projects, ~163 LeetCode Problems)*

## At a Glance
- **Phase:** 9 / DSA | **Topics:** 16 Core + 1 Optional | **Duration:** 10–13 weeks | **Difficulty:** Intermediate → Advanced

## Core DSA Topics (9.0 – 9.16)

1. **9.0 Recursion & Recursive Thinking (NEW)** (5 projects | 8 LC): Factorial & Fast Power; Sum of Digits & Reversal; Recursive Array Search; Tower of Hanoi; Recursion-to-Iteration conversion drill.
2. **9.1 Arrays & Strings** (6 projects | 15 LC): Two Sum variants; Longest Substring Without Repeating Characters; Prefix Sum range queries; Kadane's algorithm; String reversal & palindrome; Merge Intervals.
3. **9.2 Hashing** (5 projects | 10 LC): HashMap from scratch; Frequency map drill; Two Sum family; Group Anagrams; Longest Consecutive Sequence ($O(n)$ with HashSet).
4. **9.3 Two Pointers & Sliding Window — Pattern Review (NEW)** (5 projects | 8 LC): Sliding Window Maximum ($O(n)$ deque); Minimum Window Substring; Fixed-size window drill; Two Pointers vs Sliding Window decision matrix; Find Duplicate Number (Floyd's cycle on array).
5. **9.4 Stacks & Queues** (6 projects | 10 LC): Stack from scratch; Valid Parentheses; Min-Stack ($O(1)$ `getMin`); Queue from scratch; Monotonic Stack Next Greater Element; Queue using two Stacks.
6. **9.5 Sorting & Searching** (5 projects | 10 LC): Merge Sort from scratch; Quick Sort from scratch; Binary Search & variants (first occurrence, insertion point); Search in Rotated Sorted Array; Sorting algorithm timing comparison.
7. **9.6 Linked Lists** (6 projects | 10 LC): Singly Linked List from scratch; Reverse Linked List (iterative & recursive); Floyd's cycle detection; Doubly Linked List; Merge Two Sorted Lists; LRU Cache payoff project.
8. **9.7 Backtracking (NEW)** (5 projects | 10 LC): Subsets (choose/explore/un-choose template); Permutations; Combination Sum; N-Queens ($O(1)$ bitmask conflict check); Word Search grid DFS.
9. **9.8 Trees** (5 projects | 15 LC): Traversals (in/pre/post/BFS); Binary Search Tree from scratch (insert/search/delete); Height & balance check; Lowest Common Ancestor; Serialize & Deserialize Binary Tree.
10. **9.9 Heaps & Priority Queues** (6 projects | 8 LC): Min-Heap from scratch (sift-up/sift-down); Kth Largest Element; Heap Sort; Merge K Sorted Lists; Running Median with Two Heaps; Top-K & scheduling patterns.
11. **9.10 Tries (NEW)** (5 projects | 5 LC): Trie from scratch; Delete from Trie; Word Search II (Trie + Backtracking); Autocomplete system with frequency ranking; Longest Common Prefix.
12. **9.11 Graphs** (6 projects | 15 LC): Adjacency list BFS/DFS traversals; Connected Components; Unweighted Shortest Path (BFS bridge to Dijkstra); Topological Sort (Kahn's algorithm); Dijkstra's algorithm with PriorityQueue; Union-Find cycle detection.
13. **9.12 Union-Find (Disjoint Set) (ELEVATED)** (4 projects | 5 LC): Union-Find from scratch (path compression + rank); Number of Provinces; Redundant Connection; Accounts Merge.
14. **9.13 Greedy Algorithms (NEW)** (5 projects | 8 LC): Activity/Interval Selection; Jump Game I & II; Gas Station circuit; Greedy vs DP counterexample (0/1 Knapsack); Huffman Coding tree build.
15. **9.14 Bit Manipulation (NEW)** (5 projects | 6 LC): Bitwise operators (`setBit`, `clearBit`, `n & (n-1)`); Single Number (XOR trick); Counting Bits via DP; Power of Two/Four check; Subsets via Bitmask.
16. **9.15 Dynamic Programming** (7 projects | 20 LC): Fibonacci (naive → memoized → tabulated); House Robber I & II; 0/1 Knapsack 2D DP; Longest Common Subsequence; Coin Change (unbounded knapsack); Unique Paths grid DP; State-Machine DP (Buy/Sell Stock with Cooldown).
17. **9.16 Segment Trees & Fenwick Trees (OPTIONAL / ADVANCED)** (2 projects | 4 LC): Segment Tree range sum & point update; Fenwick Tree (Binary Indexed Tree) prefix sum.

## 🛒 Practical DSA Applications in ShopFlow

| Feature | Data Structure / Algorithm Applied |
| :--- | :--- |
| **Product search** | Trie-based autocomplete for the search bar |
| **Category tree** | Recursive tree traversal to build nested category menu |
| **Order queue** | Priority queue (heap) for SLA order processing |
| **Recommendations** | Graph of 'users who bought X also bought Y' (BFS) |
| **Inventory restock** | Min-heap to surface lowest-stock items first |
| **Delivery routing** | Dijkstra on a city graph for shortest delivery path |
| **Coupon selection** | Greedy interval scheduling for non-overlapping promotions |
| **Duplicate customer merge** | Union-Find to merge accounts sharing email/phone |
| **Combo offer generator** | Backtracking to generate valid bundle offers under price caps |
| **Feature flags & permissions** | Bitmasking to store and check user roles/flags in an int |

---

# PART E: Career & Interview Readiness (Redesigned)

*(Phase 10: Portfolio, 4-Round Mock Circuit, Recruiter Communications, and Offer Negotiation)*

## At a Glance
- **Phase:** 10 (Redesigned) | **Topics:** 6 | **Duration:** 4 weeks | **Goal:** Clear all 4 mock rounds & land job offer

## 1. Panel Evaluation & Required Fixes
- **Resume**: ATS-safe single-page formatting pass + application tailoring step.
- **Portfolio**: 3-project portfolio strategy (ShopFlow + API + CLI script).
- **GitHub**: 90-second reviewer skim checklist & clean commit history hygiene.
- **LinkedIn & Networking**: Direct outreach to alumni & engineers at target companies.
- **System Design**: Feature design prompt prep alongside scaling architecture.
- **Security**: Code review exercise auditing peer/open-source PRs.
- **Behavioral**: STAR story bank timed to 60–90 seconds + company research.
- **Mock Circuit**: 4 distinct interview formats with rubric evaluation and video recording review.

## 2. Missing Industry Skills
- **Salary Negotiation**: Counter-offer script practice with levels.fyi data.
- **Technical Writing & Blogging**: Write and publish post #1 on architectural decisions.
- **Code Review & Pair Programming**: 45-minute live driver/navigator exercise.
- **Reading Unfamiliar Codebases**: 30-minute open-source codebase mapping pass.
- **Take-Home Assignments**: 3-4 hour timed take-home exercise with README.

## 3. 4-Round Mock Interview Circuit
1. **Round 1 — DSA Solo (45 min)**: 1 medium LeetCode problem, live video think-aloud, edge-case testing, space/time complexity analysis.
2. **Round 2 — System Design Feature (30 min)**: Requirements gathering, data model drawing, tradeoff analysis, failure mode identification.
3. **Round 3 — Pair/Collab (45 min)**: Add a feature to an unfamiliar codebase together with driver/navigator role rotation.
4. **Round 4 — Behavioral + Take-Home Defense (30 min)**: 60-90s STAR responses + live defense of prior take-home architectural choices.

## 4. 3-Project Portfolio Strategy
1. **ShopFlow (Capstone)**: Depth — full-stack ownership, auth, databases, deployment, scaling, observability.
2. **Tiny Public API + Docs (1 weekend)**: REST design taste & technical writing.
3. **CLI Tool / Automation Script (1 weekend)**: Tooling instincts & unprompted initiative.
4. **Merged Open-Source PR**: External validation from an open-source maintainer review.

## 5. Phase 10 Redesigned 4-Week Sprint

| Week | Focus Topics | Key Deliverables |
| :---: | :--- | :--- |
| **Week 1** | System Design & API Craft; Security & Code Review | REST API design exercise; OWASP audit; Open-source PR code review. |
| **Week 2** | Resume, Portfolio & Brand; Networking & Recruiter Communication | 3-project portfolio site live; Blog post #1 published; Outreach templates drafted; 1 PR submitted. |
| **Week 3** | Applied Interview Skills | Timed 3-4 hr take-home; Live pair-programming session; Unfamiliar codebase mapping. |
| **Week 4** | Interview Prep & Negotiation Sprint | 4-round mock interview circuit completed; Salary negotiation script practiced out loud. |

---

> ### 🏁 The Job-Ready Bar
> Explain ShopFlow's architecture out loud, defend its technical decisions, point to a live deployed URL with a second and third portfolio piece behind it, solve a medium LeetCode problem under time pressure, show one merged open-source PR, and clear all four mock-interview rounds. That combination — not any single phase alone — is what gets you hired.
