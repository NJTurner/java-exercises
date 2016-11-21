/**
 * Created by NicholasTurner on 11/21/16.
 */
public enum Side {
    LEFT(2),
    RIGHT(1);

    private final int points;

    Side(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}