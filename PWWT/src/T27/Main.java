package T27;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = 1, c = 0, nb = 0, nm = 0, d = 0;
        System.out.println("Введите 10 чисел через \"Enter\".");
        for (int i = 1; i < 11; i++){
            b = s.nextInt();
            if (i == 1){
                c = b-1;
                d = b+1;
            }
            if (c < b){
                c = b;
                nb = i;
            }
            if (d > b){
                d = b;
                nm = i;
            }
        }
        System.out.println("Разность: " + (c - d) + ". Номер наибольшего: " + nb + ". Номер наименьшего: " + nm + ".");
    }
}
