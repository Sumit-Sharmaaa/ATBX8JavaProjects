package CORE_JAVA.JAVA24_Exception_Handling;

public class Lab91_CommandLineInterface {
    public static void main(String[] args) {
        /*
* Another way to take user input other than Scanner --> Command Line Interface (CLI), below are the steps
-->Go to three dots-->Configuration-->Edit-->Application-->Select Name,Class
-->Pass Arguments(String array)-->becoz of String args[] in main function seperated by spaces-->Apply->Ok
* This is Called Passing Arguments using Command Line
         */

        System.out.println("Start of the Program");
        String commandLineInput1 = args[0]; // args[0]= 10, args is argument of main function
        String commandLineInput2= args[1]; // 11
        String commandLineInput3 = args[2]; // 12
        String commandLineInput4 = args[3];//  No value given in CLI

        // commented values are given using CLI as a string separated by spaces but 4th value is not given

        System.out.println(commandLineInput1);
        System.out.println(commandLineInput2);
        System.out.println(commandLineInput3);
        System.out.println(commandLineInput4);   // Exception: Index 3 out of bounds for length 3

/*
Object Class(Parent)-->Throwable Class(child)-->Exception(Checked & Unchecked) & Error Class(Child)

Exceptions:-
1). An exception is an event that occurs during execution of the program that disrupts the
    normal flow of Instructions.
2). Exceptions can be handled in java by using Try and Catch blocks or using throws.
3). Exceptions are of two types - Checked(CompileTime) & UnChecked Exceptions(RunTime)
--> checked are checked by JVM at complite Time and Unchecked are checked during RunTime.
4). Examples - ArrayIndexOutOfBounds,ArithmeticException etc.

Errors:-
1). An error is the event in a program which disrupts the normal Flow.
2). Can't be handled in java by JVM.
3). Example OutOfMemory error, stackOverflow etc.

 */






    }
}
