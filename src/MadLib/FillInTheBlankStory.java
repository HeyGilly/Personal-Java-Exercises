package MadLib;

import java.util.Scanner;

public class FillInTheBlankStory {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Let's Create a story!");
            System.out.println("-------------------------");
            System.out.println("Enter an adjective");
            String adjective = scanner.next();

            System.out.println("Enter a season of the year");
            String season = scanner.next();

            System.out.println("Enter a whole number");
            int num = scanner.nextInt();

            scanner.close();

            System.out.println("On a(n) "+adjective+ " "+season+" day, I drink a minimum of "+
                    num + " cups of coffee.");
        }
}
