/**
 * Created by NicholasTurner on 11/11/16.
 */
public class HelloWorld {
    //psvm
    public static void main(String[] args /* ??? */) {
        //sout
        int dayNumber = 5; //small numbers
        long myAge = 36;

        float price;
        price = (float) 2.3; //type casting
        double anotherPrice = 6.5;

        anotherPrice = price + anotherPrice;
        //price = (float) (price + anotherPrice);

        char vowel;
        vowel = 'e';
        //vowel = true;
        boolean isFriday = true;

        String day = "\"Friday\"";

        System.out.println("Hello world!!");
        System.out.print("Hello Mammoth!!");
        System.out.printf(
                "\nHello %s, today is %s, and it's the %dth day of the week ",
                "Codeup",
                day,
                dayNumber
        );
    }
}
