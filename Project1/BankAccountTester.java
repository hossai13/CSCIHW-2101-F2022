package Project1;  

public class BankAccountTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Account Tester\n ");
        
        BankAccount gregChecking = new BankAccount(20000);
        BankAccount mdChecking = new BankAccount(10000);

        BankAccount.interact(gregChecking, mdChecking);

    }
}