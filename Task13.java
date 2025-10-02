public class Task13 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Fortuner", 2025, 5);
        Car car2 = new Car("Suzuki", "Jimny", 2025, 3);

        car1.displayDetail();
        System.out.println();
        car2.displayDetail();
    }
}

class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String vehicleMake, String vehicleModel, int vehicleYear) {
        this.make = vehicleMake;
        this.model = vehicleModel;
        this.year = vehicleYear;
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String vehicleMake, String vehicleModel, int vehicleYear, int carDoors) {
        super(vehicleMake, vehicleModel, vehicleYear);
        this.numberOfDoors = carDoors;
    }

    public void displayDetail() {
        System.out.println("Car Details:\n\tMake: " + this.make + "\n\tModel: " + this.model + "\n\tYear: "
                + this.year + "\n\tNumber of Doors: " + this.numberOfDoors);
    }
}
