import stratergy.EVDrive;

class HybridVehicle extends Vehicle {

    public HybridVehicle() {
        super(new EVDrive());
    }
}