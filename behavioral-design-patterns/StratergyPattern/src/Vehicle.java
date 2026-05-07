import stratergy.DriveStrategy;

class Vehicle {

    DriveStrategy driveStrategy;

    // Constructor Injection
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        System.out.print(this.getClass().getSimpleName() + " -> ");
        driveStrategy.drive();
    }
}