package labsheet09;

public class Taxi extends Transport {

    public Taxi(String vehicleNumber, int distanceTravelled) {
        super(vehicleNumber, distanceTravelled);
    }

    @Override
    public double calculateFare() {
        return 20.0*distanceTravelled;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("the fare is : "+calculateFare());
    }
}
