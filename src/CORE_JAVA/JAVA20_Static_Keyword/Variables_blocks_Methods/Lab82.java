package CORE_JAVA.JAVA20_Static_Keyword.Variables_blocks_Methods;

public class Lab82 {
    public static void main(String[] args) {
        student s1= new student(18);
        student s2 = new student(20);

        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(student.school_name);// classname can be used in case of static
        System.out.println(s1.school_name);
        System.out.println(s2.school_name);

        student.school_name="XYZ";
        System.out.println(student.school_name);
        System.out.println(s1.school_name);


    }
}
class student{
    int age;
    static String school_name="ABC";

    public student(int age) {
        this.age = age;
    }
}
