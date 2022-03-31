package ProductCheckout;

import java.util.Scanner;
import java.text.NumberFormat;

public class Checkout {

    public static void sayHello() {

        System.out.println("Welcome to the Check-Out Line");
        System.out.println("------------------------------");
    }
    public static void inputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the name of your product?");
        String productName = sc.nextLine();
        System.out.println("------------------------------");
        System.out.println("What is the price of your product?");
        int productPrice = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------------");
        System.out.println("How many are you buying?");
        int productQuality = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------------");
        //--- Formula Function
        formaula(productPrice, productQuality, productName);
    }
    public static void formaula(int price,int quality, String name) {
        double total = price * quality;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String priceFormatted = currency.format(price);
        String totalFormatted = currency.format(total);
        //--- Display Function
        displayOutput(name, priceFormatted, quality, totalFormatted);
    }

    public static void displayOutput(String name, String priceFormat, int count, String totalPrice) {
        String message =
                "Product:      "+ name + "\n" +
                "Price:     "+ priceFormat + "\n" +
                "Quantity:     "+ count+ "\n" +
                "Total:     "+ totalPrice + "\n";
        System.out.println(message);

    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String choice = "y";
        while(choice.equalsIgnoreCase("y")){
            sayHello();
            inputValue();
            System.out.println("------------------------------");
            //Does the user want to continue?
            System.out.println("Have anymore Items? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("Good Day! ");

    }

}
