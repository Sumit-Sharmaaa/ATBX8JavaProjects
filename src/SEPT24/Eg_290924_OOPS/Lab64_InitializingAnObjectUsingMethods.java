package SEPT24.Eg_290924_OOPS;

public class Lab64_InitializingAnObjectUsingMethods {
    static class Animal
    {
        String color;
        int age;
        void initializeObject(String c, int a)
        {
            color=c;
            age=a;
        }
        void display()
        {
            System.out.println(color+" "+ age);
        }

        public static void main(String[] args) {
            Animal dog = new Animal();
            dog.initializeObject("Brown",10);
            dog.display();
            System.out.println(dog.color+" "+ dog.age);

        }
    }
}
