package Facef;
public class Produto {
    private int id, qnt;
    private String descricao;
    private float preco;
    public Produto() {
    }
    public Produto(int id, int qnt, String descricao, float preco) {
        this.id = id;
        this.qnt = qnt;
        this.descricao = descricao;
        this.preco = preco;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQnt() {
        return qnt;
    }
    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void comprar(int x){
        this.setQnt(this.getQnt() + x);
    }
    public void vender(int x){
        this.setQnt(this.getQnt() - x);
    }
    public void subir(float x){
        this.setPreco(this.getPreco() + x);
    }
    public void descer(float x){
        this.setPreco(getPreco() - x);
    }
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", qnt=" + qnt +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}