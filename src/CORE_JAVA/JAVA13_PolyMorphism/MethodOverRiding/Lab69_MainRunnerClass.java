package CORE_JAVA.JAVA13_PolyMorphism.MethodOverRiding;

public class Lab69_MainRunnerClass {
    public static void main(String[] args) {

        Lebrador l = new Lebrador();
        l.bark();

        // if we comment the bark method of lebrador class then bark method of parent class i.e. dog class will be called
        l.bark(); // after commenting method of lebrador class - "Dog is Barking".

        Dog d= new Dog();
        d.bark();


    }
}
