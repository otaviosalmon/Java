package estruturaCondicional;

public class EscopoInicializacao {
    public static void main(String[] args) {
        double price = 400.00;
        double desconto ;
        if (price < 200){
            desconto = price *0.01;
        } else{
            desconto = 0;
        }
        System.out.println(desconto);

    }
    //é preciso declarar a variavel antes de ultiliza-la, e tambem declarar seu valor
}
