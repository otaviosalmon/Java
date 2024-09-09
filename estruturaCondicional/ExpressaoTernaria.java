package estruturaCondicional;

import java.util.Scanner;

public class ExpressaoTernaria {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("insira o preco");
        double preco = sc.nextDouble();
        double desconto = (preco <20) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
        sc.close();
    }
}
//codigo sem expressao ternaria
//double preco = 34.5;
//double desconto;
//if (preco < 20.0) {
//desconto = preco * 0.1;
//}
//else {
//desconto = preco * 0.05;
//}