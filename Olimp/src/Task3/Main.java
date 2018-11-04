package Task3;

import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new FileReader("src\\Task3\\Input.txt"));
            int n = s.nextInt();
            int[][] a = new int[n][2];
            for (int i = 0; i < n; i++){
                for(int j = 0; j < 2; j++){
                    a[i][j] = s.nextInt();
                }
            }
            int min=(int)Double.POSITIVE_INFINITY, max=(int)Double.NEGATIVE_INFINITY;
            for (int i = 1; i < n; i++){
                min = Math.min(a[i-1][1],a[i][1]);
                max = Math.max(a[i-1][0],a[i][0]);
            }
            PrintStream p = new PrintStream("src\\Task3\\Output.txt");
            if (min >= max){
                p.print("YES");
            }
            else{
                p.print("NO");
            }
        }
        catch (Exception e){
            System.out.print(e.toString());
        }
    }
}
