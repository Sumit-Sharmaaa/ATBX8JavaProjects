package SEPT24.Eg_220924_Arrays;

public class Lab45_Array2 {
    public static void main(String[] args) {
        final int a = 10;
      //  a=20; // Not possible in case of Primitive Datatype as a is final.
        System.out.println(a);

        final int[] arr = new int[5]; // here final is only for the size i.e. size of array is final.
        // arr ={0,0,0,0,0}
        arr[2]=3;
        System.out.println(arr[2]);
        arr[2]=5;
        System.out.println(arr[2]);



    }
}
