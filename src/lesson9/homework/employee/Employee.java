package lesson9.homework.employee;

public class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void printInfoAboutEmployees(Employee[] employees) {
        System.out.println("Name \t Year of joining \t Salary \t Address");
        for (Employee employee : employees) {
            System.out.printf("%-10s \t %4d \t %14.2f \t %-15s\n", employee.name,
                    employee.yearOfJoining, employee.salary, employee.address);
        }
    }

    @Override
    public String toString() {
        return "Employee{"
                + "name='" + name + '\''
                + ", yearOfJoining=" + yearOfJoining
                + ", salary=" + salary
                + ", address='" + address + '\''
                + '}';
    }
}
