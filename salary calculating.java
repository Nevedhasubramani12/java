//Salary calculating
package com.salarycalculator;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter bonus: ");
        double bonus = scanner.nextDouble();

        System.out.print("Enter deductions: ");
        double deductions = scanner.nextDouble();

        double netSalary = basicSalary + bonus - deductions;

        System.out.println("Net Salary: " + netSalary);

    }
}
