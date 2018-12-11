package VectorCalc;

public class View {
    public static void Display(Vector a, char o, Vector b, Vector c)
    {
        System.out.println("(" + a.x + ", " + a.y + ") " + o + " (" + b.x + ", " + b.y + ") = (" + c.x + ", " + c.y + ")" );
    }
}
