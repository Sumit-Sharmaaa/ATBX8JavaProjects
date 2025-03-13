package CORE_JAVA.JAVA20_Static_Keyword.Variables_blocks_Methods;

public class Lab84_Static_Methods_n_variables {
    public static void main(String[] args) {
        ATB s1= new ATB("Sumit");
        ATB s2 = new ATB("Amit");
        ATB s3;
        new ATB("Pramod");

        s1.readDocuments(); // Non-static called with object name
        s2.readDocuments();
        ATB.doAssignment(); // Static Method called with directly class Name


    }
}

class ATB{
    {
        System.out.println("IIB");
        // to write code to start a website
        System.out.println("Reading a CSV File");
    }
    static{
        System.out.println("Load the class i will execute");
    }

    private String name;
    private String phone;
    private static String courseName = "ATB8X";       // same course for all

    public ATB(String name) {                         // Constructor
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void readDocuments(){
        System.out.println("Non-Static Method");
    }

    static void doAssignment(){
        System.out.println("Do Assignment- Static Method");
        // System.out.println(phone); // Not possible being non static
    }
}

