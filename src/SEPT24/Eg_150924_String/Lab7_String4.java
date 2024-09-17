package SEPT24.Eg_150924_String;

public class Lab7_String4 {
    public static void main(String[] args) {
        String s1 = "Sumit";
        String s2 = "Sumit";
        System.out.println(s1==s2);// True -> in SCP equal contents references will also be same.
        System.out.println(s1.equals(s2));

        System.out.println("\n-----------------\n");
        String s3 = new String("Sharma");
        String s4 = new String("Sharma");
        System.out.println(s3==s4); // False -> In OA even equal contents will not be having same references.
        System.out.println(s3.equals(s4));
    }
}
