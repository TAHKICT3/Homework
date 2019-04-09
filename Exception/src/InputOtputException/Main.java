package InputOtputException;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("src/InputOtputException/kfngl49930sjgh");
        try {
            f1.createNewFile();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println(f1.length());
    }
}
