package estruturaCondicional;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas horas?");
        int hora = sc.nextInt();
        if (hora<12) {
            System.out.println("Bom dia");
        }
        else if (hora>12 && hora<18) {
            System.out.println("Boa tarde");
        }
        else  {
            System.out.println("Boa noite");
        }
        //estrutura tambem poderia conter um if e um else dentro do primeiro else, ao inves de else if
        //se o if ou o else possuirem apenas uma linha de comando não e necessario a chave {}
        sc.close();
    }
}
