package CORE_JAVA.JAVA19_Interfaces.Problem_Statement;

public class Lab81_MainRunnerClass {
    public static void main(String[] args) {
        PrintMyBook myBook = new PrintMyBook("Kitaab","Sumit",100); // can use dynamic dispatch because u cannot create object of abstract class like below :-
        // Book myBook1 = new PrintMyBook("Kitaab","Sumit",100);
        myBook.getDetails();
    }
}
