package _java.Woche_03.Vererbung_01;

public class Main {
    public static void main(String[] args) {
    Vehicle plane = new Vehicle();
    Car car = new Car();

    plane.setManufacturer("Fairchild Republic");
    plane.setModel("A-10 Thunderbolt");
    plane.setConstructionYear(1984);

    car.setManufacturer("Toyota");
    car.setModel("PoloV1");
    car.setConstructionYear(2021);
    car.setNumberOfDoors(4);


    }
}
