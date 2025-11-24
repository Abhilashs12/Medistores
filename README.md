# 🏥 MediStore – Digital Medical Records Management System

## 📌 Overview
MediStore is a streamlined digital medical records system designed to modernize how clinics and healthcare environments manage patient information. It replaces manual record-keeping with a structured, secure, and workflow-driven platform built using Spring Boot, Spring Data JPA, Thymeleaf, and MySQL. The solution emphasizes operational efficiency, data accuracy, and ease of use, delivering a practical system aligned with real-world healthcare needs.

---

## 🩺 Project Description
MediStore enables medical staff to store, update, and access patient details including demographics, diagnosis, and prescriptions through an intuitive interface. By adopting enterprise-grade backend architecture and database-driven persistence, the system ensures reliability, reduced administrative workload, and faster information access. The design philosophy focuses on stability, maintainability, and proven patterns—not academic experimentation—making it suitable for deployment in small medical practices.

---

## 🎯 Problem Statement
Healthcare facilities relying on paper records face:
- Lost or damaged patient files
- Delays in retrieving medical history
- Manual duplication and transcription errors
- Lack of centralized access for practitioners
- No role-based access safeguards

MediStore resolves these challenges with a digital, structured, and permissioned record system.

---

## ✅ Objectives
- Provide a centralized digital repository for patient medical information  
- Enable authorized clinical staff to manage records efficiently  
- Support CRUD workflow for patient profiles and prescriptions  
- Deliver a clean, user-friendly interface for day-to-day usage  
- Maintain data accuracy and traceability  

---

## 🔐 Key Features
### 🧾 Patient Record Management
- Add, edit, view, and delete patient records
- Capture demographics, diagnosis, and prescriptions

### 🔍 Search & Filtering (Upgrade Path)
- Name search
- Diagnosis filtering
- Gender filtering

### 🔑 Role-Based Access (Upgrade Path)
- Admin – full access
- Doctor – view + update
- Staff – view only

### 🧱 Architecture Highlights
- MVC layering (Controller → Service → Repository)
- Auto schema creation with Hibernate/JPA
- Template-based UI with Thymeleaf

---

## 🛠 Tech Stack
| Layer | Technology |
|-------|------------|
| Framework | Spring Boot |
| View Engine | Thymeleaf |
| Persistence | Spring Data JPA |
| Database | MySQL |
| ORM | Hibernate |
| Build | Maven |
| Server Port | 9595 |
src/main/java/com/medistore
│
├── controller
├── service
│ └── impl
├── repository
├── entity
└── MediStoreApplication.java

src/main/resources
├── templates
│ ├── patients.html
│ ├── patient-form.html
│ └── patient-view.html
└── application.properties


---

## ⚙️ Installation & Setup

### ✅ Prerequisites
- Java 17+
- Spring Tool Suite (STS) or IntelliJ
- MySQL installed
- Maven configured

### ✅ Database Setup
```sql
CREATE DATABASE medistores;

✅ Application Configuration

In application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/medistores
spring.datasource.username=root
spring.datasource.password=root
server.port=9595

✅ Run the Application

In STS:

Right click project → Run As → Spring Boot App

✅ Access in Browser
http://localhost:9595/patients

/screenshots/edit-record.png
| Database Name | `medistores` |

---

## 🗂 Project Structure
