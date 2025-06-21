# Inventory Management System - Java Project

### Developed by: Harshitha Rajamuri

## Problem Statement:
You are developing an inventory management system for a warehouse where efficient data storage and retrieval are crucial. This system allows adding, updating, deleting, and viewing products using a simple menu-based console interface.

---

## ✅ Concepts Used:
- Object-Oriented Programming (OOP) in Java
- Java Collections Framework – HashMap
- Scanner class for user input
- Modular coding with multiple class files
- Menu-driven program design

---

## Project Structure:
- `Product.java`: A class representing the product with attributes: `productId`, `product_name`, `quantity`, and `price`.
- `InventoryManager.java`: Contains methods to `addProduct`, `updateProduct`, `deleteProduct`, and `viewAllProducts`.
- `Main.java`: Contains the menu and user interaction logic using `Scanner`.

---

## Data Structure Choice:
- **HashMap<String, Product> inventory**
  - Key: Product ID
  - Value: Product object
  - Reason: Enables fast access (O(1) average time) to add, update, or delete products based on `productId`.

---

## Time Complexity:
- `addProduct()` – O(1)
- `updateProduct()` – O(1)
- `deleteProduct()` – O(1)
- `viewAllProducts()` – O(n) (to loop through all products)

---

SELF-EVALUATION: Inventory Management System
1. Understanding the Problem Statement:
I clearly understood the requirements of the problem — to develop a simple yet efficient Inventory Management System using Java.

I identified the need for fast access operations and chose the right data structure (HashMap).

2. Code Implementation:
Developed 3 separate and well-structured Java classes:

Product: Defined attributes and getter/setter methods.

InventoryManager: Encapsulated all inventory-related operations.

Main: Handled menu-driven interaction.

Successfully implemented all CRUD operations: Add, Update, Delete, View.

3. Data Structure Justification:
I chose HashMap to store products using productId as the key.

HashMap allows constant time complexity (O(1)) for Add, Update, and Delete operations, which is optimal for inventory systems.
---

