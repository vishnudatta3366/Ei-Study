package Exercise_1.Structural.Universal_Remote_Control;

public class DeviceAdapter implements RemoteControl {
    private Object device;

    public DeviceAdapter(Object device) {
        if (device == null) {
            throw new IllegalArgumentException("Device cannot be null.");
        }
        this.device = device;
    }

    @Override
    public void powerOn() {
        if (device instanceof SamsungTV) {
            ((SamsungTV) device).turnOn();
        } else if (device instanceof SonyTV) {
            ((SonyTV) device).power(true);
        } else if (device instanceof LGTV) {
            ((LGTV) device).setPowerState("ON");
        } else {
            throw new UnsupportedOperationException("Unsupported device.");
        }
    }

    @Override
    public void powerOff() {
        if (device instanceof SamsungTV) {
            ((SamsungTV) device).turnOff();
        } else if (device instanceof SonyTV) {
            ((SonyTV) device).power(false);
        } else if (device instanceof LGTV) {
            ((LGTV) device).setPowerState("OFF");
        } else {
            throw new UnsupportedOperationException("Unsupported device.");
        }
    }

    @Override
    public void volumeUp() {
        if (device instanceof SamsungTV) {
            ((SamsungTV) device).increaseVolume();
        } else if (device instanceof SonyTV) {
            ((SonyTV) device).volume(true);
        } else if (device instanceof LGTV) {
            ((LGTV) device).adjustVolume(1);
        } else {
            throw new UnsupportedOperationException("Unsupported device.");
        }
    }

    @Override
    public void volumeDown() {
        if (device instanceof SamsungTV) {
            ((SamsungTV) device).decreaseVolume();
        } else if (device instanceof SonyTV) {
            ((SonyTV) device).volume(false);
        } else if (device instanceof LGTV) {
            ((LGTV) device).adjustVolume(-1);
        } else {
            throw new UnsupportedOperationException("Unsupported device.");
        }
    }
}
