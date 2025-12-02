package com.codveda.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Basic Calculator - Console version");
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt("Choose an option: ");
            switch (choice) {
                case 1 -> performOperation("addition");
                case 2 -> performOperation("subtraction");
                case 3 -> performOperation("multiplication");
                case 4 -> performOperation("division");
                case 5 -> {
                    System.out.println("Exiting. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid option. Please choose 1 to 5.");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
    }

    private static void performOperation(String op) {
        double a = readDouble("Enter first number: ");
        double b = readDouble("Enter second number: ");

        switch (op) {
            case "addition" -> System.out.printf("Result: %.4f%n", a + b);
            case "subtraction" -> System.out.printf("Result: %.4f%n", a - b);
            case "multiplication" -> System.out.printf("Result: %.4f%n", a * b);
            case "division" -> {
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.printf("Result: %.4f%n", a / b);
                }
            }
            default -> System.out.println("Unknown operation.");
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int v = Integer.parseInt(scanner.nextLine().trim());
                return v;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer. Please try again.");
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid decimal or integer.");
            }
        }
    }
}
