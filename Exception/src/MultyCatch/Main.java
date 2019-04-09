package MultyCatch;



public class Main {
    public static void main(String[] args) {
        int x = 8;
        int y = 0;
        double[] z = {3.4 , 235.5, 7.5, 9.32345};
        try {
            System.out.println(x / y);
            System.out.println(z[5]);
        }
        catch (IndexOutOfBoundsException o){//(ArithmeticException e){
            System.out.println(o.toString());
        }
        catch(RuntimeException e){ //(IndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }
}
