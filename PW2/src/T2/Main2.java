package T2;

import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a>0&&b>0){
            System.out.println("part 1");
        }
        else if (a>0&&b<0){
            System.out.println("part 2");
        }
        else if (a<0&&b>0){
            System.out.println("part 4");
        }
        else if (a<0&&b<0){
            System.out.println("part 3");
        }
        else{
            System.out.println("point(0;0)");
        }
    }
}
