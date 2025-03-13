package CORE_JAVA.JAVA24_Exception_Handling;

public class Lab92 {
    public static void main(String[] args) {
        System.out.println("Start of the Program");
        String a = args[0]; // if No input is given --> ArrayIndexOutOfBoundsException
        Integer num = Integer.parseInt(a); //  If non Integer input is given--> NumberFormatException
        int div = 1000/num; // if zero is given as input--> ArithmeticException

        System.out.println(div);


        String s1 =null;
        System.out.println(s1.trim()); // Null pointer exception

        System.out.println("End of the program");


/* How program flow will Run
1). JVM will gets initialised.
2). Created and Starts the main thread, main gets called
3). Collects the command line arguments -- eg: String[] args ={10}
4). Now control transfers from main thread to main method - Lab92.main()
5). When problem(Exception/Error) comes in main, if Exception is not hndled by the user then,
    it gets handled by JVM , and it throws the exception and terminates the program.

 */

    }
}
