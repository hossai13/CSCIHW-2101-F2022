package HW3;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

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
        String h = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'z') {
                h += str.charAt(i);
            }
        }
        return h; // <- this should be changed 
    }
}
