package GrossPayCalculator;

public class Main {

    public static void main(String[] args) {
        //Created new objects by calling the class with custom instance
        Employee bob = new Employee("Bobby Smith", "Los Angeles", 70000, 35);
        Employee lucy = new Employee("Lucy layla", "Toronto", 78000, 32);

        //Before pay raise
        System.out.println(bob.salary);
        System.out.println(lucy.salary);

        //Calling the method to perform
        //the task of raise Salary.
        bob.raiseSalary();
        lucy.raiseSalary();

        //After Pay raise
        System.out.println(bob.salary);
        System.out.println(lucy.salary);
    }


}
