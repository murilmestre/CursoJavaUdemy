package aplicattion;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        Product product= new Product();
        System.out.println("Enter a product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price=sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity =sc.nextInt();
        System.out.println(product);












        sc.close();

    }
}
