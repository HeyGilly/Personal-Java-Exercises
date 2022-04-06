package StudentProfile;

public class StudentProfile {
    String fName;
    String lName;
    String declaredMajor;
    double gpa;
    int expectedYearToGraduate;

    public StudentProfile(String fName, String lName, String declaredMajor, double gpa, int expectedYearToGraduate){
        this.fName = fName;
        this.lName = lName;
        this.declaredMajor = declaredMajor;
        this.gpa = gpa;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }

    public void incrementExpectedGraduationYear(){
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;


    }

}

