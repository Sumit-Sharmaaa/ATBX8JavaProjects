package CORE_JAVA.JAVA13_PolyMorphism.MethodOverLoading;

public class Lab68_MainRunnerClass {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
         int result = m.add(10,20);
        System.out.println(result);

        String name = m.add("sumit"," sharma");
        System.out.println(name);

        String sum = m.add("Sumit ",10);
        System.out.println(sum);

    }
}
