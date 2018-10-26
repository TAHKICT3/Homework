package lesson8_1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main
{

    public static void main(String[] args )throws IOException
    {
        int a, b;
        Scanner in = new Scanner(new File("src/lesson8_1/input.txt"));
        a = in.nextInt();
        b = in.nextInt();
        if(a > b)
        {
            System.out.println(a + ">" + b);
        }
        else
        {
            if (a < b)
            {
                System.out.println(a + "<" + b);
            }
            else
            {
                System.out.println(a+"="+b);
            }
        }
    }
}
