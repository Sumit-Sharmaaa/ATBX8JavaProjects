package SEPT24.Eg_220924_Arrays;

import java.util.Scanner;

public class Lab47_Arrays4 {
    // WAP to double the input array and the print the doubled array.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr= new int[size];

        System.out.println("Enter the array Elements");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("The doubled array is below");

        for(int j=0;j<size;j++)
        {
            arr[j]= 2*arr[j];
            System.out.println(arr[j]);
        }

    }
}
