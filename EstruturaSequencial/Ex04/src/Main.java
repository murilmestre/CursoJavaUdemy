import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        int hours = sc.nextInt();
        double valor = sc.nextDouble();
        double salary = hours*valor;
        System.out.println("NUMBER = "+number);
        System.out.printf("SALARY =%.2f ",salary);

    }
}