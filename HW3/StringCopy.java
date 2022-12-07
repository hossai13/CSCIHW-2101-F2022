package HW3;
import java.util.Scanner;

public class StringCopy {
    //Given a String str and int n return a larger string
    //that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"

    static Scanner keyboard = new Scanner(System.in);


    public static String stringTimes() {
        System.out.print("Enter a string: ");
        String str = keyboard.nextLine();
        System.out.print("Enter a number: ");
        int n = keyboard.nextInt();
        String h = str.repeat(n);
        return h;
    } 
}
