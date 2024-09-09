package membrosEstaticos.exemploSem;


import java.util.Scanner;

public class Program {
    public static final double PI = 3.14159; //se atribuir a palavra final o valor nao podera mudar, nomes para constantes e maiusculo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o raio: ");
        double radius = sc.nextDouble();

        double c = circunference(radius);

        double v = volume(radius);
        System.out.printf("Circunference : %.2f%n" , c);
        System.out.printf("Volume : %.2f%n" , v);
        System.out.printf("Pi value : %.2f%n" , PI);

        sc.close();
    }
    public static double circunference(double radius){
        return 2 * PI * radius;
    }
    public static double volume(double radius){
        return 4 * PI * radius * radius * radius /3.0;
    }
}
