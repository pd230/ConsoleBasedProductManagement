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

