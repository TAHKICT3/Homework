package FractionCalc;

public class Calculator {
    public static Fraction Calculate(Fraction a, char m, Fraction b)
    {
        Fraction c;
        switch (m){
            case '+':  c = new Fraction(a.n*b.d + b.n*a.d,a.d*b.d);
                break;
            case '-': c = new Fraction(a.n*b.d - b.n*a.d,a.d*b.d);
                break;
            case '*': c = new Fraction(a.n*b.n,a.d*b.d);
                break;
            case '/': c = new Fraction(a.n*b.d,a.d*b.n);
            break;
            default:
                c = new Fraction();
                System.out.println("Error, unknown operator.");
        }
        c = Сокращатель(c);
        View.Display(a, m, b, c);
        return c;
    }
    public static Fraction Сокращатель(Fraction a){
        if (a.n > a.d){
            for (int i = a.n; i > 1; i--){
                if(a.n % i == 0 && a.d % i == 0){
                    a.n = a.n / i;
                    a.d = a.d / i;
                }
            }
        }
        else{
            for (int i = a.d; i > 1; i--) {
                if (a.d % i == 0 && a.n % i == 0) {
                    a.n = a.n / i;
                    a.d = a.d / i;
                }
            }
        }
        return a;
    }
}
