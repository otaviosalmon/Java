package Facef;
public class MainProduto {
    public static void main(String[] args){
        Produto p0 = new Produto();
        Produto p1 = new Produto(11,100,"Sabonete Dove", 10f);
        p1.comprar(10);
        p1.vender(9);
        p1.subir(2);
        p1.descer(3);
        System.out.println(p1.toString());

        Produto p2 = new Produto(19,124,"Sabonete Protect", 9.5f);
        p2.comprar(10);
        p2.vender(9);
        p2.subir(2);
        p2.descer(3);
        System.out.println(p2.toString());
    }
}




