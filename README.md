# **Supermarket-Simulation**
A Java-based simulation project for managing a supermarket, created for the CSE141 course. This project applies Object-Oriented Programming (OOP) principles to model and simulate supermarket operations.

---

## **Team Information**

**Member1**:  
- **Name**: شهد محمد محمد حسن  
- **Section**: 2  

**Member2**:  
- **Name**: منةالله حربي الشربيني رمضان  
- **Section**: 5  

---

## **What is the Supermarket Management Simulator?**

The Supermarket Management Simulator is a Java-based interactive game where players manage a virtual supermarket. The goal is to make strategic decisions to grow the business by:  
- Expanding the supermarket.  
- Hiring employees.  
- Restocking products.  

---

## **Features of the Simulator**

1. **Starting Resources**:  
   Players begin with a balance of **$1000**.

2. **Key Actions**:  
   - **Expand Supermarket**: Increase capacity for growth at a cost.  
   - **Hire Employees**: Choose employees based on efficiency and salary.  
   - **Restock and Sell Products**: Manage inventory and calculate profits strategically.  

3. **Realistic Constraints**:  
   - Expenses include rent, electricity, salaries, and restocking costs.  
   - Players must stay within budget to avoid bankruptcy.  

4. **Product Options**:  
   - Categories include Dairy, Snacks, Frozen Meat, and Soda, each with a fixed per-box cost.  

---

## **Gameplay Mechanics**

### **Main Menu Options**  
1. **Expand Supermarket**: Costs $100 but increases capacity.  
2. **Hire Employees**: Improves efficiency based on the selected employee.  
3. **Restock Goods**: Input quantities for each product category and calculate profits.  
4. **Exit the Simulator**: Ends the game.  

### **Profit Calculation Formula**  
\[
\text{Profit} = (\text{Restocking Cost} \times \text{Efficiency} \times 1.3) - (\text{Expenses})
\]

### **Game End**  
- Players can exit anytime or continue indefinitely to grow their business.

---

## **Employees**

| **Employee** | **Efficiency** | **Salary ($)** |  
|--------------|----------------|----------------|  
| Employee A   | 90%            | 50             |  
| Employee B   | 85%            | 40             |  
| Employee C   | 95%            | 60             |  

**Decision Factor**:  
- Higher efficiency yields better profits but incurs higher salaries.  

---

## **Product Options**

| **Product**      | **Cost Per Box ($)** |  
|-------------------|----------------------|  
| Dairy            | 70                   |  
| Snacks           | 50                   |  
| Frozen Meat      | 150                  |  
| Soda             | 40                   |  

---

## **Code Design**

### **Programming Language**  
- Java  

### **Structure Overview**  
1. **Initialization Block**:  
   - Sets up starting balance, expenses, and product/employee objects.  

2. **Main Menu**:  
   - Displays available actions and processes user inputs in a loop.  

3. **Action Blocks**:  
   - Each menu option corresponds to a logical block for expanding, hiring, restocking, and exiting.  

4. **Employee and Product Classes**:  
   - Encapsulate attributes like efficiency, salary, and product cost.  

---

## **Code Highlights**

### **Initialization Block**
```java
double money = 1000;  
double rent = 30;  
double electricity = 15;  
Employee emp1 = new Employee("Employee A", 0.90, 50);  
Employee emp2 = new Employee("Employee B", 0.85, 40);  
Employee emp3 = new Employee("Employee C", 0.95, 60);  
Product dairy = new Product("Dairy", 70);  
Product snacks = new Product("Snacks", 50);  
Product frozenMeat = new Product("Frozen Meat", 150);  
Product soda = new Product("Soda", 40);

