package HW3;
import java.util.Scanner;

public class StringCopy {
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
