package LightSwitch;

/**
 * Created by NicholasTurner on 11/29/16.
 */
public class Switch {
    private boolean isOn;

    Switch() {isOn = false;}

    public String flip(){
        if(isOn){
            turnOff();
            return "Lights Out";
        }else{
            turnOn();
            return "I see the light";
        }
    }

    protected void turnOn(){isOn = true;}

    protected void turnOff(){isOn = false;}
}
