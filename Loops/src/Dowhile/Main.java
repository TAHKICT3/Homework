package Dowhile;

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
            System.out.println("Желаете забрать сумму сейчас? Для этого введите \"1\". Она равна " + a + " условных едениц.");
            char t = s.next().charAt(0);
            if (t == 1){
                break;
            }
            else{
                System.out.println("Желаете положить на щёт ещё денег? Для этого введите \"1\".");
                t = s.next().charAt(0);
                if (t == 1){
                    System.out.println("Введите сумму, которую вы хотите добавить.");
                    int y = s.nextInt();
                    a = a + y;
                }
            }
        }while (a < d);
        System.out.print("Сумму " + a + " условных едениц вы получаете через " + c + " лет.");
    }
}
