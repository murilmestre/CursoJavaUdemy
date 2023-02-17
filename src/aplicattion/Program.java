package aplicattion;


import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        Triangle x,y;
        x=new Triangle();
        y=new Triangle();
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double areaX= x.area();
        double areaY=y.area();
        System.out.printf("Triangle X area: %.4f%n",areaX);
        System.out.printf("Triangle Y area: %.4f%n",areaY);
        if (areaX> areaY){
            System.out.println("Larger area: X ");
        }
        else {
            System.out.println("Larger area: Y ");
        }
    }
}

/* Na primeira parte dessa aula aprendemos a criação de classes, fazendo na pratica a criação da classe
* Triangle e utilizando ela para fazer uma melhoria no codigo, eliminando o uso das variaveis locais, passando
* a usar variavel  do tipo Triangle*/

/* Na segunda parte dessa aula aprendemos a criação de metodos criando o metodo area na classe Triangle, passando
* a responsabilidade de fazer os cauculos para a classe Triangle, deixando assim o codigo mais limpo*/

