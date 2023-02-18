package application;

import entities.Retangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Retangle retangle = new Retangle();

        System.out.println("Enter retangle width and height:");
        retangle.width = sc.nextDouble();
        retangle.height= sc.nextDouble();

        retangle.area();
        retangle.perimeter();
        retangle.diagonal();

        System.out.printf("Area = %.2f%n",retangle.area());
        System.out.printf("Perimeter = %.2f %n",retangle.perimeter());
        System.out.printf("Diagonal = %.2f",retangle.diagonal());













        sc.close();

    }
}
