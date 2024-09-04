
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCC-COLLEGE
 */
public class Products {
    public Product inputProductDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Product Name: ");
        scanner.nextLine();  
        String name = scanner.nextLine();

        System.out.print("Enter Number Sold: ");
        int sold = scanner.nextInt();

        System.out.print("Enter Stock: ");
        int stock = scanner.nextInt();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        
        Product product = new Product();
        product.addProduct(id, name, sold, stock, price);

        return product;
    }
}

