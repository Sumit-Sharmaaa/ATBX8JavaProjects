package CORE_JAVA.JAVA16_This_Super_Keyword.Eg1_Easy;

public class Vehicle {
    public int maxSpeed = 200;


    public Vehicle() {
        System.out.println("DC Vehicle");
    }


    public Vehicle(int a) {                     // method overloading
        System.out.println("PC Vehicle");
    }

    void display(){
        System.out.println("Vehicle Class - Display Function");
    }
}
