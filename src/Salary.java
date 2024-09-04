/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCC-COLLEGE
 */
public class Salary {
      int id;
    String name;
    double rate;
    double hoursWorked;
    double grossPay;
    double deduction;
    double netPay;

    // Constructor
    public Salary(int id, String name, double rate, double hoursWorked, double deduction) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.hoursWorked = hoursWorked;
        this.grossPay = rate * hoursWorked;
        this.deduction = deduction;
        this.netPay = grossPay - deduction;
    }
}
    


