package com.codveda.library;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/library_db";
    private static final String USER = "root";
    private static final String PASS = "sai"; /

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            Scanner sc = new Scanner(System.in);
            int choice;
            do {
                System.out.println("\n--- Library Management Menu ---");
                System.out.println("1. Add Book");
                System.out.println("2. View Books");
                System.out.println("3. Add User");
                System.out.println("4. Borrow Book");
                System.out.println("5. Return Book");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        // Add book code
                        break;
                    case 2:
                        // View books code
                        break;
                    case 3:
                        // Add user code
                        break;
                    case 4:
                        // Borrow book code
                        break;
                    case 5:
                        // Return book code
                        break;
                    case 6:
                        System.out.println("Exiting Library System");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } while (choice != 6);
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }
}
