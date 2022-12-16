package Project1;

import java.util.Scanner;

public class BankAccount {
    private double balance;
    private String name;
    private double interestRate = 0.01;
    private int period = 4;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public BankAccount(String name) {
        this.name = name;
        this.balance = 0;
    }
    public BankAccount(double balance){
        this.balance = balance;
        this.name = "No Name";
    }
   
    public BankAccount(){
        this.balance = 0;
        this.name = "No Name";
    }

    public double getBalance() {
        return balance;
    }

    public String printBalance() {
        return "Your Balance is: $" + balance;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void monthlyFee(double fee) {
        withdraw(fee);
    }

    public void calcInterest(double principal, int time, double rate, int annum){
        double amount = principal * Math.pow(1+ (rate/annum), annum*time);
        double roundedamount = Math.round(amount * 100.0) / 100.0;
        double compinterest = amount - principal;
        compinterest = Math.round(compinterest * 100.0) / 100.0;
        System.out.println("Current Rate is: "+rate+"%");
        System.out.println("Current Period is: "+annum+" times per year");
        System.out.println("Selected Time is: "+time+" years");
        System.out.println("Compound Interest after " + time + " years: $" + compinterest);
        System.out.println("Amount after " + time + " years: $" + roundedamount);
    }

    public void calcSimpleInterest(double principal, int time, double rate){
        double amount = (principal * rate * time)/100;
        double roundedamount = Math.round(amount * 100.0) / 100.0;
        double simpleinterest = amount;
        simpleinterest = Math.round(simpleinterest * 100.0) / 100.0;
        System.out.println("Current Rate is: "+rate+"%");
        System.out.println("Selected Time is: "+time+" years");
        System.out.println("Simple Interest after " + time + " years: $" + simpleinterest);
        System.out.println("Amount after " + time + " years: $" + roundedamount);
    }
    
    public static int menu(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Bank Account Menu");
        System.out.println("--------------------------------");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Print Balance");
        System.out.println("4. Calculate Compound Interest");
        System.out.println("5. Calculate Simple Interest");
        System.out.println("6. Transfer Money");
        System.out.println("7. Savings Account");
        System.out.println("0. Exit");
        System.out.print("Please enter your choice: ");
        choice = input.nextInt();
        return choice;
    }

    public void overdraft(double amount){
        if (balance - amount < 0){
            System.out.println("You have insufficient funds to withdraw this amount");
            System.out.println("Would you like to withdraw the amount and be charged a fee of $35?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 1){
                balance -= amount;
                balance -= 35;
                System.out.println("You have been charged a fee of $35");
                System.out.println("Your new balance is: $" + balance);
            } else if (choice == 2){
                System.out.println("Your balance is: $" + balance);
            } else {
                System.out.println("Invalid Choice");
            }
        } else {
            balance -= amount;
            System.out.println("Your new balance is: $" + balance);
        }
    }

    public static void transfer(BankAccount gregChecking, BankAccount mdChecking){
        System.out.println("How much would you like to transfer?");
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();
        gregChecking.overdraft(amount);
        mdChecking.deposit(amount);
        System.out.println("Account 2's new balance is: $" + mdChecking.getBalance());
    }

    public static void interact(BankAccount account, BankAccount account2){
        int choice = menu();
        Scanner input = new Scanner(System.in);
        if (choice == 1) {
            System.out.println("How much would you like to deposit?");
            double amount = input.nextDouble();
            account.deposit(amount);
            System.out.println(account.printBalance());
          
        } else if (choice == 2) {
            System.out.println("How much would you like to withdraw?");
            double amount = input.nextDouble();
            System.out.println(account.printBalance());
            account.overdraft(amount);
    
        } else if (choice == 3) {
            System.out.println(account.printBalance());
            
        } else if (choice == 4) {
            System.out.println("What is the time in years to invest (Whole Numbers Only)?");
            int time = input.nextInt();
            account.calcInterest(account.getBalance(), time, account.interestRate, account.period);
            System.out.println("... Thank you for using the Bank Account Menu. Have a nice day! ...");

        } else if (choice == 5) {
            System.out.println("What is the time in years to invest (Whole Numbers Only)?");
            int time = input.nextInt();
            account.calcSimpleInterest(account.getBalance(), time, account.interestRate);
            System.out.println("... Thank you for using the Bank Account Menu. Have a nice day! ...");
        } else if (choice == 6) {
            System.out.println("Would you like to transfer money to Account 2?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int choice2 = input.nextInt();
            if (choice2 == 1){
                transfer(account, account2);
            } else if (choice2 == 2){
                System.out.println("... Thank you for using the Bank Account Menu. Have a nice day! ...");
            } else {
                System.out.println("Invalid Choice");
            }
            System.out.println("... Thank you for using the Bank Account Menu. Have a nice day! ...");
        } else if (choice == 7) {
            savings(account);
        } else if (choice == 0) {
            System.out.println("Thank you for using the Bank Account Menu");
        } else { 
            System.out.println("Invalid Choice");
            
        }

    }
    public static void savings(BankAccount account) {
        System.out.println("\nWould you like to create a savings account?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("How much would you like to deposit?");
            double amount = input.nextDouble();
            account.deposit(amount);
            System.out.println("Would you like to create a savings account with compound interest or simple interest?");
            System.out.println("1. Compound Interest");
            System.out.println("2. Simple Interest");
            int choice2 = input.nextInt();
            if (choice2 == 1) {
                account.calcInterest(account.getBalance(), 1, 0.0001, 4);
            } else if (choice2 == 2) {
                account.calcSimpleInterest(account.getBalance(), 1, 0.001);
            } else {
                System.out.println("Invalid Choice");
            }
        } else if (choice == 2) {
            System.out.println("Thank you for using the Bank Account Menu");
        } else {
            System.out.println("Invalid Choice");
        }
    }
}