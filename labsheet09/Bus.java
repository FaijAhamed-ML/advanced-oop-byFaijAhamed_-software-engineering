package labsheet09;

public class Bus extends Transport{

    public Bus(String vehicleNumber, int distanceTravelled) {
        super(vehicleNumber, distanceTravelled);
    }

    @Override
    public double calculateFare() {
        return 10.0*distanceTravelled;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("thr fare is: "+calculateFare());
    }
}
