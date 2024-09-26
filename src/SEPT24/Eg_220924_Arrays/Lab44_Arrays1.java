package SEPT24.Eg_220924_Arrays;

public class Lab44_Arrays1 {
    public static void main(String[] args) {
        int arr[]= {10,20,30,40};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr.length);

        int arr2[]= new int[4]; // Good way to initialise
        arr2[0]= 10;
        arr2[1]=20;
        arr2[2]=30;
        arr2[3]=40;
        System.out.println(arr2); // returns address of arr2
        System.out.println(arr2[1]); // returns 2nd value of arr2
    }
}
