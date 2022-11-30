package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of HW\n");

        System.out.println("Hello World\n");

        System.out.println("Sum of 2 + 3 is = " + (2 + 3) + "\n");

        Pyramid.Output();
        System.err.println("\n");

        Adlibs a = new Adlibs("Tobi", 21, "blue");
        System.out.println(a.story(a.name, a.age, a.favColor));

        Replace r = new Replace("\nI need to get some sleep soon.");
        System.err.print(r.str);
        Replace.charReplace(r.str, 15, 'z');
    
        







    }
}
