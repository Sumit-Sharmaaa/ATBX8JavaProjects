package SEPT24.Eg_150924_String;

public class Lab4_String1 {
    public static void main(String[] args) {

        // Two Ways of Initializing String
        /*
        1). Direct Initialization (using Literals) - String s1 = "abc" ; --> Store Value in String Constant Pool
        2). Object Initialization ( Dynamic-using new Keyword) --> Stores value in Object Area
        3). Initialize Using NULL Values

        New operator is only used with Non-Primitive Datatypes

        No need to import java.lang.* ; to use Strings as it is By default present

         */

        String s1 = "Mr.SUMIT";
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(s1.toLowerCase().hashCode());
        System.out.println(s1);
        s1 = s1.toLowerCase();
        System.out.println(s1);
        s1 = "Mr.Sharma";
        System.out.println(s1);
        System.out.println(s1.hashCode());
        String s2=s1;
        System.out.println(s2);
        System.out.println(s2.hashCode());

        // Using New Keyword

        System.out.println("\n Using New Keyword \n");
        String s3 = new String("Mr.SUMIT"); // New operator is only used with Non-Primitive Datatypes
        System.out.println(s3);
        System.out.println(s3.hashCode());
        System.out.println(s3.toLowerCase().hashCode());
        System.out.println(s3);
        s3 = s3.toLowerCase();
        System.out.println(s3);
        s3 = "Mr.Sharma";
        System.out.println(s3);
        System.out.println(s3.hashCode());
        String s4=s3;
        System.out.println(s4);
        System.out.println(s4.hashCode());
        s3 = "Mr.Sumit";
        System.out.println(s3);

    }
}
