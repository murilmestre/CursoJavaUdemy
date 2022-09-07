import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        int codigo = sc.nextInt();
        double qtde = sc.nextDouble();
        double total;

        if(codigo==1){
            total = qtde*4;

        } else if (codigo==2) {
            total =qtde*4.50;

        }
        else if (codigo==3) {
            total = qtde*5;


        }
        else if (codigo==4) {
            total=qtde*2;

        }
        else{
            total =qtde*1.5;
        }
        System.out.printf("Total: R$%.2f%n",total);

    }
}