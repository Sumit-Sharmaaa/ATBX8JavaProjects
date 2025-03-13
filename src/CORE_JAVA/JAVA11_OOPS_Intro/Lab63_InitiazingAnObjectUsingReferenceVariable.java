package CORE_JAVA.JAVA11_OOPS_Intro;

public class Lab63_InitiazingAnObjectUsingReferenceVariable {
    static class Animal
    {
        String color="Black";
        int age =12;

        public static void main(String[] args) {
            Animal dog = new Animal();
            dog.color="Brown";
            dog.age=10;

            System.out.println("Dog's color is "+dog.color);
            System.out.println("Dog's age is "+dog.age);
        }
    }
}
