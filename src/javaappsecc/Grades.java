/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hazel Nogra
 */
package javaappsecc;

public class Grades {
 public   int id;
 public   String name;
 public   double p, m, pf, f;

    public void addGrades(int sid, String name, double prelim, double midterm, double prefinal, double finals) {
        this.id = sid;
        this.name = name;
        this.p = prelim;
        this.m = midterm;
        this.pf = prefinal;
        this.f = finals;
    }

    public void viewGrades() {
        double average = (this.p + this.m + this.pf + this.f) / 4;
        String remarks = (average > 3.0) ? "Failed" : "Passed";
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
                this.id, this.name, this.p, this.m, this.pf, this.f, average, remarks);
    }
}

