# HOSPITAL MANAGEMENT SYSTEM
## CENG201 Homework - Data Structures Project

**Date:** December 27, 2025  
**Student:** Ayşegül Delialioğlu  
**Student ID:** 230444057

---

## 📋 Table of Contents

- [Overview](#-overview)
- [Requirements](#-requirements)
- [Project Structure](#-project-structure)
- [Tasks](#-tasks)
- [Installation and Execution](#-installation-and-execution)
- [Features](#-features)
- [Data Structures](#️-data-structures)
- [Time Complexity Analysis](#-time-complexity-analysis)
- [Sample Outputs](#-sample-outputs)

---

## 🎯 Overview

This project is a Java application that simulates a hospital management system. The project uses different data structures (linked list, queue, stack) to manage patients, treatment queues, and discharge operations.

### Key Features:
- ✅ Patient addition, deletion, and search operations
- ✅ Priority and normal treatment queue management
- ✅ Discharge operations stored in stack structure
- ✅ Patient sorting by severity level
- ✅ Integrated hospital management system

---

## 🔧 Requirements

- **Java JDK:** 8 or higher (OpenJDK 25.0.1 tested)
- **Operating System:** Windows, macOS, Linux (any system supporting JVM)
- **Compiler:** `javac` (Java Compiler)
- **Runtime Environment:** `java` (Java Runtime Environment)

### Java Installation Check:
```bash
java -version
javac -version
```

### Java Installation for macOS:
```bash
# Using Homebrew
brew install openjdk

# Setting PATH
export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"
```

---

## 📁 Project Structure

```
CENG201_HW_AysegulDelialioglu_230444057-main/
│
├── src/                          # Source code files
│   ├── HW1_Task1/                # Task 1: Patient List (Linked List)
│   │   ├── Patient.java
│   │   ├── PatientList.java
│   │   └── Task1Test.java
│   │
│   ├── HW1_Task2/                # Task 2: Treatment Queue
│   │   ├── TreatmentRequest.java
│   │   ├── TreatmentQueue.java
│   │   └── Task2Test.java
│   │
│   ├── HW1_Task3/                # Task 3: Discharge Stack
│   │   ├── DischargeRecord.java
│   │   ├── DischargeStack.java
│   │   └── Task3Test.java
│   │
│   └── HW1_Task4/                # Task 4: Integrated System
│       ├── Patient.java
│       ├── PatientList.java
│       ├── TreatmentRequest.java
│       ├── TreatmentQueue.java
│       ├── DischargeRecord.java
│       ├── DischargeStack.java
│       ├── HospitalSystem.java
│       └── Task4Test.java
│
└── docs/                         # Documentation and reports
    ├── HW1_Task1/
    │   ├── Task1_Report.pdf
    │   ├── Task1_Report_Corrected.txt
    │   └── Task1output.txt
    ├── HW1_Task2/
    │   ├── Task2_Report.pdf
    │   ├── Task2_Report_Corrected.txt
    │   └── Task2output.txt
    ├── HW1_Task3/
    │   ├── Task3_Report.pdf
    │   ├── Task3_Report_Corrected.txt
    │   └── Task3output.txt
    └── HW1_Task4/
        ├── Task4_Report.pdf
        ├── Task4_Report_Corrected.txt
        └── Task4output.txt
```

---

## 📚 Tasks

### **Task 1: Patient List**
**Data Structure:** Linked List

**Purpose:** Store and manage patient information using a linked list structure.

**Features:**
- Patient addition (add to head - O(1))
- Patient deletion by ID (O(n))
- Patient search by ID (O(n))
- Print patient list
- Convert linked list to array

**Files:**
- `Patient.java` - Patient data model
- `PatientList.java` - Linked list implementation
- `Task1Test.java` - Test class

---

### **Task 2: Treatment Queue**
**Data Structure:** Queue

**Purpose:** Manage priority and normal treatment requests using a queue structure.

**Features:**
- Treatment request addition (enqueue - O(1))
- Treatment request removal (dequeue - O(1))
- Priority requests processed first
- Print queue status
- Get queue size

**Files:**
- `TreatmentRequest.java` - Treatment request model
- `TreatmentQueue.java` - Queue implementation
- `Task2Test.java` - Test class

---

### **Task 3: Discharge Stack**
**Data Structure:** Stack

**Purpose:** Store discharged patients in a stack structure (LIFO).

**Features:**
- Discharge record addition (push - O(1))
- Discharge record removal (pop - O(1))
- View top record (peek - O(1))
- Record discharge time
- Print stack contents

**Files:**
- `DischargeRecord.java` - Discharge record model
- `DischargeStack.java` - Stack implementation
- `Task3Test.java` - Test class

---

### **Task 4: Integrated Hospital System**
**Data Structures:** Linked List + Queue + Stack + HashMap

**Purpose:** Combine all components to create a fully functional hospital management system.

**Features:**
- Patient management (addition, deletion, search)
- Priority and normal treatment queues
- Treatment processing (priority first)
- Discharge operations
- Patient sorting by severity level (Bubble Sort - O(n²))
- System state visualization
- Fast patient lookup using HashMap (O(1))

**Files:**
- `HospitalSystem.java` - Main system class
- All other component classes
- `Task4Test.java` - Test class

---

## 🚀 Installation and Execution

### **1. Download the Project**
```bash
# Navigate to project directory
cd CENG201_HW_AysegulDelialioglu_230444057-main
```

### **2. Set Java PATH (If Needed)**
```bash
# For macOS (if installed via Homebrew)
export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"
```

### **3. Run Task 1**
```bash
cd src/HW1_Task1
javac *.java
java Task1Test
```

### **4. Run Task 2**
```bash
cd src/HW1_Task2
javac *.java
java Task2Test
```

### **5. Run Task 3**
```bash
cd src/HW1_Task3
javac *.java
java Task3Test
```

### **6. Run Task 4**
```bash
cd src/HW1_Task4
javac *.java
java Task4Test
```

### **7. Run All Tasks at Once**
```bash
# Set PATH (first time only)
export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"

# Run all tasks
cd src/HW1_Task1 && javac *.java && java Task1Test && \
cd ../HW1_Task2 && javac *.java && java Task2Test && \
cd ../HW1_Task3 && javac *.java && java Task3Test && \
cd ../HW1_Task4 && javac *.java && java Task4Test
```

---

## ✨ Features

### **Patient Management**
- ✅ Patient addition (ID, name, age, severity level)
- ✅ Patient deletion by ID
- ✅ Patient search by ID
- ✅ Patient list display
- ✅ Sorting by severity level (Bubble Sort)

### **Treatment Management**
- ✅ Priority treatment requests
- ✅ Normal treatment requests
- ✅ Priority requests processed first
- ✅ Queue status display
- ✅ FIFO (First In First Out) logic

### **Discharge Management**
- ✅ Discharge record creation
- ✅ Timestamp recording
- ✅ LIFO (Last In First Out) logic
- ✅ Discharge history display

---

## 🏗️ Data Structures

### **1. Linked List**
- **Usage:** Patient list management
- **Features:** 
  - Dynamic size
  - O(1) insertion (to head)
  - O(n) search/deletion
- **Implementation:** Inner class `Node` used in `PatientList.java`

### **2. Queue**
- **Usage:** Treatment request management
- **Features:** 
  - FIFO (First In First Out)
  - O(1) enqueue and dequeue
  - Priority support
- **Implementation:** Linked list-based in `TreatmentQueue.java` with front and rear pointers

### **3. Stack**
- **Usage:** Discharge records
- **Features:** 
  - LIFO (Last In First Out)
  - O(1) push, pop, peek
  - Timestamp
- **Implementation:** Linked list-based in `DischargeStack.java` with top pointer

### **4. HashMap**
- **Usage:** Fast patient lookup (Task 4)
- **Features:** 
  - O(1) average case lookup
  - Key-Value pairs
- **Implementation:** Java's built-in `HashMap` class

---

## ⏱️ Time Complexity Analysis

### **Task 1: PatientList**
| Operation | Time Complexity | Description |
|-----------|----------------|-------------|
| `addPatient()` | O(1) | Add to head, only head pointer update |
| `removePatientById()` | O(n) | Worst case: traverse entire list |
| `findPatientList()` | O(n) | Linear search |
| `toArray()` | O(n) | Traverse entire list |

### **Task 2: TreatmentQueue**
| Operation | Time Complexity | Description |
|-----------|----------------|-------------|
| `enqueue()` | O(1) | Direct access via rear pointer |
| `dequeue()` | O(1) | Direct access via front pointer |
| `isEmpty()` | O(1) | Pointer check |
| `size()` | O(1) | Return variable |

### **Task 3: DischargeStack**
| Operation | Time Complexity | Description |
|-----------|----------------|-------------|
| `push()` | O(1) | Top pointer update |
| `pop()` | O(1) | Top pointer update |
| `peek()` | O(1) | Top node access |

### **Task 4: HospitalSystem**
| Operation | Time Complexity | Description |
|-----------|----------------|-------------|
| `addPatient()` | O(1) | HashMap and list head insertion |
| `addTreatmentRequest()` | O(1) | Queue enqueue |
| `processTreatment()` | O(n) | removePatient is dominant |
| `sortPatientsBySeverity()` | O(n²) | Bubble Sort algorithm |

---

## 📊 Sample Outputs

### **Task 1 Output:**
```
Patient list after adding patients: 
Patient { id = 5 , name = Hakan Çavuş,severity = 9, age = 60}
Patient { id = 4 , name = Mehtap Ece Şafak,severity = 6, age = 45}
Patient { id = 3 , name = Tahir Aslan,severity = 3, age = 25}
Patient { id = 2 , name = Leyla Parlak,severity = 8, age = 18}
Patient { id = 1 , name = Ali Murat Budak,severity = 5, age = 30}

After removing patient using by ID 3 : 
Patient { id = 5 , name = Hakan Çavuş,severity = 9, age = 60}
Patient { id = 4 , name = Mehtap Ece Şafak,severity = 6, age = 45}
Patient { id = 2 , name = Leyla Parlak,severity = 8, age = 18}
Patient { id = 1 , name = Ali Murat Budak,severity = 5, age = 30}

Searching for patient with ID 4: 
Patient { id = 4 , name = Mehtap Ece Şafak,severity = 6, age = 45}
```

### **Task 2 Output:**
```
Initial queue: 
TreatmentRequest{patientId=1, Priority=false}
TreatmentRequest{patientId=2, Priority=false}
TreatmentRequest{patientId=3, Priority=true}
TreatmentRequest{patientId=4, Priority=false}
TreatmentRequest{patientId=5, Priority=false}
TreatmentRequest{patientId=6, Priority=true}
TreatmentRequest{patientId=7, Priority=false}
TreatmentRequest{patientId=8, Priority=false}

Queue after processing 3 requests: 
TreatmentRequest{patientId=4, Priority=false}
TreatmentRequest{patientId=5, Priority=false}
TreatmentRequest{patientId=6, Priority=true}
TreatmentRequest{patientId=7, Priority=false}
TreatmentRequest{patientId=8, Priority=false}
```

### **Task 3 Output:**
```
Patient Identifier: 3 ,Discharge Time : 1766387467919
Patient Identifier: 2 ,Discharge Time : 1766387467919
Patient Identifier: 1 ,Discharge Time : 1766387467919
```

### **Task 4 Output:**
For detailed output, see `docs/HW1_Task4/Task4output.txt` file.

---

## 📝 Notes

- All `.class` files are automatically created after compilation
- Each task can be run independently
- Task 4 is the integration of all previous tasks
- Detailed reports are available in PDF files in the `docs/` folder
- Corrected report texts are available in `*_Report_Corrected.txt` files

---

## 👤 Author

**Ayşegül Delialioğlu**  
Student ID: 230444057  
Course: CENG201 - Data Structures  
Date: December 27, 2025

---

## 📄 License

This project is for educational purposes and was prepared as part of the CENG201 course.

---

## 🔗 Related Files

- **Reports:** PDF reports for each task in the `docs/` folder
- **Corrected Reports:** `docs/HW1_TaskX/TaskX_Report_Corrected.txt` files
- **Expected Outputs:** `docs/HW1_TaskX/TaskXoutput.txt` files
- **Source Code:** In `src/HW1_TaskX/` folders

---

**Last Updated:** December 27, 2025
