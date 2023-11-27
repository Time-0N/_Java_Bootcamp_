package _java.Woche_03.Vererbung_01;

public class Main {
    public static void main(String[] args) {
    Vehicle plane = new Vehicle();
        plane.setManufacturer("Fairchild Republic");
        plane.setModel("A-10 Thunderbolt");
        plane.setConstructionYear(1984);
        plane.vehicleInformation();

    Car car = new Car();
        car.setManufacturer("Toyota");
        car.setModel("PoloV1");
        car.setConstructionYear(2021);
        car.setNumberOfDoors(4);
        car.vehicleInformation();


    }
}
