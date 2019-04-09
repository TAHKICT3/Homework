package FinallyTry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x =0, index = 0, y = 1;
        int[] z  = new int[10];
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("1 or 2 or 3");
            try{
                x = s.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println(e.toString());
                s.next();
                continue;
            }
            if (x == 1){
                index  = 25;
                break;
            }
            else if (x == 2){
                y = 0;
            }
            else if ( x == 3){
                break;
            }
            else{
                System.out.println("Mistake in input.");
            }
        }
        try{
            z[index] = 100;
            x = 10 / y;
            System.out.println("No errors.");
            return;
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Error:" + e);
        }finally {
            System.out.println("Ending of work scanner.");
            s.close();
        }
    }
}
