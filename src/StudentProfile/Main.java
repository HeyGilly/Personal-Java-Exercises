package StudentProfile;


public class Main {


    public static void main(String[] args) {
    StudentProfile studentOne = new StudentProfile("Mark", "Locke", "Science", 3.5, 2023);

    studentOne.incrementExpectedGraduationYear();       // THis add one to the year
    System.out.println(studentOne.expectedYearToGraduate);

    }
}
