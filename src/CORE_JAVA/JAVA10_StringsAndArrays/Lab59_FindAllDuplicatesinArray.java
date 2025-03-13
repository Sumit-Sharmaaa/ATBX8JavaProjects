package CORE_JAVA.JAVA10_StringsAndArrays;

import java.util.Scanner;

public class Lab59_FindAllDuplicatesinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the array Elements");

        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int flag=0;

        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag++;
                    System.out.println("Duplicate - "+arr[j]);
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("Doesn't contains any Duplicate");
        }
    }
}
