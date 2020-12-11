public class Car {

    private String brand;
    private int speed;
    private boolean fuelType;
    private boolean direction;
    private int charge;

    public Car(String brand, int speed, boolean ev, boolean direction, int charge) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = ev;
        this.direction = direction;
        this.charge = charge;
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

    public void setDirection(){
        this.direction = !this.direction;
    }

    public boolean getDirection(){
        return this.direction;
    }
    public void setCharge(int charge){
        this.charge = charge;
    }
    public int getCharge(){
        return this.charge;
    }


}
