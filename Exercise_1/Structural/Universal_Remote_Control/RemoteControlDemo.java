package Exercise_1.Structural.Universal_Remote_Control;

public class RemoteControlDemo {
    public static void main(String[] args) {
        // Using Samsung TV
        SamsungTV samsungTV = new SamsungTV();
        DeviceAdapter samsungAdapter = new DeviceAdapter(samsungTV);
        UniversalRemote samsungRemote = new UniversalRemote(samsungAdapter);

        samsungRemote.turnOnDevice();
        samsungRemote.increaseVolume();
        samsungRemote.turnOffDevice();

        // Using Sony TV
        SonyTV sonyTV = new SonyTV();
        DeviceAdapter sonyAdapter = new DeviceAdapter(sonyTV);
        UniversalRemote sonyRemote = new UniversalRemote(sonyAdapter);

        sonyRemote.turnOnDevice();
        sonyRemote.decreaseVolume();
        sonyRemote.turnOffDevice();

        // Using LG TV
        LGTV lgTV = new LGTV();
        DeviceAdapter lgAdapter = new DeviceAdapter(lgTV);
        UniversalRemote lgRemote = new UniversalRemote(lgAdapter);

        lgRemote.turnOnDevice();
        lgRemote.increaseVolume();
        lgRemote.turnOffDevice();
    }
}
