package T18;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = 1, c = 0;
        System.out.println("Введите число и нажмите \"Enter\". Для завершения ввода чисел введите 0.");
        while (b != 0){
            b = s.nextInt();
            if (c < b){
            c = b;
            }
        }
        System.out.println(c);
    }
}
