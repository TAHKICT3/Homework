package PW;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Yours money.");
        Scanner s = new Scanner(System.in);
        double a = s.nextInt();
        double b = a / 100;
        if (a >= 500) {
            if (a >= 1000) {
                if (a >= 10000) {
                    System.out.println("Many money - no sale.");
                }
                else {
                    b *= 5;
                    a -= b;
                    System.out.println("You sale is 5%, you must pay $" + a + ".");
                }
            } else {
                b *= 3;
                a -= b;
                System.out.println("You sale is 3%, you must pay $" + a + ".");
            }
        } else {
            System.out.println("No many - no sale.");
        }
    }
}
