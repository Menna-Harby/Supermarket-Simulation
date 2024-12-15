package myPackage;
import java.util.Scanner;



public class supermarket_simulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial setup
        double money = 1000; // Starting money
        double rent = 30; // Monthly rent cost
        double electricity = 15; // Monthly electricity cost
        double restockingCapacity = 1000; // Maximum allowable restocking cost
        Employee hiredEmployee = null; // Currently hired employee (initially none)

        // Employee options
        Employee emp1 = new Employee("Employee A", 0.90, 50);
        Employee emp2 = new Employee("Employee B", 0.85, 40);
        Employee emp3 = new Employee("Employee C", 0.95, 60);

        // Product options
        Product dairy = new Product("Dairy", 70);
        Product snacks = new Product("Snacks", 50);
        Product frozenMeat = new Product("Frozen Meat", 150);
        Product soda = new Product("Soda", 40);
        Product[] products = {dairy, snacks, frozenMeat, soda};

        // Welcome message
        System.out.println("Welcome to The Supermarket Simulator!");
        System.out.println("You have started your business with $1000. Manage it wisely!");
        System.out.println("Initial costs before expansion: Rent = $30, Electricity = $15, Restocking Capacity = $1000.");

        while (true) {
            // Display current status
            System.out.println("\nYour current balance: $" + money);
            System.out.println("Choose an action:");
            System.out.println("1. Expand Supermarket");
            System.out.println("2. Hire Employee");
            System.out.println("3. Restock and Calculate Profit");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Expand Supermarket
                    double expansionCost = 100; // Cost to expand the supermarket
                    if (money >= expansionCost) {
                        rent += 30; // Increase rent cost
                        electricity += 15; // Increase electricity cost
                        restockingCapacity += 1000; // Increase restocking capacity
                        money -= expansionCost; // Deduct expansion cost
                        System.out.println("Supermarket expanded! Rent = $" + rent + ", Electricity = $" + electricity +
                                ", Restocking Capacity = $" + restockingCapacity);
                    } else {
                        System.out.println("Not enough money to expand. You need $100.");
                    }
                    break;

                case 2: // Hire Employee
                    if (hiredEmployee != null) {
                        System.out.println("You already hired: " + hiredEmployee.name);
                    } else {
                        System.out.println("Choose an employee to hire:");
                        System.out.println("1. " + emp1.name + " (Efficiency: " + emp1.efficiency + ", Salary: $" + emp1.salary + ")");
                        System.out.println("2. " + emp2.name + " (Efficiency: " + emp2.efficiency + ", Salary: $" + emp2.salary + ")");
                        System.out.println("3. " + emp3.name + " (Efficiency: " + emp3.efficiency + ", Salary: $" + emp3.salary + ")");
                        int empChoice = sc.nextInt();

                        switch (empChoice) {
                            case 1:
                                hiredEmployee = emp1;
                                break;
                            case 2:
                                hiredEmployee = emp2;
                                break;
                            case 3:
                                hiredEmployee = emp3;
                                break;
                            default:
                                System.out.println("Invalid choice. Try again.");
                                continue;
                        }
                        System.out.println(hiredEmployee.name + " hired.");
                    }
                    break;

                case 3: // Restock and Calculate Profit
                    if (hiredEmployee == null) {
                        System.out.println("No employee hired. Hire an employee first.");
                    } else {
                        double totalGoodsCost = 0;

                        for (Product product : products) {
                            System.out.print("Enter the number of boxes for " + product.name + " (Cost per box: $" + product.cost + "): ");
                            int boxes = sc.nextInt();
                            totalGoodsCost += product.cost * boxes;
                        }
                       

                        if (totalGoodsCost > restockingCapacity) {
                            System.out.println("Restocking cost exceeds capacity of $" + restockingCapacity);
                        } else if (totalGoodsCost > money) {
                            System.out.println("Not enough money to restock. Current balance: $" + money);
                        } else {
                            // Calculate income, expenses, and profit
                            double income = totalGoodsCost * hiredEmployee.efficiency * 1.3; // 30% profit margin
                            double expenses = rent + electricity + totalGoodsCost + hiredEmployee.salary;
                            double profit = income - expenses;
                             
                            money =money-totalGoodsCost+(totalGoodsCost * hiredEmployee.efficiency * 1.3)-(rent + electricity + hiredEmployee.salary);
                            // Update balance with profit
                            System.out.println("The total cost of the products restocking is"+totalGoodsCost);
                            System.out.printf("Income: $%.2f, Expenses: $%.2f, Profit: $%.2f\n", income, expenses, profit);
                            System.out.println("Your new balance: $" + money);
                        }
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting the simulator. Goodbye!");
                    sc.close();
                    return;

                default: // Invalid choice
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}