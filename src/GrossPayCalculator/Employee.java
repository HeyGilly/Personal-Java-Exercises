package GrossPayCalculator;

public class Employee {
    String fullName;
    String location;
    double salary;
    int age;

    Employee(String fullName, String location, double salary, int age){
        this.fullName = fullName;
        this.location = location;
        this.salary = salary;
        this.age = age;
    }

    void raiseSalary(){
        this.salary = this.salary * 1.2;
    }

}
