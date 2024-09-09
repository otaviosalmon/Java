package introducao;

public class Casting {
    public static void main(String[]args){
        int x,c,d;
        double y, b, B, h, area,resultado;
        b= 6.0;
        B= 8.0;
        h= 5.0;
        area = (b+B) / 2.0*h;
        c = 5;
        d = 2;
        resultado = (double) c/d;
        //transformar o resultado nesse tipo de variavel (int) (float) (double)
        x = 5;
        y = 2*x;
        System.out.println(x);
        System.out.println(y);
        System.out.println("Area do trapezio = " + area);
        System.out.println("resultado é= "+resultado);
    }
}
