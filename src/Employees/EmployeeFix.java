package Employees;

public class EmployeeFix extends Employee{

    private int salaryMonth;
    public EmployeeFix(String firstName, String lastName, int age, int salaryMonth) {
        super(firstName, lastName, age);
        this.salaryMonth = salaryMonth;

    }
    public EmployeeFix(){}
    public int getSalaryMonth() {
        return salaryMonth;
    }
    @Override
    public double getSalary() {
        return salaryMonth;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return super.toString() +  "Фиксированная ставка, " +
                "Среднемесячная заработная плата = " + salaryMonth;
    }
}
