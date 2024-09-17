package SEPT24.Eg_150924_String;

public class Lab5_String2 {
    public static void main(String[] args) {

        String str = "Very";
        System.out.println(str);
        System.out.println(str.hashCode());
        str = "Good";
        System.out.println(str);
        System.out.println(str.hashCode());
        str = "Very";
        System.out.println(str);
        System.out.println(str.hashCode());

        System.out.println("-------------------------------------------");

        String str1 = new String("NEW");
        System.out.println(str1);
        System.out.println(str1.hashCode());
        str1 = "string";
        System.out.println(str1);
        System.out.println(str1.hashCode());
        str1 = new String("NEW") ; // Here you said it will create new Obeject rather pointing to same exiting value in Pool
        System.out.println(str1);
        System.out.println(str1.hashCode());

    }

}
