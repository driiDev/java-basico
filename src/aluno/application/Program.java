package aluno.application;

import aluno.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Nome do aluno: ");
        student.name = tc.nextLine();
        System.out.print("Nota do 1° trimestre: ");
        student.n1 = tc.nextDouble();
        System.out.print("Nota do 2° trimestre: ");
        student.n2 = tc.nextDouble();
        System.out.print("Nota do 3° trimestre: ");
        student.n3 = tc.nextDouble();

        System.out.println(student);
    }
}
