package CORE_JAVA.JAVA24_Exception_Handling;

public class Lab96_tryCatchFinally {
    public static void main(String[] args) {

        int a=0;
        try {
            int c= 10/a; // ArithmeticException
            System.out.println(c); // This line never gets executed, since after above exception the flow jumps to catch block
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            throw new ArithmeticException(); // we can also throw exception like this for red exception message, but throw should be last line in catch block
        }
        finally {
            System.out.println("I will always be executed"); //finally block always gets executed
            // we can only have one finally block in class
        }
    }
}
