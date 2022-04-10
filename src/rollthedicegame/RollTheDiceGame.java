package rollthedicegame;

import javax.swing.text.SimpleAttributeSet;
import java.sql.SQLOutput;
import java.util.Random;

public class RollTheDiceGame {

    public static void main(String[] args) {
        int lastSpace = 20;
        int StartingSpace = 0;
        int maxRolls = 5;
        Random randomNum = new Random();

        System.out.println("Welcome to the Dice game!");
        System.out.println("You have 5 rolls to go to the finish line, 20 spaces. ");

        for(int i = 1; i<=maxRolls;i++){

            int dice = randomNum.nextInt(6)+1;
            StartingSpace += dice;

            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, dice));

            if(StartingSpace == lastSpace){
                System.out.println("You're on space " + StartingSpace + ". Congrats, you win!");
                break;
            }else if (StartingSpace > lastSpace){
                System.out.println("Unfortunately, that takes you past " + lastSpace + " spaces. You Lose!");
                break;
            }else if (i==maxRolls && StartingSpace < lastSpace){
                System.out.println("You're on space " + StartingSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " + lastSpace + " spaces. you lose!");
            }else{
                int spacesToGo = lastSpace - StartingSpace;
                System.out.print("You are now on space " + StartingSpace + " and have "+spacesToGo+" more to go. ");
            }
            System.out.println();

        }

    }



}
