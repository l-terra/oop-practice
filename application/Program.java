package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data");

        Product p;
        p = new Product();

        System.out.print("Name: ");
        p.name = sc.nextLine();

        System.out.print("Price: ");
        p.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        p.quantity = sc.nextInt();

        double total = p.totalValueInStock();

        System.out.println();
        System.out.printf("Product data: %s\n", p.toString());

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int numberToBeAdded = sc.nextInt();
        p.addProducts(numberToBeAdded);
        total = p.totalValueInStock();
        System.out.println();
        System.out.printf("Updated data: %s\n", p.toString());

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        int numberToBeRemoved = sc.nextInt();
        p.removeProducts(numberToBeRemoved);
        total = p.totalValueInStock();
        System.out.println();
        System.out.printf("Updated data: %s", p.toString());

        sc.close();
    }
}
