import Employees.*;

import java.util.ArrayList;
import java.util.Collections;

//1. Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой (один из потомков) и фиксированной оплатой (второй потомок).
//а) Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
//Для «повременщиков» формула для расчета такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»,
// для работников с фиксированной оплатой «среднемесячная заработная плата = фиксированная месячная оплата».
//б) Создать на базе абстрактного класса массив сотрудников и заполнить его.
//в) ** Реализовать интерфейсы для возможности сортировки массива (обратите ваше внимание на интерфейсы Comparator, Comparable)
//г) ** Создать класс, содержащий массив сотрудников, и реализовать возможность вывода данных с использованием foreach.
public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new EmployeeFix("Иван", "Иванов", 37, 20_000));
        employees.add(new EmployeeFix("Петр", "Петров", 24, 40_000));
        employees.add(new EmployeeHour("Сергей", "Сергеев", 54, 2500));
        employees.add(new EmployeeHour("Алексей", "Алексеев", 21, 150));

        for (Employee x: employees) {
            System.out.println(x);
        }

        System.out.println("\n Сортировка по возрасту \n");

        Collections.sort(employees);
        for (Employee x: employees) {
            System.out.println(x);
        }


        System.out.println("\n Сортировка по зароботной плате \n");

        SalaryComparator salaryComparator = new SalaryComparator();
        Collections.sort(employees, salaryComparator);

        for (Employee x: employees) {
            System.out.println(x);
        }

        System.out.println("\n Вывод сотрудников департамента при помощи внутреннего метода \n");

        Department department = new Department();
        department.setEmployees(employees);
        department.printEmployees();

        System.out.println("\n Вывод сотрудников департамента внешним перебором \n");

        for (Employee x: department) {
            System.out.println(x);
        }

        }
    }
