package HW4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = 1;
        while (b < a){
            boolean c = true;
            for (int i = 2; i <= Math.sqrt(b); i++){
                if (b % i == 0){
                    c = false;
                }
            }
            if (c == true){
                System.out.println(b);
            }
            ++b;
        }
    }
}
