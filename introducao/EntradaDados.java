package introducao;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //se quiser mudar regiao da saida de dados colocar antes da variavel
        int y = sc.nextInt();//cada variavel usa uma variação do comando sc.next
        String x = sc.next();
        double w = sc.nextDouble();
        float z = sc.nextFloat();
        char c = sc.next().charAt(0); //0 = primeiro caracter, 1= segundo caracter, etc
        System.out.println("voce digitou: "+ x);
        System.out.println("voce digitou :"+y);
        System.out.println("voce digitou: "+ w);
        System.out.println("voce digitou: "+ z);
        System.out.println("voce digitou: "+ c);
        sc.close();//use quando não for usar mais o scanner
        //para ler variaveis de outra forma seria declarando as antes e depois as escaneando exmplo
        //int x;
        //x = sc.nexInt()
        //String y;
        //y = sc.next(); ficaria desse modo:
        // 31 Maria (soutln(x + y))
    }
}
