package _java.Woche_03.Vererbung_01;

public class Car extends Vehicle {
    private int numberOfDoors;

    @Override
    public void vehicleInformation() {
        super.vehicleInformation();
        System.out.println("Number of doors: " + numberOfDoors);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
