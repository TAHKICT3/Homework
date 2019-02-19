package PracticWorktoString;

public class Main {
    public static void main(String[] args) {
        Check c = new Check("Sasha", "icecream", 1, 0.5);
        System.out.println(c.toString());
    }
}
class Check{
    int c;
    double p;
    String n, m;
    public Check(String n, String m, int c, double p) {
        this.c = c;
        this.p = p;
        this.n = n;
        this.m = m;
    }

    @Override
    public String toString() {
        return "Check:" +
                "name " + n + '\n' +
                "meal " + m + '\n' +
                "count " + c + '\n' +
                "price $" + p + '\n';
    }
}
