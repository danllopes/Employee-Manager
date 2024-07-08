import entities.Employee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        System.out.println("""

                Confira o enunciado completo no arquivo PDF
                localizado no pacote 'documentação'.
                """);

        ArrayList<Employee> list = new ArrayList<>();
        int number;
        double percentage;

        System.out.print("How many employees will be registered: ");
        number = sc.nextInt();

        for(int i = 1; i <= number; i++) {
            System.out.printf("\nEmployee #%d:", i);

                System.out.print("\nId: ");
                int id = sc.nextInt();

                while (employeeAlreadyExists(list, id)) {
                    System.out.println("Employee already registered! Try again");
                    System.out.print("Id: ");
                    id = sc.nextInt();
                }


            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }


        System.out.print("\nEnter the employee id that will have salary increase: ");
        int optionalEmployee = sc.nextInt();

        Employee employee =  list.stream()
                .filter(emp -> emp.getId().equals(optionalEmployee))
                .findFirst().orElse(null);

        if (employee != null) {
            System.out.print("Enter percentage: ");
            percentage = sc.nextDouble();

            employee.updateSalary(percentage);
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println("\nList of employees:");
        for(Employee emp: list) {
            System.out.println(emp);
        }

        sc.close();
    }

    public static boolean employeeAlreadyExists(ArrayList<Employee> list, int id) {
        return list.stream()
                .anyMatch(employee -> employee.getId().equals(id));
    }
}