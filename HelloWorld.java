/**
 * Created by farazfazli on 1/7/16.
 */
public class HelloWorld {
    private static Car car;
    private int speedLimit = 80;

    public static void main(String[] args) {
        System.out.println(43);
        car = new Car("blue", "2wd", "sedan", "leather", "red", "fullyloaded", 100, 150, 150, 100, 120, false, true, 0);
    }

    public void startCar() {
        car.setmPowerState(true);
    }

    public void driveCar() {
        if (car.ismPowerState()) {
            for (int i = 0; i > speedLimit; i++)
                car.setmSpeed(i);
        }
    }
}
