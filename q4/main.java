package lab09.q4;

public class main {
    public static void main(String[] args) {

        Device Device1 = new Device("D1234", "Mobile");
        Device Device2 = new Device("D1122", "Smart Phone");
        Device Device3 = new Device("D2233", "" + "flip Phone");

        Device1.displaydeviceInfo();
        Device2.displaydeviceInfo();
        Device3.displaydeviceInfo();

        Device.displayDeviceCount();

    }
    }