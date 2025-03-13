package CORE_JAVA.JAVA15_AccessModifiers.Police;

public class Cop {

    protected int gun;  //  should be protected so that it can be used by both cop and JrCop being in Same package

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot() { //  should be protected so that it can be used by both cop and JrCop
        System.out.println("Yes, You can Shoot!!!");
    }

}









