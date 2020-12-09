public class CarOperations {


    public static void accelerate(Car car){
        int currSpeed = car.getSpeed();
        currSpeed++;
        car.setSpeed(currSpeed);
    }


}
