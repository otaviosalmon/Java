package Facef;
public class Aluno {
    int numeroAluno, idade;
    String nome;
    float p1, p2;

    public Aluno(){}

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.numeroAluno = numeroAluno; this.nome = nome;
        this.idade = idade; this.p1 = p1; this.p2 = p2;
    }

    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }

    public String dadosAluno(){
        return("Número aluno: " + numeroAluno + "\n nome:" + nome + "\n idade: " + idade);
    }

    public void passou(){
        if (this.notaFinal() >= 6){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}