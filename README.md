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

### **Notion Link**  

For more details, visit our Notion page:  
[Supermarket Management Simulator - Notion Page](https://overjoyed-gallon-36f.notion.site/Supermarket-Management-Simulator-157a5187b326800f80bbf54a4600a7e3?pvs=4)

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
Profit = Restocking Cost * Efficiency} * 1.3 - Expenses

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
## **Example Gameplay**

### **Scenario**  
- **Starting Balance**: $1000  

1. **Action 1: Hire Employee A**  
   - **Details**: Employee A has 90% efficiency with a $50 salary.  
   - **Updated Status**: Employee A is hired, and their efficiency will be applied to profit calculations.

2. **Action 2: Restock 10 Boxes of Dairy**  
   - **Cost Calculation**:  
     - Dairy costs $70 per box.  
     - Total cost = $70 × 10 = $700.  
   - **Updated Balance**: $1000 - $700 = $300 (remaining after restocking).

3. **Profit Calculation**:  
   - **Restocking Cost**: $700.  
   - **Efficiency Modifier**: 90% efficiency from Employee A.  
   - **Income Formula**:  
     \[
     \text{Income} = \text{Restocking Cost} \times \text{Efficiency} \times 1.3  
     = 700 \times 0.9 \times 1.3 = 819
     \]  
   - **Expenses**:  
     - Rent: $30  
     - Electricity: $15  
     - Restocking Cost: $700  
     - Employee Salary: $50  
     - Total Expenses = $30 + $15 + $700 + $50 = $795.  
   - **Profit Formula**:  
     \[
     \text{Profit} = \text{Income} - \text{Expenses}  
     = 819 - 795 = 104
     \]  

4. **Updated Balance**:  
   - Starting balance after restocking: $300.  
   - Add profit: $300 + $104 = **$1104**.

---

### **Extended Scenario**  

- After successfully restocking Dairy, the player decides to:  
   1. Expand the supermarket for $100.  
   2. Restock 5 boxes of Snacks ($50 each) and 3 boxes of Soda ($40 each).  

#### **Step 1: Expand Supermarket**  
   - Cost = $100.  
   - Updated balance: $1104 - $100 = **$1004**.  

#### **Step 2: Restock Snacks and Soda**  
   - **Snacks**: 5 boxes × $50 = $250.  
   - **Soda**: 3 boxes × $40 = $120.  
   - Total restocking cost = $250 + $120 = **$370**.  
   - Updated balance: $1004 - $370 = **$634**.

#### **Profit Calculation for Extended Restocking**  
   - **Restocking Cost**: $370.  
   - **Efficiency Modifier**: 90% efficiency from Employee A.  
   - **Income**:  
     \[
     \text{Income} = 370 \times 0.9 \times 1.3 = 433.5
     \]  
   - **Expenses**:  
     - Rent: $30  
     - Electricity: $15  
     - Employee Salary: $50  
     - Total Expenses = $30 + $15 + $50 = $95.  
   - **Profit Formula**:  
```plaintext
Income = Restocking Cost × Efficiency × 1.3
Income = 700 × 0.9 × 1.3 = 819

#### **Final Balance**  
   - Starting balance after restocking: $634.  
   - Add profit: $634 + $338.5 = **$972.5**.

---
Enjoy managing your supermarket and growing your business!
