package HW3;
import java.util.Scanner;

public class RemoveZ {
    static Scanner keyboard = new Scanner(System.in);

    public static String stringZ(){
        System.out.print("Enter a string: ");
        String str = keyboard.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='z'&& i!=0 && i!=str.length()-1)
                str = str.substring(0,i) + str.substring(i+i);
        }
        return str;
    }
}
