package Employees;

public class EmployeeHour extends  Employee{
    private double hourRate;

    public EmployeeHour(String firstName, String lastName, int age, double hourRate) {
        super(firstName, lastName, age);
        this.hourRate = hourRate;
    }
    public EmployeeHour(){}
    public double getHourRate() {
        return hourRate;
    }
    @Override
    public double getSalary() {
        return 20.8*8*hourRate;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return  super.toString() +  "Почасовая оплата, " +
                "почасовая ставка = " + hourRate +
                "средняя зп в месяц = " + getSalary();
    }
}
