import java.util.Scanner;

public class CarTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        boolean keepOperating = true;
        Car myCar = new Car("Tesla", 0, true, true, 100);
        do {
            System.out.println("I am a car and I can do many things! [E]xit All This, [D]rive, [R]everse, [V]iew Brand, [S]peed Check, [B]rake, [C]harge, [L]evel of Charge");

            String decision = sc.next();

            if(decision.equalsIgnoreCase("e")){
                keepOperating = false;
                System.out.println("Powering Down.....Goodbye");
            }


            if (decision.equalsIgnoreCase("v")) {
                System.out.println(myCar.getBrand());
            } else if(decision.equalsIgnoreCase("d")){
                if(myCar.getCharge() > 0) {
                    CarOperations.accelerate(myCar);
                    myCar.setCharge((myCar.getCharge()) - 10);
                } else {
                    System.out.println("Out of charge");
                }
            } else if(decision.equalsIgnoreCase("s")){
                System.out.printf("Current speed: %d / mph%n", myCar.getSpeed());
            } else if(decision.equalsIgnoreCase("r")){
                if(myCar.getSpeed() > 0){
                    System.err.println("Car must be stopped in order to switch gears");
                } else if(myCar.getSpeed() == 0 && myCar.getDirection()){
                    myCar.setDirection();
                    System.out.println("In Reverse");
                } else if(myCar.getSpeed() == 0 && !myCar.getDirection()){
                    myCar.setDirection();
                    System.out.println("In Drive");
                }
            } else if(decision.equalsIgnoreCase("b")){
                myCar.setSpeed(0);
            } else if(decision.equalsIgnoreCase("c")){
                myCar.setCharge(100);
            } else if(decision.equalsIgnoreCase("l")){
                System.out.println("Current chage level: " + myCar.getCharge());
            }
            System.out.println("=============");

        }while(keepOperating);

    }
}
