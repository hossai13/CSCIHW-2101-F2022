package HW3;
import java.util.Scanner;

public class EChar {
    static Scanner keyboard = new Scanner(System.in); 

    public static boolean loopE(){
        System.out.print("Enter a string to see if it contains the char 'e' 1-3 times: ");
        String str = keyboard.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='e')
            count++;
        }
        return (count >=1 && count <=3);
    }
}
 
