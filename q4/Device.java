package lab09.q4;

public class Device {
    private String deviceId;
    private String deviceType;

    static int deviceCount;

    static {
        deviceCount=100;
    }

    public Device(String deviceId, String deviceType) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        deviceCount++;
    }

    public static void displayDeviceCount(){
        System.out.println("the devices count is: "+deviceCount);
    }
    public void displaydeviceInfo(){
        System.out.println("device id is: "+deviceId);
        System.out.println("Device type is: "+deviceType);
    }
}
