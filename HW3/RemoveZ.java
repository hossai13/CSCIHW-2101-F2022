package HW3;
import java.util.Scanner;

public class RemoveZ {
    //Create a method Given a string, return the string where all of the "z"
    //Have been removed. Except do not remove a z at the start
    //or end
    //Ex.
    //stringZ("zHelloz") -> "zHelloz"
    //stringZ("nozthaznks") -> "nothanks"
    //stringZ("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"
    static Scanner keyboard = new Scanner(System.in);

    public static String stringZ(){
        System.out.print("Enter a string: ");
        String str = keyboard.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='z'&& i!=0 && i!=str.length()-1)
                str = str.substring(0,i) + str.substring(0+i);
        }
        return str;
    }
}
