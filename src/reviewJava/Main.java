package reviewJava;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

import static reviewJava.myPlayground.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // Creating a variable
        String username = "Billy";
        // Function
        printS(username);

        Main myWord = new Main();
        myWord.print("Billy Bob is the name");


        //String Array of items of things i had for breakfast

        String[] breakfast = new String[0x6];
        breakfast[0] = "Apples";
        breakfast[1] = "Eggs";
        breakfast[2] = "Bacon";
        breakfast[3] = "Orange Juice";
        breakfast[4] = "Toast";
        breakfast[5] = "Avocado";
        System.out.println("------ For loop -----");
        // for loop that will call on all items
        for (String s : breakfast) {
            System.out.println(s);
        }
        System.out.println("------ For loop - Old Way, same result -----");
        // OLD way to do it
        for(int XY = 0; XY < breakfast.length;XY++){
            System.out.println(breakfast[XY]);
        }

        System.out.println("------ Condition Statement Function-----");
        conditionalStatement();

        System.out.println("------ Outside Classes but within the same package-----");
        // Since myPlayground is within out package, we do not need to import it.
        myPlayground myPlay = new myPlayground();
        myPlay.outsideClass();
        System.out.println("This outside number is "+ number);

        System.out.println("------ Taking an input and display it-----");
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello "+name);


        System.out.println("------ Read Data from a file-----");
        Path file = FileSystems.getDefault().getPath("", "src/reviewJava/file.txt");
        List<String> lines = Files.readAllLines(file);
//        for (String line : lines) {
//            System.out.println(line);
//        }
        //--- Another way to do it is
//        lines.forEach((str) -> System.out.println(str));
        //--- Another way to do it.
        lines.forEach(System.out::println);
    }

    void print(String data){
        System.out.println(data);
    }

    //--- Creating a method aka function
    static void printS(String data){
        System.out.println( " this is the users name: "+data);
    }

    //--- Condition Statement
    static void conditionalStatement(){
        boolean choice1 = 1==1;
        boolean choice2 = 1>=3;
        if (choice1 || choice2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }



}
