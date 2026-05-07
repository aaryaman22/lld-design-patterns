public class Demo {

    public static void main(String[] args) {

        System.out.println("====== Strategy Design Pattern ======\n");

        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        Vehicle goodsVehicle = new GoodsVehicle();
        goodsVehicle.drive();

        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();

        Vehicle hybridVehicle = new HybridVehicle();
        hybridVehicle.drive();
    }
}