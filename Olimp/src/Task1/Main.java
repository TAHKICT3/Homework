package Task1;

import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(new FileReader("src\\Task1\\Input.txt"));
            int a = s.nextInt();
            System.out.print(a);
            PrintStream p = new PrintStream("src\\Task1\\Output.txt");
            if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
                if(a%1000==0) {
                    p.println("12/09/" + a);
                }
                else if(a%100==0) {
                    p.println("12/09/0" + a);
                }
                else if(a%10==0) {
                    p.println("12/09/00" + a);
                }
                else{
                    p.println("12/09/000" + a);
                }
            }
            else {
                if(a%1000==0) {
                    p.println("13/09/" + a);
                }
                else if(a%100==0) {
                    p.println("13/09/0" + a);
                }
                else if(a%10==0) {
                    p.println("13/09/00" + a);
                }
                else{
                    p.println("13/09/000" + a);
                }
            }
            p.close();
        }
        catch ( Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
