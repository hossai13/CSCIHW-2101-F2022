package HW1;

// make a method that accepts 2 Strings and 1 int (Someones name, age, and favorite color and then returns a story about them)
// Hint1: The objects name is Adlibs and you require a name age and favoriteColor all in strings
// Hint2: You will need to return a string. You can concat the variables and the strings together
// Hint3: A sample story if you are lost can be as simple as "Hello! My name is ____, and I am ____, and my favorite
//        color is ___"
public class Adlibs {
    public String name = "";
    public int age = 0;
    public String favColor = "";

    public Adlibs(String name, int age, String favColor) {
        this.name = name;
        this.age = age;
        this.favColor = favColor;
    }
    public String story(String name, int age, String favColor) {
        return "Hey have you met my friend " + name + "? You won't believe it, he's " + age + " years old and loves the color " + favColor + " just like you!";
    }
}
