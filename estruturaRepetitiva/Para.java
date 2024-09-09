package estruturaRepetitiva;

import java.util.Scanner;

public class Para {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int soma = 0;
        for (int i=0;i<N;i+=1){                      // poderia ser tambem i++
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println(soma);
        for (int i=4;i>=0;i--){
            System.out.println("Valor de i = "+i);
        }
        System.out.println(soma);
        sc.close();
    }
}
