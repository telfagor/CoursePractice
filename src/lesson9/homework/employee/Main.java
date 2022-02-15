package lesson9.homework.employee;

public class Main {
    public static void main(String[] args) {
        Employee andrei = new Employee("Andrei", 2022, 0, "Chisinau");
        Employee maria = new Employee("Maria",  2004, 15000, "Moscow");
        Employee gheorghe = new Employee("Gheorghe", 2010, 13000, "Kiev");
        Employee[] employees = {andrei, maria, gheorghe};
        Employee.printInfoAboutEmployees(employees);
    }
}
