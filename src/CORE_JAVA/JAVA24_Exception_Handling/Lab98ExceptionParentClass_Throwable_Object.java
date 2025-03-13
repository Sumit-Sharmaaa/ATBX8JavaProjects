package CORE_JAVA.JAVA24_Exception_Handling;

public class Lab98ExceptionParentClass_Throwable_Object {
    public static void main(String[] args) {
        int b=0;
        try{
            String inp = args[0]; // arrayIndexOutOfBoundError
            int a = Integer.parseInt(inp); // NumberFormatException-->if character or character string is given in CLI
            int c =1000/b;  // ArithmeticException
        }
        catch (Exception e){
            System.out.println(e);
        }

//        catch (Throwable e){  // Also possible --> parent of Exception and Error Class
//            System.out.println(e.getMessage());
//        }


//        catch(Object e){  // Not Possible
//            System.out.println(e.getMessage());
//        }
    }
}
