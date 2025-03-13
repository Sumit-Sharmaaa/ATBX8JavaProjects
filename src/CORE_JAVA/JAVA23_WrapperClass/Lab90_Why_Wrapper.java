package CORE_JAVA.JAVA23_WrapperClass;

public class Lab90_Why_Wrapper {
    public static void main(String[] args) {
        String num ="10";
//        int a =num; // Non primitive datatype cannot be converted to primitive
       // else we can use below method
       Integer a= Integer.valueOf(num) ; // Conversion of integer into Integer wrapper
        int a2= a;

        // String to primitive
        int a3 = Integer.parseInt(num);



    }
}
