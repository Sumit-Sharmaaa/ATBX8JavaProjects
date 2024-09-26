package SEPT24.Eg_250924_2D_Arrays;

import java.util.Scanner;

public class Lab52_Transposeof2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows & Columns");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] array_2d = new int[rows][columns];

        System.out.println("Enter the array elements");

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                array_2d[i][j]= sc.nextInt() ;
            }
        }

        int arr2[][]=new int[rows][columns];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr2[i][j]= array_2d[j][i] ;
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.println(arr2[i][j]); ;
            }
        }

    }
}
