class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    int numberOfSeats;

    public Car(String brand, int year, int numberOfSeats) {
        super(brand, year);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Seats: " + numberOfSeats);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Car obj1 = new Car("Ferrari", 2019, 4);
        System.out.println("Description on car 1");
        obj1.displayInfo();

        Car obj2 = new Car("BMW", 2015, 2);
        System.out.println("Description on car 2");
        obj2.displayInfo();
    }
}
