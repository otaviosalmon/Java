package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class SintaxeOpcional {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("digite os minutos");
        Scanner sc= new Scanner(System.in);
        int minutos = sc.nextInt();
        double conta = 50.0;
        if (minutos > 100){
            conta +=  (minutos-100) *2.0;// variaveis dessa sintaxe seriao: conta -=  conta*=  conta/=  conta%=
        }
        System.out.printf("Valor da conta R$ %.2f%n", conta);

        sc.close();
    }
}
