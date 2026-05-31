# VibeCode 🚀

VibeCode is an enterprise-grade, multi-tenant cloud IDE and AI-assisted development platform backend built using **Spring Boot 4.0.6** and **Java 21**. The platform provides a virtual file system workspace, multi-user real-time collaboration with granular workspace permissions, ephemeral preview environment pipelines, automated token-audited AI generation channels, and a scalable usage gating matrix backed by Stripe.

---

## 🛠️ System Architecture & Tech Stack

VibeCode follows a strict, decoupled Layered Domain Architecture ensuring clear separation of concerns across presentation, business orchestration, and persistence layers.

### Core Technology Blueprint
* **Core Application Framework:** Spring Boot 4.0.6 utilizing advanced Java 21 runtime optimizations.
* **Build Integration Engine:** Apache Maven 3.9.15 alongside strict platform wrapper setups (`mvnw`, `mvnw.cmd`).
* **Relational Core Database:** PostgreSQL managed via Spring Data JPA Object-Relational Mapping (ORM).
* **Workspace Asset Blob Engine:** MinIO Cloud Object Storage mapping local abstract virtual system layouts.
* **Monetization & Metering Pipeline:** Stripe REST API for secure multi-tier subscription lifecycle synchronization.
* **Boilerplate Minimization:** Project Lombok metadata code generation triggers.

---

## 🏗️ Deep-Dive Component Architecture

### 1. Presentation Layer (REST API Endpoints)
The REST boundaries are encapsulated inside deterministic Java records (`dto/`) to ensure thread-safe, immutable data exchanges:

com.bs.VibeCode.controller
├── AuthController           # Lifecycle profiles, signups, and session tokens[cite: 1, 2].
├── ProjectController        # Active workspace CRUD matrix and structural layout logic[cite: 1, 2].
├── FileController           # In-memory virtual repository trees and byte streams[cite: 1, 2].
├── ProjectMemberController  # Access management, invite graphs, and team roles[cite: 1, 2].
├── BillingController        # Stripe billing redirects and checkout portals[cite: 1, 2].
└── UsageController          # Compute telemetry tracking, pod logs, and AI token bounds[cite: 1, 2].


### 2. Business Logic & Service Layers
Business flows are decoupled through explicit interfaces (`service/`) and their runtime realizations (`service/impl/`) to manage transactional context maps seamlessly[cite: 1, 2]:
* **`FileServiceImpl`**: Decouples physical file allocations from virtual indices, transforming flat storage spaces into hierarchical directories (`FileNode`)[cite: 1, 2].
* **`SubscriptionServiceImpl` & `UsageServiceImpl`**: Creates an inline validation circuit. Requests to invoke AI engines or launch live preview pods are dynamically checked against the current commercial bounds before execution[cite: 1, 2].
* **`ProjectMemberServiceImpl`**: Operates on a composite primary validation schema (`ProjectMemeberId`), evaluating resource access permissions down to the specific team member level[cite: 1, 2].

---

## 🗄️ Relational Domain Schema & Data Taxonomy

The core persistent layout models the system data properties using a clean, normalized structure[cite: 1, 2]:

                              +-------------------+
                              |       User        |
                              +-------------------+
                               /                 \
                    1         /                   \ 1
                             /                     \
     +-----------------------+--+               +---+-------------------+
     |      Subscription        |               |      Project          |
     +-----------------------+--+               +---+-------------------+
                 |                                 /        |        \
                 | 1                              / 1       | 1       \ 1
                 |                               /          |          \
     +-----------+----------+   +---------------+--+  +-----+----+  +---+---------------+
     |         Plan         |   |   ProjectFile    |  | Preview  |  |   ProjectMember   |
     +----------------------+   +------------------+  +----------+  +-------------------+
                 |                                                      (Composite Key)[cite: 1, 2]
                 | 1
                 |
     +-----------+----------+
     |       UsageLog       |
     +----------------------+

