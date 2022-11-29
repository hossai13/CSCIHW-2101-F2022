package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of HW\n");

        System.out.println("Hello World\n");

        System.out.println("Sum of 2 + 3 is = " + (2 + 3) + "\n");

        Pyramid.Output();
        System.err.println("\n");

        Adlibs a = new Adlibs("Harry", 18, "pink");
        System.out.println(a.story(a.name, a.age, a.favColor));

        Replace r = new Replace("I love cookies", 2, 'G');
        System.out.println(r);
        // Finally look at File called Replace.java. This is a little more difficult.
        // Write some code here to call the charReplace method from the Replace class.
        // Note: Since charReplace is not a static method you will need to create an object of the Replace class
        //       and then call the method on that object.
        // Remember to create an object like this:
        // ClassName ObjectName = new ClassName();
        // Remember to call objects like this:
        // Object.Method()
        // Note2: the charReplace method returns a String type so you will
        //       need to print out the result of the method call.
        // Note3: Look at Replace.java for more information
        







    }
}
