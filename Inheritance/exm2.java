class vehicle{
    void drive(){
        System.out.println("Repairing a vehicle ");
    }
}
class car extends vehicle{
    void drive(){
        System.out.println("Repairing a car");
    }
}
public class exm2{
    public static void main(String[] args) {
        vehicle obj_vehicle = new vehicle();
        car obj_car = new car();
        obj_vehicle.drive();
        obj_car.drive();
    }
}