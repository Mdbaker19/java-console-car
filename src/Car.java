public class Car {

    private String brand;
    private int speed;
    private boolean fuelType;

    public Car(String brand, int speed, boolean ev) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = ev;
    }

    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String newBrand){
        this.brand = newBrand;
    }

    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int newSpeed){
        this.speed = newSpeed;
    }


}
