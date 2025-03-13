package CORE_JAVA.JAVA17_Abstraction;

public class JAVA17_Abstraction {
/*
-Abstraction - Hiding the implementation.( function ko initialize krenge define inherited class m krenge)
-You hide the complete class( with data members + methods).
-Abstraction can be achieved by two ways:-
    i). Abstract Class
    ii). Interfaces (pure abstraction).
1). A method without body is called abstract method.
2). When a class has abstract method in it then class must be abstract as well , but any class which is
abstract need not to must have an abstract method i.e. it can have both abstract & Concrete Methods.
3). If a class inherits an abstract class then it must define/implement all the abstract methods
of its parent abstract class.
4). Object of Abstract class cannot be instantiated.
5).  Abstract method in an abstract class are meant to be overridden in derived concrete class(otherwise - compilation error )
6). Abstraction is used for Security.
7). Abstraction using abstract class can achieve 0-100% abstraction( incomplete) .
8). Abstract class can have Constructors.


Other Points-
i). Abstract is the keyword
ii). Abstract can be a class or a Method
iii). means--> Incomplete
iv). If a class doesn't have Abstract Method then its called Concrete Class.
v). Abstract class cannot be final
vi). Abstract Methods cannot use Modifiers like-Private,static,final,strictfp,synchronized,native etc.
 */

}

abstract class Loan{
    abstract void loan50k();  // Incomplete Function
    // if method is abstract then class must be abstract class only but vice versa is not true.
}



class Person{
    //Concrete Class
}

class Student1{
    //Concrete class
}

class Student2{
    //concrete class
}
