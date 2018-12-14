package VectorCalc;

public class Main {
    public static void main(String[] args) {
        Vector a = new Vector(5, 7);
        Vector b = new Vector(8, 2);
        Vector c = Calculator.Calculate(a, '+', b);
        int g = Calculator.CalculateScal(a, b);
        System.out.println(g);
    }
}
