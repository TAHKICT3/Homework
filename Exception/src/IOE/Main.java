package IOE;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File f = new File("src/IOE/378yg5uqtgj4whji8");
        try{
            f.createNewFile();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println(f.length());
        try {
            FC(f);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        int[] a = {1, 2, 3};
        try {
        D(a);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        C();
    }
    public static void FC(File f)throws IOException {
        f.createNewFile();
    }
    static  void C(){
    try{
        int x = 9, y =0;
        System.out.println(x/y);
    }
        catch (Exception e){
            System.out.println(e.toString());
    }
    }
    static void D(int[] q){
            System.out.println(q[3]);
    }
}
