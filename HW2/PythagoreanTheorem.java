package HW2;

public class PythagoreanTheorem {
    public double a = 0;
    public double b = 0; 

    public PythagoreanTheorem(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String getHypotenuse() {
        String H = "Hypotenuse: ";
        return H + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

}
