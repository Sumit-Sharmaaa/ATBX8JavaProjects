package SEPT24.Eg_220924_Arrays;

public class Lab46_Arrays3 {
    public static void main(String[] args) {
        /*          IMPORTANT
 In Strings:-
        1). == checks for the references of two strings
        2). .equals method calls string class equals method with compares the contents of 2 Strings
 In Arrays and other Non-primitive DT :-
        Both == and .equals method checks for references as .equals calls object class equals method
        which checks references.
         */

        String str1 = "SHARMA";
        String str2 = new String("SHARMA");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        String a = "SUMIT";
        String b = "SUMIT";
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println();


        int [] arr1= {1,2,3,4,5};
        int[] arr2= {1,2,3,4,5};

        System.out.println(arr1==arr2);
        System.out.println(arr1.equals(arr2));

    }
}
