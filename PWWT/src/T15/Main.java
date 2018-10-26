package T15;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 5 чисел через \"Enter\".");
        Scanner s = new Scanner(System.in);
        double a, sum = 0, sor;
        for (int i = 0; i < 5; i++){
            a = s.nextDouble();
            sum+=a;
            sor = sum / (i+1);
            System.out.println("Введено чисел: "+ (i+1) + "; сумма чисел: " + sum + "; среднее арифметическое: "+ sor +".");
        }
    }
}
