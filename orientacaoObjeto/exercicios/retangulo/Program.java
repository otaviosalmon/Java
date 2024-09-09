package orientacaoObjeto.exercicios.retangulo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Insira as medidas do retangulo");
        System.out.println("Altura: ");
        rectangle.altura = sc.nextDouble();
        System.out.println("Largura");
        rectangle.largura = sc.nextDouble();
        System.out.println();
        System.out.println("Área: "+ rectangle.area());
        System.out.println("Perimetro: " + rectangle.perimetro());
        System.out.println("Diagonal: "+ rectangle.diagonal());
        sc.close();
    }
}
