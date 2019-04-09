package MoreExceptions;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

    }
    class P{
        void Cr(File f) throws IOException {
            f.createNewFile();
        }
    }
    class C extends P{
        @Override
        void Cr(File f) throws  IOException{
            super.Cr(f);
            System.out.println(f.length());
        }
    }
}
