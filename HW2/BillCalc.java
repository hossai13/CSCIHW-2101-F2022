package HW2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class BillCalc {
    double bill = 0;
    double people = 0;
    double tip = 0;
    Scanner keyboard = new Scanner(System.in); 
    DecimalFormat df = new DecimalFormat("0.00");

    public String getBill() {
        System.out.print("Enter the total bill amount: ");
        bill = keyboard.nextDouble();
        System.out.print("Enter the number of people: ");
        people = keyboard.nextDouble();
        System.out.print("Enter the tip percentage: ");
        tip = keyboard.nextDouble();
        double total = (bill * (tip / 100)) / people;
        return "$" + df.format(Math.ceil(total))  + " is the rough amount each person should pay.";
    }

}
