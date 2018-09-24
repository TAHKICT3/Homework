package HW1;
import java.io.IOException;
public class Main {

    public static void main(String[] args) {
	int a, b, c, D;
	double d,e;
	try{
	    a = System.in.read();
        b = System.in.read();
        c = System.in.read();
        a=a-48;
        b = b-48;
        c=c-48;
        D=(b*b)-(4*a*c);
        if (D > 0) {
            d = (-b + Math.sqrt(D)) / (2 * a);
            e = (-b - Math.sqrt(D)) / (2 * a);
            System.out.print(d+ ";" +e);
        }
        else if (D==0){
            d = -b / (2 * a);
            System.out.print(d);
        }
        else
            System.out.print("Уравнение корней не имеет.");

    }
    catch (IOException ex){

    }
    }
}
