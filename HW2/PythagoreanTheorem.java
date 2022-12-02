package HW2;
import java.util.Scanner;

public class PythagoreanTheorem {
    Scanner keyboard = new Scanner(System.in); 

    public String getHypotenuse() {
        System.out.print("Enter the length of the first side of the triangle: ");
        double a = keyboard.nextInt();
        System.out.print("Enter the length of the second side of the triangle: ");
        double b = keyboard.nextInt();
        double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return "The length of the hypotenuse is: " + h;
        
    }
    
}
