package T17;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число.");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 1; i < 10; i++){
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }
}
