package VectorCalc;

public class Calculator {
    public static Vector Calculate(Vector a, char o, Vector b) {
        Vector c;
        switch (o){
            case '+':  c = new Vector(a.x + b.x, a.y + b.y);
                break;
            case '-': c = new Vector(a.x - b.x, a.y - b.y);
                break;

            default:
                c = new Vector();
                System.out.println("Error, unknown operator.");
        }
        View.Display(a,o,b,c);
        return c;
    }
    public static int CalculateScal(Vector a, Vector b) {
        int y;
        y = a.x * b.x + a.y + b.y;
        return y;
    }
}
