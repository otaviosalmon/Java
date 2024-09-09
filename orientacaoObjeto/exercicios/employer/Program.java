package orientacaoObjeto.exercicios.employer;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Inser employee name :");
        employee.name = sc.nextLine();
        System.out.println("Insert employee salary: ");
        employee.salary = sc.nextDouble();
        System.out.println("Insert tax value: ");
        employee.tax = sc.nextDouble();
        System.out.println(employee);
        System.out.println("Wich percentage should be increased from the salary? ");
        double percentage = sc.nextDouble();
        employee.porcentagem(percentage);
        System.out.println(employee);

        sc.close();

    }
}
