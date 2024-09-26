package SEPT24.Eg_250924_2D_Arrays;

import java.util.Scanner;

public class Lab50_Max_2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the no of Columns");
        int columns = sc.nextInt();
        int[][] arr_2d = new int[rows][columns];
        System.out.println("Enter the elements");
        int max=Integer.MIN_VALUE;
        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr_2d[i][j]=sc.nextInt();
            }
        }
        for(int m=0;m<rows;m++)
        {
            for(int n=0;n<columns;n++)
            {
                if (max <= arr_2d[m][n])
                {
                    max = arr_2d[m][n];
                }
            }
            System.out.println();
        }
        System.out.println(max);
    }
}
