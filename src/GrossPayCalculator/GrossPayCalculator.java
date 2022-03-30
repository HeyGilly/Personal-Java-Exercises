package GrossPayCalculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {

        //----- Hard Coded Exercise
        //-- 1. Get the number of hours worked
        int hours = 40;
        //-- 2. Get the hourly pay rate
        double payRate = 25.50;
        //-- 3. Multiply hours and pay rate
        double grossPay = hours * payRate;
        //-- 4. Display results
        System.out.println("Gross pay: " + grossPay);

        System.out.println("----------------------");

        //----- User Input Exercise
        Scanner scanner = new Scanner(System.in);               // Mandatory for you to take in inputs
        //-- 1. Get the number of hours worked
        System.out.println("How many hours did you work?");
        int hoursWorkedThisWeek = scanner.nextInt();            // Takes In Answer
        //-- 2. Get the hourly pay rate
        System.out.println("What is your pay rate?");
        double yourPayRate = scanner.nextDouble();
        scanner.close();        // Closes the scanner
        //-- 3. Multiply hours and pay rate
        double grossPay2 = hoursWorkedThisWeek * yourPayRate;
        //-- 4. Display results
        System.out.println("Gross pay: " + grossPay2);

    }
}