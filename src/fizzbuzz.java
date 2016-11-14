/**
 * Created by NicholasTurner on 11/14/16.
 */
import java.util.Scanner;
public class fizzbuzz {
    public static void main(String[] args) {
        String buzz =  "buzz", fizz = "fizz";
        for (int i = 1; i <= 100; i++)
        {
            if (i % 15 == 0)
            {
                System.out.println(buzz + fizz + " " + i);
            }
            else if (i % 3  == 0 )
            {
                System.out.println(buzz + " " + i);
            }
            else if (i % 5== 0)
            {
                System.out.println(fizz + " "+ i);
            }
        }
    }
}

