package com.example.app;

/**
 * Main entry point for the sample Maven application.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Welcome to the Sample Maven App!");

        Calculator calculator = new Calculator();
        System.out.println("5 + 3 = " + calculator.add(5, 3));
        System.out.println("10 - 4 = " + calculator.subtract(10, 4));
        System.out.println("6 * 7 = " + calculator.multiply(6, 7));
        System.out.println("15 / 3 = " + calculator.divide(15, 3));

        StringUtils stringUtils = new StringUtils();
        System.out.println("Reverse of 'hello': " + stringUtils.reverse("hello"));
        System.out.println("'racecar' is palindrome: " + stringUtils.isPalindrome("racecar"));
    }
}
