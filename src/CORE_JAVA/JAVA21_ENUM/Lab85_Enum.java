package CORE_JAVA.JAVA21_ENUM;

/*
ENUM -
--------
* ENUM stands for Enumerations, are a special data types in Java
* allows us to define a collection of named constants i.e. used as a constant.
* No need to create objects of Enum.
* Looks like class only it have getter , setter and constructors
   */

public class Lab85_Enum {

    public static void main(String[] args) {
        System.out.println(Day.SATURDAY);
    }


enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

}
