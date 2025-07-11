# 📦 Product Management System (Console-Based)
[![Java](https://img.shields.io/badge/Language-Java-blue.svg)](https://www.java.com)
[![Platform](https://img.shields.io/badge/Platform-Console-lightgrey)]()
[![Status](https://img.shields.io/badge/Status-Development-orange)]()
[![License](https://img.shields.io/badge/License-MIT-green.svg)]()

A simple **Java console-based Product Management System** that helps manage a collection of products. The system demonstrates Java collections, date handling, stream filtering, and console I/O operations using `Scanner`.

---

## 🛠 Features

- ✅ Add new products
- 📋 View all products
- 🔍 Search products by ID or location
- ⚠️ Identify products with **expired warranty**
- 🛠️ Update product warranty
- ❌ Remove product by name
- 📦 Initialize demo product list

---

## 🧾 Product Data Structure

Each product consists of the following fields:

| Field         | Type        | Description                     |
|---------------|-------------|---------------------------------|
| `pid`         | `int`       | Product ID                      |
| `pname`       | `String`    | Product name                    |
| `version`     | `String`    | Product version code            |
| `type`        | `String`    | Product category or type        |
| `purchaseDate`| `LocalDate` | Date of purchase                |
| `warranty`    | `LocalDate` | Expiry date of warranty         |
| `location`    | `String`    | Physical storage location       |

---

## 📂 Project Structure

src/
├── com/example/model/
│ └── Product.java # Product class (POJO)
└── com/example/service/
└── ServiceRepo.java # Service class with all logic


---

## 💻 How to Use

```java
ServiceRepo service = new ServiceRepo();
service.DemoProducts();              // Load demo products
service.AddProducts();               // Add user-defined products
service.getAllProducts();            // Display all products
service.getProductById(101);         // Search product by ID
service.getProductByLocation();      // Search by location
service.getExpWarruntyPro();         // Get expired warranty products
service.UpdateProductWarrunty("GoPro"); // Extend warranty
service.removeProduct("Iphone 15");  // Remove product
---
Sample Input (Add Product)

Enter How many Products do you want to add : 1
id : 108
name : Logitech Keyboard
version : k123
type : Keyboard
Location : black table
Enter Warrunty(dd/MM/yyyy) : 15/07/2027

---

🛠 Technologies Used
Java 17+
Java Collections API
Java Stream API
LocalDate & DateTimeFormatter
Scanner for input

---

📈 Future Enhancements
Menu-driven interface
Validation for duplicate IDs or date formats
File/database persistence
GUI or RESTful API version using Spring Boot

---

📄 License
This project is open-source under the MIT License. You are free to use, modify, and distribute it.

---

🙋‍♀️ Author
Pratiksha Dixit
Java & Tech Enthusiast | MCA Student
🚀 Passionate about building real-world applications
