package orientacaoObjeto.exercicios.employer;

public class Employee {
    public String name;
    public double salary;
    public double tax;
    public double netSalary(){
        return salary - tax;
    }
    public double porcentagem(double percentage){
        return salary += salary * percentage / 100;
    }

    @Override
    public String toString() {
        return "Employee: " +
                  name +
                "  Salary: " + String.format("%.2f", netSalary());
    }
}

