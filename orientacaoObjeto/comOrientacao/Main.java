package orientacaoObjeto.comOrientacao;

import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trinagulo x,y;
        x = new Trinagulo();
        y = new Trinagulo();
        System.out.println("insira as medidas do trinagulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Insira as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double areax = x.area();
        double areay = y.area();
        System.out.printf("Area do triangulo X = %.4f%n", areax);
        System.out.printf("Area do triangulo Y = %.4f%n", areay);
        if (areax > areay){
            System.out.println("Mario area e do triangulo X!");
        }else {
            System.out.println("Maior area e do triangulo Y");
        }

        sc.close();
    }
}

