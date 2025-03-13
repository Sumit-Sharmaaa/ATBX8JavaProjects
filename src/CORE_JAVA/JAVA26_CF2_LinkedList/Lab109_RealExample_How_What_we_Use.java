package CORE_JAVA.JAVA26_CF2_LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Lab109_RealExample_How_What_we_Use {
// to string function is overridden in student class which helps in printing objects in good manner

    public static void main(String[] args) {
        Student s1 = new Student("Sumit",10);
        Student s2 = new Student("Udit",20);
        Student s3 = new Student("Neha",15);

        List<Student> myStudents = new ArrayList<Student>();

        System.out.println(s1);
        System.out.println(myStudents); // empty
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);
        System.out.println(myStudents); // because of toString() fxn


    }
}

class Student{
    String name;
    int roll_no;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    @Override
    public String toString() { // will print details automatically
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}
