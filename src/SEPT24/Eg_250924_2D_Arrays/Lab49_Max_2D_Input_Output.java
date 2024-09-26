package SEPT24.Eg_250924_2D_Arrays;

import java.util.Scanner;

public class Lab49_Max_2D_Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the no of Columns");
        int columns = sc.nextInt();
        int[][] arr_2d = new int[rows][columns];
        System.out.println("Enter the elements");
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
                System.out.print(arr_2d[m][n]);
            }
            System.out.println();
        }

    }
}
