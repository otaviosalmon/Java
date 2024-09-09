package introducao;

import java.util.Scanner;

public class EntradaDados2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String s1,s2,s3;
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        //next line serve para ler ate digitar enter, Enquanto apenas o next ira ler apenas a primeira palavra
        System.out.println("Dados digitado:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
    }
    //quando usado um comando de leitura diferente de nextLine e da alguma quebra de linha a quebra fica pendente
    //na entrada padrão, se usar um nextLine em seguida a quebra de linha pendente sera absorvida pelo
    //nextLine e entao ele retornara uma linha vazia, para resolver isso deve se colocar um nextLine depois do comando
    //pra consumir a quebra de linha pendente
}
