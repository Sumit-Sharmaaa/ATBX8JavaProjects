package CORE_JAVA.JAVA24_Exception_Handling.CustomException;

public class Lab99_CustomException {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",200);
        Bank jp_morgan = new Bank("USD",50);

        System.out.println(sbi.add(icici));
        System.out.println(icici.add(jp_morgan));
        System.out.println(sbi.add(jp_morgan));
/*
                Throw                                                       Throws
* Throw is used to explicitly throw an Exception.           * Throws Keyword is used to declare/announce an exception
* Checked Exception cannot be propagated using throw only.  * Checked Exception can be propagated using throws.
* Throw is followed by an instance.(new Object created)     * Throws is followed by class.
* Throw is used Within the Method.                          * Throws is used with the Method Signature.
* You cannot throw multiple Exception                       * Can use multiple exceptions separated by commas.

*/

    }
}
