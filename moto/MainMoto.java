package moto;

public class MainMoto {
    public static void main(String[] args) {
        Moto moto = new Moto();
        moto.setId("F4Z-809");
        moto.setMarca("TOYOTA");
        System.out.println(moto.getId()+moto.getMarca());
        System.out.println(moto.toString());
    }
}
