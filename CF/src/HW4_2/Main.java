package HW4_2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int i = 0;
        while (i < 1000){
            if (i % a == 0 && i % b == 0){
                System.out.println(i);
            }
            ++i;
        }
    }
}
