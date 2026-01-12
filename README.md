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

cd xai-engine
python app.py

