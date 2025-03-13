package CORE_JAVA.JAVA2_Strings;

public class Lab6_String3 {
    public static void main(String[] args) {
        String s1 = "Very";
        System.out.println(s1);
        System.out.println(s1.hashCode());

        String s2 = new String("Very");
        System.out.println(s2);
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
