package CORE_JAVA.JAVA22_StringBuilder_n_StringBuffer;

public class Intro {
    public static void main(String[] args) {
/*
                -----****** STRINGS ******----------
Strings are Immutable.
Strings are Non-Primitive Datatype
Bunch of characters

Strings can be created using 2 methods:-
1). Assignment operator (=) --> gets created in String constant pool(JVM)-
When u create a string literal(=), the JVM checks the string constant pool to see if any identical string
is present there or not if there, then it returns the reference to that instance, else it creates a new one.
2). Using New operator --> Heap Area/Object Area --> JVM Objects.

                    -------****** String Buffer & String Builder ******--------
String Buffer:-
1). These classes are used to create mutable strings, i.e. original string will also change after manipulation.
2). They are designed for efficient string manipulation operations such as appending, inserting or deleting
characters from string.
3). StringBuffer methods are synchronized i.e. thread safe- making it safe for use in multithreaded environments
which means that multiple threads can access a stringbuffer instance without corrupting its state.
4). Slow process due to processing of one thread at a time.

String Builder:-
1). Also Mutable in nature
2). Not thread Safe , hence making it faster
3). Used more in Automation, being fast
 */



    }
}
