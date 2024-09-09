package outros;

import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {
        double x= Math.sqrt(25.0);//poderia ser passada uma variavel como parametro tambem
        System.out.println(x);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 3 numeros");//programa para verificar qual numero e maior
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int higher= max(a,b,c);
        showResult(higher);
        sc.close();
    }
    public static int max(int x,int z,int y){
        int aux;
        if (x > y && x > z){
            aux = x;
        } else if (z>y) {
            aux = z;
        }else {
            aux = y;
        }
        return aux;
    }
    public static void showResult(int value){
        System.out.println("Higher = "+value);
    }
}
