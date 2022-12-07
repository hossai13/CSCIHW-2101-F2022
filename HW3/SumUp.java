package HW3;
import java.util.Scanner;

public class SumUp {
    //Create a method that contains a while loop that allows for
    //The user to input numbers until the number 0 is entered. Each time a number is 
    //entered the total will be summed and then prompted for a second number. 
    //NOTE: I require the use of scanner here to get each integer from the user
    //Assume the numbers entered are integers
    //Also note that the method is void meaning you will not need to return anything
    //It will need to sysout the numbers however
    //Below is a sample output what I would like
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 2
    // The total so far is 24.
    // Number: 3
    // The total so far is 27.
    // Number: 0
    // TOTAL ENDED --- The total is 27.

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

