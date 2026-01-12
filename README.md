# AI-Augmented Collaborative Blended Modeling Environment
# User & Developer Manual
# 1. Overview

This repository contains the web-based collaborative modeling environment developed as part of the research work titled:

“AI-Augmented Real-Time Collaborative Blended Modeling Framework for Automotive Embedded Systems”

The system enables real-time multi-user collaboration over EAST-ADL–inspired textual models (EAText), provides role-based access control, conflict-aware merging, fault-tolerant persistence, and Explainable AI (XAI) log summarization using a local LLM.

⚠️ Note:
The desktop graphical environment (EATOP-based editor) is proprietary and therefore not open-sourced. This repository contains the complete web collaborative environment, backend services, and XAI log pipeline.

# 2. System Requirements
**Software:**

Java 17+

Node.js 18+

Maven 3.8+

MySQL 8.0+

Git

**For XAI Module:**

Ollama (local LLM runtime)

Supported models: llama3, codellama, tinyllama

# 3. Installation & Setup
**Step 1 – Clone the Repository**
git clone https://github.com/MisbahAwan/CollaborativeBlendedModelingFramework.git
cd <CollaborativeBlendedModelingFramework>

**Step 2 – Database Setup**

Create a database:

CREATE DATABASE bumble_db;


Import schema:

mysql -u root -p bumble_db < database/schema.sql

**Step 3 – Backend Services**
cd backend
mvn clean install
mvn spring-boot:run


This will start:

Role Service

Merge Service

Persistence Service

Logging Service

**Step 4 – Frontend (Web Editor)**
cd frontend
npm install
npm start


Access at:

http://localhost:8080

**Step 5 – XAI Log Engine (Optional but Recommended)**

Install Ollama

Pull model:

ollama pull llama3


Start XAI service:

# 4. Collaborative Workflow

User logs in

Opens or creates a model

Edits in real-time (EAText)

Auto-save every 10 seconds

Changes are:

validated

merged

versioned

logged with metadata

# 5. Conflict Handling & Merge Logic

Conflicts are handled using:

Scope rules (MR-2)

Validity rules (MR-3)

Precedence rules (MR-4)

Provenance embedding (MR-5)

All conflicts are either:

Auto-resolved

Quarantined

Or flagged for manual review

# 6. XAI Log Analysis

The XAI module:

Reads collaboration logs

Applies rule-based filtering

Generates natural language summaries using local LLMs

Example output:

“User martin renamed ExecutionTimeConstraint ETC12345 to ETC1234 and removed obsolete timing fields.”

This supports:

Managerial oversight

Design reviews

Audit trails

# 7. Auto-Save, Versioning & Recovery

Auto-save every 10 seconds

Manual save option available

Each snapshot is:

timestamped

user-tagged

session-bound

Offline edits are:

restored on reconnection

marked as provisional

merged only after approval

# 8. Contact

For questions, collaboration, or industrial deployment:

Misbah Mehboob Awan
PhD Researcher – NUST
Email: mmehboob.cse19ceme@ce.ceme.edu.pk
