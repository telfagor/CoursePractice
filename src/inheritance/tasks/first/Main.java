package inheritance.tasks.first;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import inheritance.tasks.second.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isExit = true;
        int option;

        do {
            System.out.println();
            System.out.println("1. First task");
            System.out.println("2. Second task");
            System.out.println("3. Exit");
            System.out.print("Select the option: ");
            do {
                try {
                    option = Integer.parseInt(reader.readLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Enter an integer: ");
                }
            } while (true);
            switch (option) {
                case 1 -> {
                    Person radu = new Person("Radu", "Chisinau");
                    Student maria = new Student("Maria", "Tbilisi", "Legally", 3, 2050.46);
                    Staff cheerleading = new Staff("Chicago Girls", "Chicago", "nr.20", 347);
                    System.out.println(radu);
                    System.out.println(maria);
                    System.out.println(cheerleading);
                }
                case 2 -> {
                    Square sq = new Square(5.5);
                    Circle cs = new Circle(3.2);
                    Cube cb = new Cube(6.7);
                    Sphere sp = new Sphere(35.5);
                    System.out.println("The area of the square: " + sq.getArea());
                    System.out.println("The area of the circle: " + cs.getArea());
                    System.out.println("The area of the cube: " + cb.getArea());
                    System.out.println("The volume of the cube: " + cb.getVolume());
                    System.out.println("The area of the sphere: " + sp.getArea());
                    System.out.println("The area of the sphere: " + sp.getVolume());
                }
                case 3 -> {
                    reader.close(); //cere prelucrare
                    isExit = false;
                    System.out.println("Have a nice day!");
                }
                default -> System.out.println("This option does not exists");
            }
        } while (isExit);
    }
}
