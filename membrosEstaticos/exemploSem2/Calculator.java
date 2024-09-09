package membrosEstaticos.exemploSem2;

public class Calculator {
    public final double PI = 3.14159; //se atribuir a palavra final o valor nao podera mudar, nomes para constantes e maiusculo
    public  double circunference(double radius){
        return 2 * PI * radius;
    }
    public  double volume(double radius){
        return 4 * PI * radius * radius * radius /3.0;
    }
}
