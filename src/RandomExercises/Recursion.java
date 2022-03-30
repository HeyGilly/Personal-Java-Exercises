package RandomExercises;

public class Recursion {

    // TODO: use recursion to print out a given number up through 100
         public static void countTo100(int num) {
             if (num >= 101) {
                 System.out.print("All done!");
                 return;
             }
             System.out.print(num + ", ");
             countTo100(num + 1);
         }

    // TODO: use recursion to add all numbers up from 1 to a given number
     public static void addNums(int num) {
         if (num >= 101) {
             System.out.print("All done!");
             return;
         }
         System.out.print(num + ", ");
         addNums(num + 1);
     }

    public static void main(String[] args) {
             System.out.println("\n------------------------\n");
        countTo100(90);
             System.out.println("\n------------------------\n");
        addNums(25);
    }
}
