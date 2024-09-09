package membrosEstaticos.exemplosCom;


import java.util.Scanner;

public class Program {
    public static final double PI = 3.14159; //se atribuir a palavra final o valor nao podera mudar, nomes para constantes e maiusculo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o raio: ");
        double radius = sc.nextDouble();

        double c = Calculator.circunference(radius);

        double v = Calculator.volume(radius);
        System.out.printf("Circunference : %.2f%n" , c);
        System.out.printf("Volume : %.2f%n" , v);
        System.out.printf("Pi value : %.2f%n" , Calculator.PI);

        sc.close();
    }

}
