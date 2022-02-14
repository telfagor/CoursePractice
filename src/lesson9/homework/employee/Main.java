package lesson9.homework.employee;

public class Main {
    public static void main(String[] args) {
        Employee andrei = new Employee("Andrei", 2022, 0, "Chisinau");
        Employee maria = new Employee("Maria",  2004, 15000, "Moscow");
        Employee gheorghe = new Employee("Gheorghe", 2010, 13000, "Kiev");
        Employee[] employees = {andrei, maria, gheorghe};
        printInfoAboutEmployees(employees);
    }

    public static void printInfoAboutEmployees(Employee[] employees) {
        System.out.println("Name \t Year of joining \t Salary \t Address");
        for (Employee employee : employees) {
            System.out.printf("%-10s \t %4d \t %14.2f \t %-15s\n", employee.getName(),
                    employee.getYearOfJoining(), employee.getSalary(), employee.getAddress());
        }
    }
}
