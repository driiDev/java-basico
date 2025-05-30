package estoque.application;

import estoque.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = tc.nextLine();
        System.out.print("Price: ");
        product.price = tc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = tc.nextInt();

        System.out.println("Product data: " + product);
        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(tc.nextInt());
        System.out.println("Update data: " + product);
        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(tc.nextInt());
        System.out.println("Update data: " + product);


        tc.close();
    }
}
