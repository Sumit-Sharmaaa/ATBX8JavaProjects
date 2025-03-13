package CORE_JAVA.JAVA19_Interfaces.Problem_Statement;

public class PrintMyBook extends Book{

//    public PrintMyBook(String name, String author, int price) {
//        super(name, author, price);
//    }

    String name;
    String author;
    int price;


    public PrintMyBook(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    void getDetails() {
        System.out.println(name+", "+author+", 120 ");
    }
}
