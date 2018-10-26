package While;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите сумму условных едениц положенных на щёт.");
        int a = s.nextInt();
        System.out.println("Введите процент условного банка.");
        int b = s.nextInt();
        int c = 0;
        System.out.println("Введите сумму условных едениц которую вы хотите получить.");
        int d = s.nextInt();
        do{
            a = a + (b * a / 100);
            ++c;
        }while (a < d);
        System.out.print("Сумму " + d + " условных едениц вы сможете получить через " + c + " лет.");
    }
}
