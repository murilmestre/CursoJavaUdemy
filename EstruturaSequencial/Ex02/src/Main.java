import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * (pow(raio, 2));
        System.out.printf("A=%.4f%n", area);
    }
}