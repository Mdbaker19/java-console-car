import java.util.Scanner;

public class CarTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        boolean keepOperating = true;
        Car myCar = new Car("Tesla", 0, true);
        do {
            System.out.println("I am a car and I can do many things! [E]xit All This, [D]rive, [R]everse, [V]iew Brand, [S]peed Check");

            String decision = sc.next();

            if(decision.equalsIgnoreCase("e")){
                keepOperating = false;
                System.out.println("Powering Down.....Goodbye");
            }


            if (decision.equalsIgnoreCase("v")) {
                System.out.println(myCar.getBrand());
            } else if(decision.equalsIgnoreCase("d")){
                CarOperations.accelerate(myCar);
            } else if(decision.equalsIgnoreCase("s")){
                System.out.printf("Current speed: %d / mph%n", myCar.getSpeed());
            }

        }while(keepOperating);

    }
}
