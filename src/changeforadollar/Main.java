package changeforadollar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    double penny = .01;
    double nickel = .05;
    double dime = .10;
    double quarter = .25;
    int dollar = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Change for a dollar! Your goal is to enter enough change to make exactly " +
                "$1.00");

        System.out.println("Enter your number of pennies:");
        int numofPennies = sc.nextInt();

        System.out.println("Enter your number of nickels:");
        int numofnickles = sc.nextInt();

        System.out.println("Enter your number of dimes:");
        int numofdimes = sc.nextInt();

        System.out.println("Enter your number of quarter:");
        int numofquarters = sc.nextInt();

        sc.close();

        double total = numofPennies * penny + numofnickles * nickel + numofdimes * dime + numofquarters * quarter;

        if (total < dollar){
            double amountShort = dollar - total;

            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + ".");
        }else if (total > dollar){
            double amountOver = total - dollar;
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + ".");
        }else{
            System.out.println("Yay! that's exactly $1.00");
        }
    }
}
