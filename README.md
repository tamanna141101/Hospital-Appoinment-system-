# 🏥 Hospital Appointment System

A **Java-based console application** for managing hospital appointments. The system allows patients to enter their information, select hospital types, choose hospitals and departments, select available appointment times, and provides separate login options for patients, doctors, and administrators.

## 📌 Project Overview

The **Hospital Appointment System** is a menu-driven Java application designed to simplify the basic hospital appointment process.

Patients can provide their personal information, select their preferred hospital and department, and choose an available appointment time. The system also provides separate access for doctors and administrators to view appointment-related information.

## ✨ Features

### 👤 Patient Features

* Guest mode
* Patient registration
* Patient login
* Patient information input
* Gender selection
* Blood group selection
* Date of birth and age calculation
* Phone number validation
* Email validation
* Hospital selection
* Government and private hospital options
* Department selection
* Appointment time selection
* Appointment information display

### 👨‍⚕️ Doctor Features

* Doctor login
* View appointment list
* View patient information
* Logout option

### 🔐 Admin Features

* Admin login
* View patient information
* Confirm appointment
* Cancel appointment
* Logout option

## 🏥 Hospital Categories

The system provides two types of hospitals:

### Government Hospitals

* Dhaka Medical College
* Sir Salimullah Medical College
* Kurmitola General Hospital
* Mirpur Maternity Hospital
* Bangladesh Railway Hospital

### Private Hospitals

* Asgar Ali Hospital
* Lab-Aid Cardiac and Specialized Hospital
* BIRDEM Hospital
* Ibn Sina Medical College and Hospital
* United Hospital Gulshan

## 🩺 Available Departments

Patients can choose from several departments, including:

* Cardiology
* Urology
* Nephrology
* Neuro Medicine
* Medicine
* Dermatology

## ⏰ Appointment Time

Available appointment slots include:

* 04:00 PM — Booked
* 05:00 PM — Available
* 06:00 PM — Available
* 07:00 PM — Booked
* 08:00 PM — Available
* 09:00 PM — Available

## 🛠️ Technologies Used

* **Java**
* **Object-Oriented Programming (OOP)**
* **Java Scanner**
* **Java Calendar / GregorianCalendar**
* **NetBeans**
* **Apache Ant**

## 📂 Project Structure

```text
Hospital-Appoinment-system-
│
└── HospitalAppinmentSystem/
    │
    ├── build.xml
    ├── manifest.mf
    │
    ├── nbproject/
    │
    └── src/
        └── hospitalappinmentsystem/
            │
            ├── HospitalAS.java
            ├── HospitalAS2.java
            └── MainClass.java
```

## 🧩 Main Classes

### `HospitalAS.java`

Contains the main variables and shared data used throughout the application, including:

* Patient information
* Hospital information
* Department information
* Appointment time
* Login credentials

### `HospitalAS2.java`

Contains the main functionality of the application, including:

* Main menu
* Patient menu
* Registration
* Login
* Patient information form
* Hospital selection
* Department selection
* Appointment booking
* Doctor menu
* Admin menu
* Appointment confirmation/cancellation

### `MainClass.java`

The main entry point of the application.

It creates an object of `MainClass` and starts the system through the main menu.

## 🔑 Demo Login Credentials

The project contains predefined credentials for demonstration purposes.

### Patient

```text
User ID: 20100026
Password: tamanna
```

### Doctor

```text
User ID: doctor
Password: doctor
```

### Admin

```text
User ID: admin
Password: admin
```

> These credentials are hard-coded for this academic/demo project and should be replaced with secure authentication in a production system.

## 🚀 How to Run

### Prerequisites

Make sure you have:

* Java JDK installed
* NetBeans IDE installed
* Apache Ant support enabled

### Run Using NetBeans

1. Clone or download the repository.
2. Open **NetBeans IDE**.
3. Select **File → Open Project**.
4. Select the `HospitalAppinmentSystem` folder.
5. Open the project.
6. Run `MainClass.java`.
7. Follow the menu options shown in the console.

### Run Using Command Line

From the project directory, compile and run the main class:

```bash
javac -d build/classes src/hospitalappinmentsystem/*.java
java -cp build/classes hospitalappinmentsystem.MainClass
```

## 🔄 Application Flow

```text
Start
  ↓
Main Menu
  ↓
Choose User Type
  ├── Doctor
  │    ↓
  │  Login
  │    ↓
  │  Appointment List
  │
  ├── Patient
  │    ↓
  │  Guest / Registration / Login
  │    ↓
  │  Patient Information
  │    ↓
  │  Hospital Selection
  │    ↓
  │  Department Selection
  │    ↓
  │  Appointment Time
  │    ↓
  │  Appointment Confirmation
  │
  └── Admin
       ↓
     Login
       ↓
   Patient Information
       ↓
 Confirm / Cancel Appointment
```

## 📚 Concepts Demonstrated

This project demonstrates several fundamental Java programming concepts:

* Classes and objects
* Inheritance
* Methods
* Conditional statements
* Loops
* `Scanner` for user input
* String manipulation
* Arrays
* `StringBuffer`
* Date and time handling
* Input validation
* Menu-driven programming
* Basic authentication
* Console-based application design

## 🎯 Learning Outcomes

Through this project, I practiced:

* Building a complete console-based Java application
* Applying Object-Oriented Programming concepts
* Designing menu-driven applications
* Handling user input and validation
* Implementing role-based access for patients, doctors, and administrators
* Working with date and time APIs
* Structuring a Java project using NetBeans and Ant

## 🔮 Future Improvements

The current project is a console-based academic application. It can be further improved by adding:

* MySQL database integration
* Secure password hashing
* Real user authentication
* Doctor profiles and schedules
* Multiple patient records
* Persistent appointment records
* Email/SMS appointment
