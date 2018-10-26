package T1;


import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.print("Построить треугольник возможно.");
        } else {
            System.out.print("Построить треугольник невозможно.");
        }
    }
}