### Key Domain Logic Models
* **`User` & `Project`:** The bedrock foundations. Projects capture general workspace scopes, soft-delete metadata, and owner mappings[cite: 1, 2].
* **`ProjectMember` & `ProjectMemeberId`:** Bridges workspace links across team boundary spaces, matching users to projects with explicit authorization scopes (`ProjectRole`: `EDITOR`, `VIEWER`)[cite: 1, 2].
* **`ProjectFile`:** Represents abstract storage locations, holding physical tracking pointers (`minioObjectKey`) that map to remote object buckets[cite: 1, 2].
* **`Preview`:** Manages live serverless execution tracking parameters, tracking container instances via exact platform state flags (`PreviewStatus`: `RUNNING`, `FAILED`, `STOPPED`)[cite: 1, 2].
* **`ChatSession` & `ChatMessage`:** Keeps conversation historical chains contextually isolated. Each message records specific generative costs (`tokensUsed`) alongside precise architectural role attributes (`MessageRole`: `USER`, `ASSISTANT`, `SYSTEM`, `TOOL`)[cite: 1, 2].
* **`Plan`, `Subscription` & `UsageLog`:** Forms the infrastructure's resource management engine. Subscriptions match user accounts to commercial tiers (`Plan`), which enforce hard functional bounds (`maxProjects`, `maxTokensPerDay`, `maxPreviews`), verified against historical telemetry logs (`UsageLog`)[cite: 1, 2].

---

## 🔐 Authorization Matrix & Security Enforcement

Workspace transactions are intercepted and evaluated based on the following explicit access tiers[cite: 1, 2]:

| Capability / Resource Action | `EDITOR` | `VIEWER` |
| :--- | :---: | :---: |
| Modify Workspace Structure (Create/Rename/Delete Files) | ✅ | ❌ |
| Commit Inline Code Buffer Updates | ✅ | ❌ |
| Spin Up Ephemeral Live Previews | ✅ | ❌ |
| Read Workspace Tree Data & Hierarchy Structure | ✅ | ✅ |
| Inspect Live Deployment Status & Running Pod Previews | ✅ | ✅ |

---

## 🚀 Getting Started & Local Environments

### Prerequisites
* **Java Development Environment:** JDK 21 installation[cite: 1, 2].
* **Database Platform:** PostgreSQL relational runtime[cite: 1, 2].
* **Object Store Interface:** MinIO storage bucket deployment[cite: 1, 2].
* **Commercialization Suite:** Active Stripe developer API dashboard keys[cite: 1, 2].

### 🔧 Step-by-Step Installation

1. **Clone the Source Tree:**
```bash
   git clone [https://github.com/your-username/VibeCode.git](https://github.com/your-username/VibeCode.git)
   cd VibeCode
Environment Variable Configurations:
Create an active override configuration or customize your runtime context parameters within src/main/resources/application.properties[cite: 1, 2]:

Properties
   spring.application.name=VibeCode[cite: 1, 2]
   
   # PostgreSQL Connection Parameters
   spring.datasource.url=jdbc:postgresql://localhost:5432/vibecode_db
   spring.datasource.username=your_postgres_user
   spring.datasource.password=your_postgres_password

   # MinIO Object Storage Configurations
   minio.endpoint=http://localhost:9000
   minio.access.key=your_minio_access_key
   minio.secret.key=your_minio_secret_key
   minio.bucket.name=vibecode-workspace-vault

   # Stripe Commercial Integration Core
   stripe.api.key=sk_test_...
   stripe.webhook.secret=whsec_...
Build and Package Executable Target Binaries:

Bash
   # Linux/macOS environments[cite: 1, 2]
   ./mvnw clean package

   # Windows native target terminals[cite: 1, 2]
   .\mvnw.cmd clean package
Launch the Local Application Instance:

Bash
   # Linux/macOS environments[cite: 1, 2]
   ./mvnw spring-boot:run

   # Windows native target terminals[cite: 1, 2]
   .\mvnw.cmd spring-boot:run
Execute Validation & Comprehensive Test Suite:

Bash
   ./mvnw test[cite: 1, 2]
📌 Development Roadmap & Implementation Targets
Concrete Business Implementation Contracts: Concrete implementation service components (AuthServiceImpl, ProjectServiceImpl, SubscriptionServiceImpl, etc.) are pre-configured skeleton interfaces pointing directly to Spring context routing profiles[cite: 1, 2]. Developers must implement the targeted logical code blocks corresponding to the input request models[cite: 1, 2].

Annotation Processing Contexts: Ensure your local IDE environment has active Annotation Processing turned on to allow Lombok to generate runtime getters, setters, builders, and constructor injections on compilation[cite: 1, 2].
