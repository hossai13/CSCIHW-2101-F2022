package HW3;
import java.util.Scanner;

public class SumUp {
    static Scanner keyboard = new Scanner(System.in);

     public static void sums(){
        System.out.print("Enter a number: ");
        int n = keyboard.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println("The total so far " + n);
            System.out.print("Enter a number: ");
            int nnew = keyboard.nextInt();
            n += nnew;
             if (nnew == 0) {
                System.out.println("TOTAL ENDED --- The total is " + n);
                break;
            }
        }
    }
}

