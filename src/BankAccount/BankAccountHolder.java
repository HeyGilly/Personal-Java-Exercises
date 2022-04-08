package BankAccount;

public class BankAccountHolder {
    // 1. Make the private Instance Variables
    private String owner;
    private double balance;

    // 3. Make Constructors to make a bank account.
    public BankAccountHolder(String owner, int startingBalance) {
        this.owner = owner;
        //Math.max is taking the max of the starting balance and 0.
        //This will set the balance to whichever is higher
        //forcing the set to be a positive number
        this.balance = Math.max(startingBalance, 0);
    }

    // 2. Make variables accessible
    public String getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }


    //4. Setter
    //Deposit method
    public double deposit(double amt){
        if (amt>0){
            this.balance = this.balance + amt;
            return amt;
        }
        return 0;
    }
    //Withdraw method
    public double withdraw(double amt){
        if(amt<= this.balance){
            this.balance = this.balance - amt;
            return amt;
        }
        return 0;
    }



}
