package MultipleChoice;

import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {
        String question = "Which allows the storage of a null key and null values?\n";
        String choiceOne = "hashtable";
        String choiceTwo = "hashmap";
        String choiceThree = "neither";
        Boolean answerIs = true;

        String correctAnswer = choiceTwo;

        while (answerIs) {
            System.out.println(question);
            System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", or " + choiceThree + "? ");

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();


            if (correctAnswer.equals(userInput.toLowerCase())) {
                System.out.println("Congrats! you're right!");
                answerIs = false;
            }else{
                System.out.println("----------------------------");
                System.out.println("Sorry that is incorrect, guess again");
                System.out.println("----------------------------");

            }

        }



        System.out.println("-----------Next Question-----------------");

    }






}
