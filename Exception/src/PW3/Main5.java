package PW3;
import java.io.IOException;
import java.rmi.RemoteException;

public class Main5 {
    public static void main(String[] args) {
        processExceptions(new Main5());
    }
    public static void processExceptions(Main5 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
       // catch (RemoteException e) {
            //System.out.println(e.toString());
        //}
       // catch(NoSuchFieldException e) {
            //System.out.println(e.toString());
        //}
        //catch(IOException e) {
            //System.out.println(e.toString());
        //}
    }
    public void method1() throws IOException {
        throw new IOException();
    }
    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }
    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}