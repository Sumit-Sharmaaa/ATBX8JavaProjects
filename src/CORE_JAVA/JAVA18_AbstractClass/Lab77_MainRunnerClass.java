package CORE_JAVA.JAVA18_AbstractClass;

public class Lab77_MainRunnerClass {
    public static void main(String[] args) {
        Car c1= new Car();
        System.out.println("Car Tyres = "+c1.noOfTyres);
        c1.start();

        Scooter s1 = new Scooter();
        System.out.println("Scooter Tyres = "+s1.noOfTyres);
        s1.start();
    }
}
