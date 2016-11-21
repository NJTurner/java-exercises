/**
 * Created by NicholasTurner on 11/21/16.
 */
public enum colors {
    RED(0.0),
    BLUE(0.1),
    YELLOW(0.25),
    GREEN(.35),
    PURPLE(.50),
    PINK(1.00);

    private final double discount;

   colors(double discount) {
        this.discount = discount;
    }

    public double applyDiscount(double payment){
        double totalDiscount;
        totalDiscount = payment * this.discount;
        return totalDiscount;
    }
}
