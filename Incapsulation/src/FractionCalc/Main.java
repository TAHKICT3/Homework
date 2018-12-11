package FractionCalc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        Fraction f = new Fraction(20, 7);
        Fraction ff = new Fraction(3, 12);
        Fraction fff = Calculator.Calculate(f, '*', ff);
    }
}
