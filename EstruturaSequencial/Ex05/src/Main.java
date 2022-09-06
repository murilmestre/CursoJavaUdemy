import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codPeca1 = sc.nextInt();
        int qtdePeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();
        int codPeca2 = sc.nextInt();
        int qtdePeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();
        double valorAPagar=((qtdePeca1*valorPeca1) +(qtdePeca2*valorPeca2));
        System.out.printf("VALOR A PAGAR: %.2f",valorAPagar);


    }
}