package orientacaoObjeto.comOrientacao;//package entities

public class Trinagulo {
    public double a;
    public double b;
    public double c;
    public double area(){
        double p = (a+b+c) / 2.0;
        double resultado = Math.sqrt(p * (p - a)*(p - b)* (p - c)); //poderia ser return no lugar de double assim ja retornaria o valor
        return resultado;
    }


}

