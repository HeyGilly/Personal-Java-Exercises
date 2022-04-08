package BankAccount;

public class Main {

    public static void main(String[] args) {
        //Creating a new object (a new bank account holder)
        //Iron-man starting at $187,000.
        BankAccountHolder id_001 = new BankAccountHolder("Iron-Man", 100000);

        //The Account before anything
        System.out.println("------ " +
                "\nHello "+id_001.getOwner()+"!" +
                "\nYour Balance is: $"+id_001.getBalance());
        // A withdraw from IRonman
        id_001.withdraw(25000);
        System.out.println("------ " +
                "\nWithdraw: 25000"+
                "\nhello "+id_001.getOwner()+"!" +
                "\nYour Balance is: $"+id_001.getBalance());

        //A deposit has been updated.
        id_001.deposit(50000);
        System.out.println("------ " +
                "\nDeposit: 50000"+
                "\nhello "+id_001.getOwner()+"!" +
                "\nYour Balance is: $"+id_001.getBalance());
        // a Withdraw has been updated.
        id_001.withdraw(20000);
        System.out.println("------ " +
                "\nWithdraw: 20000"+
                "\nhello "+id_001.getOwner()+"!" +
                "\nYour Balance is: $"+id_001.getBalance()+
                "\n--------");



    }
}
