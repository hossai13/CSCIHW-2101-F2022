package HW1;
/*
Make the output look like this:
#
##
###
####
#####
####
###
##
#
Hint: the object is created for you (Pyramid) and so is the method (Output)
Hint2: Also notice the method is void meaning you will not be returning anything
*/
public class Pyramid {
    public static void Output() {
        String p1 = "#";
        System.out.println(p1);
        String p2 = p1 + p1;
        System.out.println(p2);
        String p3 = p1 + p2;
        System.out.println(p3);
        String p4 = p3 + p1;
        System.out.println(p4);
        String p5 = p4 + p1;
        System.out.println(p5);
        System.out.println(p4);
        System.out.println(p3);
        System.out.println(p2);
        System.out.println(p1);
    }
}
