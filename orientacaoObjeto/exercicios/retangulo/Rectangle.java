package orientacaoObjeto.exercicios.retangulo;

public class Rectangle {
    public double altura;
    public double largura;
    public double area(){
            return largura * altura;
    }
    public double perimetro(){
        return 2 * (altura +largura);
    }
    public double diagonal (){
        return Math.sqrt(largura * largura + altura * altura );
    }


}
