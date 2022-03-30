package FutureInvestment;

import java.text.NumberFormat;
import java.util.Scanner;

public class FutureValueCalculator {
    public static void main(String[] args) {

        //-- Display a welcome Message
        System.out.println("Welcome to the Future Value Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            // get input from user
            System.out.print("Enter Monthly Investment:   ");
            double monthlyInvestment = Double.parseDouble(sc.nextLine());

            System.out.print("Enter yearly interest rate: ");
            double yearlyInterestRate = Double.parseDouble(sc.nextLine());

            System.out.print("Enter number of years:     ");
            int years = Integer.parseInt(sc.nextLine());

            //Convert yearly values to monthly value
            double monthlyInterestRate = yearlyInterestRate / 12 / 100;
            int months = years * 12;

            // Calculate the future value
            double futureValue = 0;
            int i = 1;
            while (i <= months) {
                futureValue = futureValue + monthlyInvestment;
                double monthlyInterestAmount = futureValue * monthlyInterestRate;
                futureValue = futureValue + monthlyInterestAmount;
                i++;
            }

            // format and display the result
            System.out.println("Future value:    " + NumberFormat.getCurrencyInstance().format(futureValue));
            System.out.println();

            //see if the uuser wants to continue
            System.out.print("Continue? (y/n):  ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
        System.out.println("Bye Bye Bye!");
    }
}
