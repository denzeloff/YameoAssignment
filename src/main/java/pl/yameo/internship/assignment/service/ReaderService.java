package pl.yameo.internship.assignment.service;

import java.util.Scanner;

/**
 *This class is used to check the values that are entered.
 */
public enum ReaderService {
    INSTANCE;
    private Scanner scanner = new Scanner(System.in);

    /**
     * If we use this method, we will be able to enter the value until the condition is met.
     * @return value as Integer
     */
    public Integer readInteger() {
        Integer value = null;
        while (value == null) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
            } else {
                errorMessage();
                scanner.next();
            }
        }
        return value;
    }

    /**
     * If we use this method, we will be able to enter the value until the condition is met.
     * @return vale as Double
     */
    public Double readDouble() {
        Double value = null;
        while (value == null) {
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
            } else {
                errorMessage();
                scanner.next();
            }
        }
        return value;
    }

    private void errorMessage() {
        System.out.println("You have chosen bad input data, try again.");
    }
}
