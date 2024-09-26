package SEPT24.Eg_220924_Arrays;

import java.util.Scanner;

public class Lab48_Array5 {
    //Find the max Salary
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int max= Integer.MIN_VALUE;

        for (int i = 0;i<size ; i++)
        {
            System.out.printf("Enter the %d element of array",i);
            arr[i] = sc.nextInt();
        }
        for (int j=0;j<arr.length;j++)
        {
           if(arr[j]>=max)
           {
               max = arr[j];
           }

        }
        System.out.println("Maximum element is "+max);

    }
}
