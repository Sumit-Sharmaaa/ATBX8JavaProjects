package CORE_JAVA.JAVA15_AccessModifiers.Police;

public class Lab73_JrCop_Main {
    public static void main(String[] args) {
        Cop jCop = new Cop(20);

        System.out.println(jCop.gun);
        jCop.canIShoot();

    }
}
