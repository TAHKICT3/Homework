package NTBB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = x&y;
        System.out.println(z);
        z = x|y;
        System.out.println(z);
        z = x^y;
        System.out.println(z);
        z = x>>y;
        System.out.println(z);
        z = x<<y;
        System.out.println(z);
        z = x>>>y;
        System.out.println(z);
        z = z>>>y;
        System.out.println(z);
        z = z>>>y;
        System.out.println(z);
        z = z>>>y;
        System.out.println(z);
        z = z<<y;
        System.out.println(z);
        z = z<<y;
        System.out.println(z);
    }
}
