package TryCatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] g = new int[10];
        boolean p = true;
        for (int i = 0; i < g.length; i++) {
            try{if (p == false){
                s.next();
            }
                g[i] = s.nextInt();
            }
            catch (Exception e ){
                System.out.println(e.getMessage());
                p = false;
                i--;
            }
        }
        System.out.println("█▄▄▌▐▀█▄▄▌▐▀█▄▄▌▐▀█▄▄▌▐▀█▄▄▌▐▀█▄▄▌▐▀█▄▄▌▐▀");
        for (int u : g) {
            System.out.println(u);
        }
    }
}
