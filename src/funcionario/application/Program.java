package funcionario.application;

import funcionario.entities.Employee;

import javax.naming.Name;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: " );
        employee.name = tc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = tc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = tc.nextDouble();

        System.out.println("Employee: " + employee);
        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(tc.nextDouble());
        System.out.println("Update data: " + employee);
    }
}
