package LightSwitch;

/**
 * Created by NicholasTurner on 11/29/16.
 */
public class SwitchApp {
    public static void main(String[] args) {
        System.out.println("We just installed a new light switch");

        Switch button = new Switch();

        String lightStatusMessage;
        lightStatusMessage = button.flip();
        System.out.println(lightStatusMessage);
    }
}
