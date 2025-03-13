package CORE_JAVA.JAVA16_This_Super_Keyword.Eg1_Easy;

public class Car extends Vehicle {

    private int maxSpeed = 300;

    void display(){
        System.out.println("Car class - Display Function");
    }

    Car(){
  //    super();         // This will call parents default constructor-->called Constructor Chaining
        super(10);   // This will call parents Parameterized constructor
        System.out.println("DC CAR");
        System.out.println(this.maxSpeed);  // will give current class instance value
        System.out.println(super.maxSpeed); // will give parent class instance value
        this.display();                     // will call current class display fxn
        super.display();                    // will call parent class display fxn
    }

}
