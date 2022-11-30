package HW1;

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
