package introducao;

import java.util.Locale;

public class SaidaDados {
    public static void main(String[]args){
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        int y = 32;
        double x = 10.357890;
        System.out.println(y);
        System.out.println(x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println("Primeiro numero: " + y +"Segundo Numero: "+ x);
        System.out.printf("RESULTADO = %.2f metros %n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome,idade,renda);
    }//"%s tem %d anos e ganha R$ %.2f%n"
}
