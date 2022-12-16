package HW4;
import java.util.Scanner;

public class Arrays {

    public static void Arraysums(){
        Scanner keyboard = new Scanner(System.in);
        int[] array = new int[10];
        int total = 0;
        int i = 0;
        while(true){
            System.out.print("Enter a number: ");
            int num = keyboard.nextInt();
            if(num == 0){
                break;
            }
            total += num;
            array[i] = num;
            i++;
            System.out.println("The total so far is " + total);
        }
        System.out.println("Total: " + total);
        System.out.print("Array: {");
        for (int j = 0; j < i+1; j++) {
            System.out.print(array[j]);
            if(j != i){
                System.out.print(",");
            }
        }
        System.out.print("}");
    }

    public static String bruteForce(String password){
        String answer = "";
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '!', '@', '#', '$', '%', '^', '&', '*', '(', ')','<','>','/','?'};
        char[] pass = password.toCharArray();
        for (int i = 0; i < pass.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if(pass[i] == alphabet[j]){
                    answer += alphabet[j];
                    System.out.println(answer);
                    break;
                }
            }
        }
        return "";
        }
            
    // Create a method that will sort an Array of integers from smallest to greatest.
    // NOTE: You CANNOT use the built in Arrays.sort method
    // Ex. 
    // sorter([9,10,2,5,3,4,7,8]) -> [2,3,4,5,7,8,9,10]

    // Hint 1: a temp Array is a helpful way to store variables for comparing 
    // Hint 2: 2 nested For loops should be all thats needed for the swapping logic
    public static int[] sorter(int[] nums){       
        int[] sortedArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }  
            System.out.print(nums[i]);
            if(i != nums.length-1){
                System.out.print(", ");
            }
         }
         
        return sortedArray;
    }
    
    public static void main(String[] args) {
        // Tester main method for your methods
        System.out.println("Hello World!\n");
        Arraysums();
        System.out.println("\n");
        System.out.println(bruteForce("sEmIsOvEr!"));

        System.out.print("[");
        int[] nums = {4,10,3,5,7,3,6,8};
        sorter(nums);
        System.out.println("]");
    }
}
