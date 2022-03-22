package lesson18.homework;

import java.util.ArrayList;

public class Employee {

    private String name;
    private int yearsOfActivity;

    public Employee(String name, int yearsOfActivity) {
        this.name = name;
        this.yearsOfActivity = validateYearsOfActivity(yearsOfActivity) ? yearsOfActivity : 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYearsOfActivity(int yearsOfActivity) {
        this.yearsOfActivity = validateYearsOfActivity(yearsOfActivity) ? yearsOfActivity : 0;
    }

    public int getYearsOfActivity() {
        return yearsOfActivity;
    }

    private boolean validateYearsOfActivity(int yearsOfActivity) {
        return yearsOfActivity > 0 && yearsOfActivity < 50;
    }

    public static ArrayList<Employee> filterEmployees(Employee[] employees) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getYearsOfActivity() >= 5) {
                list.add(employee);
            }
        }
        return list;
    }

    public static void printEmployees(ArrayList<Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    @Override
    public String toString() {
        return "Employee name: " + name + ","
                + " years of activity: " + yearsOfActivity;
    }
}
