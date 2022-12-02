package HW2;

public class MathGames {

     public static void main(String[] args){

        System.out.println("Hello World\n");
        
        PythagoreanTheorem p = new PythagoreanTheorem();
        System.out.println(p.getHypotenuse() + "\n");

        ClassGrade g = new ClassGrade();
        System.out.println(g.getGrade() + "\n");

        BillCalc b = new BillCalc();
        System.out.println(b.getBill() + "\n");
        
    }
}