package SEPT24.Eg_290924_OOPS;

public class Lab62_ClassesAndObjectsIntro {
    public static class Animal
    {
        public void eat()
        {
            System.out.println("I am Eating");
        }

        public static void main(String[] args) {
            System.out.println("1");
            Animal buzo = new Animal();
            buzo.eat();
            buzo.run();
         //   buzo.fly();
            Birds sparrow = new Birds();
            sparrow.fly();

        }
        public void run()
        {
            System.out.println("I am Running");
        }
         public static class Birds
         {
             void fly()
             {
                 System.out.println("I am Flying");
             }
         }
    }
}
