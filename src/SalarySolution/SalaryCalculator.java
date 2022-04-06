package SalarySolution;

public class SalaryCalculator {

    public static double negativePositive(double hoursPerWeek, double amountPerHour, int vocationDays){
        if (hoursPerWeek < 0){
            return -1;
        }
        if(amountPerHour < 0){
            return -1;
        }
        double weeklyPaycheck = hoursPerWeek * amountPerHour;
        double unpaidTime = vocationDays * amountPerHour * 8;
        return (weeklyPaycheck * 52) - unpaidTime;
    };

    public static double salaryCal(double hoursPerWeek, double amountPerHour, int vocationDays) {
       return negativePositive(hoursPerWeek, amountPerHour, vocationDays);
    };

    public static void main(String[] args) {
        double salary = salaryCal(-5, 15, 8);
        System.out.println(salary);
    }



}
