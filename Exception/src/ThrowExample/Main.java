package ThrowExample;

public class Main {
    public static void main(String[] args) {
        try{
            int a = 489576, b = 0;
            Divide(a, b);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
    static void Divide(int a, int b){
        try{
            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }finally {
            System.out.println("Finally");
        }
        System.out.println("╔┼`◄↔◘╚");
    }
}
