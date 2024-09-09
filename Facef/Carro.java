package Facef;
public class Carro {
    //variaveis
    public String marca, modelo, cor;
    public int ano;
    public boolean motor; //true or false
    public float velAtual;
    //construtor para instanciar objetos
    public Carro(String marca, String modelo, String cor, int ano, boolean motor, float velAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.motor = motor;
        this.velAtual = velAtual;
    }
    public void mostra(){
        String condicao = null;
        if (this.motor){
            condicao = " Motor ligado";
        } else {
            condicao = " Motor desligado";
        }
        System.out.println("\n Marca " + this.marca + " Modelo " + this.modelo + " Cor " + this.cor +
                condicao + " Velocidade " + this.velAtual);
    }
    public void ligar(){
        if (!this.motor) {
            this.motor = true;
        }
    }
    public void desligar(){
        if (this.motor){
            this.motor = false;
        }
    }
    public void acelerar(float x){
        if (this.motor){
            this.velAtual += x;
        }
    }
    public void frear(float x){
        if (this.motor){
            if (this.velAtual - x >= 0){
                this.velAtual -= x;
            }
        }
    }
}