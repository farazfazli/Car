/**
 * Created by farazfazli on 1/7/16.
 */
public class Program {
    private static Car car;
    private static int speedLimit = 80;

    public static void main(String[] args) {
        System.out.println(43);
        car = new Car("blue", "2wd", "sedan", "leather", "red", "fullyloaded", 100, 150, 150, 100, 120, 0, false, true);
        startCar();
        driveCar();
    }

    public static void startCar() {
        car.setPowerState(true);
    }

    public static void shutOffCar() {
        car.setPowerState(false);
    }

    public static void driveCar() {
        if (car.isPowerState()) {
            for (int i = 0; i > speedLimit; i++)
                car.setSpeed(i);
        }
    }
}
