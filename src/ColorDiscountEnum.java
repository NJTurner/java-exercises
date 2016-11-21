/**
 * Created by NicholasTurner on 11/21/16.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class ColorDiscountEnum {
    public static void main(String[] args) {
        double payment;
        double discount;
        double total;
        String discountInformation;
    // Get a random number between 1 and 6 (inclusive)
        int random = (int) Math.ceil(Math.random() * 6);
        Scanner input = new Scanner(System.in);
        System.out.println("What is the price for the goods?");
        payment = input.nextDouble();

        if(random == 1){
            discount = colors.RED.applyDiscount(payment);
        } else if(random == 2){
            discount = colors.BLUE.applyDiscount(payment);
        } else if(random == 3){
            discount = colors.YELLOW.applyDiscount(payment);
        } else if(random == 4){
            discount = colors.GREEN.applyDiscount(payment);
        } else if(random == 5){
            discount = colors.PURPLE.applyDiscount(payment);
        } else {
            discount = colors.PINK.applyDiscount(payment);
        }

        discountInformation = outputDiscount(payment, discount);
        System.out.println(discountInformation);

        input.close();
    }
    protected static String outputDiscount(double payment, double discount){
        DecimalFormat df2 = new DecimalFormat("0.00");
        double total = payment - discount;
        return "The discount for $" + df2.format(payment) + " is $" + df2.format(discount) + " for a grand total of $" + df2.format(total);
    }
}
