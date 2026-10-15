
package com.pluralsight;

import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();


        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Display calculation options
        System.out.println();
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        // Ask the user to select an option
        System.out.print("Please select an option: ");
        String option = scanner.next();

        // Multiply the two numbers
        int result = firstNumber * secondNumber;

        // Display the result
        System.out.printf("%d * %d = %d%n",
                firstNumber, secondNumber, result);

        scanner.close();
    }
}
