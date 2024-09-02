import java.text.NumberFormat;
import java.util.Scanner;

public class NetPay {
    public void getPay() {
        Scanner input = new Scanner(System.in);
        
        String name;
        double rate;
        int age;
        double worked;
        double deduction;
        
        System.out.print("Enter your name: ");
        name = input.nextLine();
        
        System.out.println("\nEnter age: ");
        age = input.nextInt();
        
        System.out.println("\nEnter rate per hour: ");
        rate = input.nextDouble();
        
        System.out.println("\nEnter total hours worked: ");
        worked = input.nextDouble();
        
        System.out.println("Enter total deduction: ");
        deduction = input.nextDouble();
        
        System.out.print("\n----------------------------");
        System.out.print("\nSLIP DETAILS");
        System.out.print("\n----------------------------");
        
        System.out.print("\nAugust 14, 2024");
        System.out.print("\n" + name);
        System.out.println("\nAge: " + age);
        
        System.out.println("Total Gross: " + (rate * worked));
        System.out.println("Total Deduction: " + deduction);
        
        System.out.print("\n----------------------------");
        System.out.print("\nNET PAY: " + (rate * worked - deduction));
        System.out.print("\n----------------------------");
        
        double money = 19500.00;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(money);
        System.out.println(moneyString);
    }
}
