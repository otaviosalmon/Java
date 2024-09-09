package membrosEstaticos.exemplosCom;

public class Calculator {
    public static final double PI = 3.14159; //se atribuir a palavra final o valor nao podera mudar, nomes para constantes e maiusculo
    public static double circunference(double radius){
        return 2 * PI * radius;
    }
    public static double volume(double radius){
        return 4 * PI * radius * radius * radius /3.0;
    }
}
