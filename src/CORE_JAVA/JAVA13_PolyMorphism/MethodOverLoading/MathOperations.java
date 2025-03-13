package CORE_JAVA.JAVA13_PolyMorphism.MethodOverLoading;

public class MathOperations {
    int add (int a, int b)
    {
        return a+b;
    }

    String add(String a, String b) // Function/Method with same name but diff signatures
                                    // Overloaded Function
    {
        return a+b;
    }

    String add(String a, int b)
    {
        return a+b;
    }
}
