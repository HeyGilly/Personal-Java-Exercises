package SongRepeat;

import java.util.Scanner;

public class songRepeat {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    boolean isOnRepeat = true;
    while(isOnRepeat){
        System.out.println(
                "Bye, bye, bye\n" +
                "Don't wanna be a fool for you\n" +
                "Just another player in your game for two\n" +
                "You may hate me, but it ain't no lie,\n" +
                "Baby, bye, bye, bye..."
        );
        System.out.println("-----------Eng of Song-----------------");
        System.out.println("Would you like to take this song off repeat? (yes/no)");
        String userInput = input.next();

        if(userInput.equals("yes")){
            isOnRepeat = false;
        }
    }
        System.out.println("-----------Start of Song-----------------");
        System.out.println("Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you");
    }






}
