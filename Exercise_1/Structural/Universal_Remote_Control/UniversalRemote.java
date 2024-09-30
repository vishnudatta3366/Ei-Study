package Exercise_1.Structural.Universal_Remote_Control;

public class UniversalRemote {
    private RemoteControl remoteControl;

    public UniversalRemote(RemoteControl remoteControl) {
        if (remoteControl == null) {
            throw new IllegalArgumentException("Remote control cannot be null.");
        }
        this.remoteControl = remoteControl;
    }

    public void turnOnDevice() {
        remoteControl.powerOn();
    }

    public void turnOffDevice() {
        remoteControl.powerOff();
    }

    public void increaseVolume() {
        remoteControl.volumeUp();
    }

    public void decreaseVolume() {
        remoteControl.volumeDown();
    }
}


