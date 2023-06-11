package Employees;

import java.util.ArrayList;
import java.util.Iterator;

public class Department implements Iterable<Employee> {
    private ArrayList<Employee> employees = new ArrayList<>();
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void printEmployees(){
        for (Employee x: this.employees) {
            System.out.println(x);
        }
    }


    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }
}
