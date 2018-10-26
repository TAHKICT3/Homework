package HW4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int a = s.nextInt();
        int b = 1;
        int c = 2;
        int d;
        int i = 0;
        System.out.println(b);
        System.out.println(b);
        System.out.println(c);
        while (i < a - 3){
            ++i;
            d = b + c;
            b = c;
            c = d;
            System.out.println(d);
        }
    }
}
