package CORE_JAVA.JAVA20_Static_Keyword;

public class A_Static_Intro {
 /*
 Static can be variables, Block, Class and Methods.
 Used for Memory Management

 ----*** Static Variables***-------
 * are loaded at class level (during class loading) and shares same value across all objects.
 * Used when using same value for all objects eg- School name for all students in vivekanand school.
 ___________________________________________________________________________________________________________

 ----*** Static Block ***----
 IIB,SIB --> Explained below and in SIBvsIIB package

 __________________________________________________________________________________________________________

 ----*** Static Methods ***---- -
 * Static Methods are called when class gets loaded.
 * Used when u want to run a method during class loading Eg open browser or Website .
 * Static Methods cannot have non-static or instance variables as instance variables are created during object
   creation, but static method runs even before it i.e. during class loading.
 * Whereas, Non-static Methods can have static variables.

 _____________________________________________________________________________________________________________

 ----*** Static Class ***---- (Not used very much in Automation 1%)



* IIB --> Instance Initialisation block

 {
        sout("IIB Block- Gets called when objects are created.For eg - 2 objects created then,
        it will run two times ");
 }

 * SIB --> static Initialisation Block

 static {
       sout("SIB Block --> Runs only one time when class gets loaded");
 }

 * Important:-

 Student s1 = new Student(23);

 Here through Student , Student class gets Loaded.
 Here through new Student(23); --> Object gets created

 What gets called when class gets loaded :-
 * Student (class Loading) --> SIB --> static variable

 What gets called when object gets created :-
  --> IIB --> Instance variable

  */

}
