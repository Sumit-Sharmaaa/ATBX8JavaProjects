package CORE_JAVA.JAVA15_AccessModifiers.Thief;

import CORE_JAVA.JAVA15_AccessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {

        Cop c = new Cop(10);
        //System.out.println(c.gun);  // shouldn't be allowed to use gun or shoot method
        //c.canIShoot();              // so should be protected or private

    }
}
