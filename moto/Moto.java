package moto;

public class Moto {
    String id;
    String marca;

    public Moto( String id, String marca){

    }
    public Moto(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "id='" + id + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
