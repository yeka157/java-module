package day7;

import day7.exercise.Average;
import day7.exercise.CsvReader;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Average average = new Average();
            average.countAverage();
            CsvReader csvReader = new CsvReader();
            csvReader.run();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
