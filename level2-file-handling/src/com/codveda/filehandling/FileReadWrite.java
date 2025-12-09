package com.codveda.filehandling;

import java.io.*;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input file name (with extension): ");
        String inputFile = sc.nextLine();

        System.out.print("Enter output file name (with extension): ");
        String outputFile = sc.nextLine();

        try {
            // Read input file
            File file = new File(inputFile);
            if (!file.exists()) {
                System.out.println("File not found: " + inputFile);
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int wordCount = 0;
            int lineCount = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                wordCount += line.split("\\s+").length;
            }
            reader.close();

            // Write results to output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write("Input File: " + inputFile + "\n");
            writer.write("Total lines: " + lineCount + "\n");
            writer.write("Total words: " + wordCount + "\n");
            writer.close();

            System.out.println("File processed successfully!");
            System.out.println("Lines: " + lineCount + ", Words: " + wordCount);
            System.out.println("Output written to " + outputFile);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
}
