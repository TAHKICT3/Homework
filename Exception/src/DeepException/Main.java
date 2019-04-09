package DeepException;

public class Main {
    static int x = 8, y =0;
    public static void main(String[] args) {
        System.out.println("Main begin.");
        try {
            m1();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println("Main end.");
    }
    public static void m1() {
        System.out.println("M1 begin.");
        try {
            m2();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println("M1 end.");
    }
    public static void m2() {
        System.out.println("M2 begin.");
        try {
            m3();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println("M2 end.");
    }
    public static void m3() {
        System.out.println("M3 begin.");
        try {
            System.out.println(x/y);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println("M3 end.");
    }
}
