package CORE_JAVA.JAVA19_Interfaces.Problem_Statement;

public abstract class Book {
/*
 Book class which has an abstract method getDetails(), name, author, price.
 PrintMyBook Class that inherits from the Book Class.
 abstract
 Book myBook = new PrintMyBook("Harry Potter","J.K. Rowling","120")

 // Output:- "Harry Potter, J.K. Rowling, 100"
*/
//    String name;
//    String author;
//    int price;
    abstract void getDetails();

//    public Book(String name, String author, int price) {
//        this.name = name;
//        this.author = author;
//        this.price = price;
//    }
}
