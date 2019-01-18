package Pack1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write task number.");
        int z = s.nextInt();
        if (z == 1) {
            for (int y = 0; y < 2; y++) {
                System.out.println("Напишите параметры прогрессии.");
                int[] l = Task1(s.nextInt(), s.nextInt());
                for (int i = 0; i < 5; i++) {
                    System.out.println(l[i]);
                }
                System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            }
        }
        if (z == 2) {
            System.out.println("Напишите параметры прогрессии и номер находимого её члена.");
            int l = Task2(s.nextInt(), s.nextInt(), s.nextInt());
            System.out.println(l);
        }
    }
    static int[] Task1(int a, int b) {
        int[] c = new int[5];
        c[0] = a + b;
        for (int i = 1; i<5; i++){
            c[i] = c[i-1] + b;
        }
         return c;
    }
    static int Task2(int a, int b, int c) {
        int d = a;
        for (int i = 0; i < c; i++){
            d-=b;
        }
        return d;
    }
}
