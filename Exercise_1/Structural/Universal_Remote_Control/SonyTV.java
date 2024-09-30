package Exercise_1.Structural.Universal_Remote_Control;

public class SonyTV {
    public void power(boolean on) {
        if (on) {
            System.out.println("Sony TV is ON.");
        } else {
            System.out.println("Sony TV is OFF.");
        }
    }

    public void volume(boolean up) {
        if (up) {
            System.out.println("Sony TV volume increased.");
        } else {
            System.out.println("Sony TV volume decreased.");
        }
    }
}
