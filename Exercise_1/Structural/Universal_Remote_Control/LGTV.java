package Exercise_1.Structural.Universal_Remote_Control;

public class LGTV {
    public void setPowerState(String state) {
        System.out.println("LG TV is " + state + ".");
    }

    public void adjustVolume(int level) {
        if (level > 0) {
            System.out.println("LG TV volume increased by " + level + " units.");
        } else {
            System.out.println("LG TV volume decreased by " + (-level) + " units.");
        }
    }
}
