package orientacaoObjeto.semOrientacao;

import java.util.Scanner;

public class SemOrientacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xa,xb,xc,ya,yb,yc;
        System.out.println("insira as medidas do trinagulo X: ");
        xa = sc.nextDouble();
        xb = sc.nextDouble();
        xc = sc.nextDouble();
        System.out.println("Insira as medidas do triangulo Y: ");
        ya = sc.nextDouble();
        yb = sc.nextDouble();
        yc = sc.nextDouble();
        double p = (xa + xb + xc)/2;
        double areax = Math.sqrt(p *(p-xa) * (p-xb) * (p-xc));
        p = (ya + yb + yc)/2;
        double areay = Math.sqrt(p *(p-ya) * (p-yb) * (p-yc));
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
