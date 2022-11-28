package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of HW\n");

        System.out.println("Hello World\n");

        // Write some code here to print out the sum of 2 and 3 to the console.
        System.out.println("Sum of 2 + 3 is = " + (2 + 3) + "\n");

        Pyramid.Output();
        // You will see another file called Pyramid.java
        // Write some code here to call the Output method from the Pyramid class.
        // Note: Since Pyramid is a static method you will need to call it like this:
        // Class.Method()
        // Note2: Look at Pyramid.java for more information

        Adlibs a = new Adlibs("Harry", 18, "pink");
        System.out.println(a.story(a.name, a.age, a.favColor));


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
