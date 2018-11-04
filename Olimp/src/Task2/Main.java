package Task2;

import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new FileReader("src\\Task3\\Input.txt"));
            int a = s.nextInt();
            int b = s.nextInt();
            int c = b / a;
            int d = b % a;
            PrintStream p = new PrintStream("src\\Task2\\Output.txt");
            p.println(c);
            p.print(d);
            p.close();
        }
        catch ( Exception e){
            System.out.print(e.getMessage());
        }
    }
}
