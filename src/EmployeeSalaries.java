/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hazel Nogra
 */
import java.util.Scanner;
public class EmployeeSalaries {
    class Employee {
        int id;
        String name;
        double rate;
        double hoursWorked;
        double grossPay;
        double deduction;
        double netPay;

        Employee(int id, String name, double rate, double hoursWorked, double deduction) {
            this.id = id;
            this.name = name;
            this.rate = rate;
            this.hoursWorked = hoursWorked;
            this.grossPay = rate * hoursWorked;
            this.deduction = deduction;
            this.netPay = grossPay - deduction;
        }
    }

    public void Salaries() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Employees: ");
        int emp = input.nextInt();
        input.nextLine(); 

        Employee[] employees = new Employee[emp];
        double totalGross = 0.0;
        double totalDeductions = 0.0;
        double totalNetPay = 0.0;

        for (int i = 0; i < emp; i++) {
            System.out.println("Details of Employee " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = input.nextInt();
            input.nextLine(); 

            System.out.print("Name: ");
            String name = input.nextLine();  

            System.out.print("Rate: ");
            double rate = input.nextDouble();

            System.out.print("Hours Worked: ");
            double hrs = input.nextDouble();

            System.out.print("Total Deduction: ");
            double deduc = input.nextDouble();

            employees[i] = new Employee(id, name, rate, hrs, deduc);

            totalGross += employees[i].grossPay;
            totalDeductions += employees[i].deduction;
            totalNetPay += employees[i].netPay;
        }

        
        System.out.printf("\n%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "ID", "Name", "Rate", "Hours", "Gross", "Deduction", "Net Pay");

        
        for (Employee e : employees) {
            System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f\n",
                    e.id, e.name, e.rate, e.hoursWorked, e.grossPay, e.deduction, e.netPay);
        }

        
        System.out.printf("\n%-10s %-10s %-10s %-10s %-10.2f %-10.2f %-10.2f\n",
                " ", "Total", " ", " ", totalGross, totalDeductions, totalNetPay);

        System.out.println("\nTotal Gross Pay: " + totalGross);
        System.out.println("Total Deductions: " + totalDeductions);
        System.out.println("Total Net Pay to Release: " + totalNetPay);
    }

   
}
    
    

