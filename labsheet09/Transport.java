package labsheet09;

abstract class Transport {
    protected String vehicleNumber;
    protected int distanceTravelled;

    public Transport(String vehicleNumber, int distanceTravelled) {
        this.vehicleNumber = vehicleNumber;
        this.distanceTravelled = distanceTravelled;
    }

    abstract public double calculateFare();

    public void displayDetails(){
        System.out.println("The Vehicle number is: "+vehicleNumber);
        System.out.println("The Vehicle travelled distance is: "+distanceTravelled);
    }
}
