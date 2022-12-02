package HW2;
import java.util.Scanner;

public class ClassGrade {
    double grade = 0;
    Scanner keyboard = new Scanner(System.in);

    public String getGrade() {
        System.out.print("Enter your grade percentage: ");
        grade = keyboard.nextDouble();
        if (Math.ceil(grade) >= 90 && Math.ceil(grade) <= 100) {
            return "Grade: A. You did great!";
        } else if (Math.ceil(grade) >= 80 && Math.ceil(grade) <= 89) {
            return "Grade: B. You did good.";
        } else if (Math.ceil(grade) >= 70 && Math.ceil(grade) <= 79) {
            return "Grade: C. You did okay.";
        } else if (Math.ceil(grade) >= 60 && Math.ceil(grade) <= 69) {
            return "Grade: D. You did bad.";
         } else if (Math.ceil(grade) >= 0 && Math.ceil(grade) <= 59) {
            return "Grade: F. You did terrible.";
        } else {
            return "Invalid grade.";
        }
    }
}
