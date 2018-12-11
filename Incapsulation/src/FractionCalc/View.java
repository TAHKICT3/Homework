package FractionCalc;

public class View {
    public static void Display(Fraction a, char m, Fraction b, Fraction c)
    {
        System.out.println(a.n + "\n----\n" + a.d);
        System.out.println(m);
        System.out.println(b.n + "\n----\n" + b.d);
        System.out.println("=");
        System.out.println(c.n + "\n----\n" + c.d);
    }
}
