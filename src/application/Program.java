package application;

import entities.Product;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product pc = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        pc.name = sc.nextLine();
        System.out.print("Price: ");
        pc.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        pc.quantity = sc.nextInt();
        System.out.println(pc.name + ", " + pc.price + ", " + pc.quantity);
    }
}
