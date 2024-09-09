package membrosEstaticos.exemploSem2;


import java.util.Scanner;

public class Program {
    public static final double PI = 3.14159; //se atribuir a palavra final o valor nao podera mudar, nomes para constantes e maiusculo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Insira o raio: ");
        double radius = sc.nextDouble();

        double c = calc.circunference(radius);

        double v = calc.volume(radius);
        System.out.printf("Circunference : %.2f%n" , c);
        System.out.printf("Volume : %.2f%n" , v);
        System.out.printf("Pi value : %.2f%n" , calc.PI);

        sc.close();
    }

}
