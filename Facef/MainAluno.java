package Facef;
public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno(1, "Junin", 14, 80.0f, 7.0f);
        System.out.print(obj1.dadosAluno());
        obj1.passou();
    }
}