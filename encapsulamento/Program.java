package encapsulamento;

import encapsulamento.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price:  ");
        double price = sc.nextDouble();
        Product product = new Product(name,price);

        product.setName("Computador");

        System.out.println();
        System.out.println("Product data: "+ product);

        System.out.println();

        System.out.println("Enter the number of products to be added in stock:");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Product updated data: "+ product);
        System.out.println();

        System.out.println("Enter the number of products to be removed from stock:");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();

        System.out.println("Product updated data: "+ product);
        sc.close();
    }
}
