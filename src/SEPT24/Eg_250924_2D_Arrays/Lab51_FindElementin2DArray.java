package SEPT24.Eg_250924_2D_Arrays;

import java.util.Scanner;

public class Lab51_FindElementin2DArray {
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

        System.out.println("Enter the element you want to find in 2d array");
        int findX = sc.nextInt();
        int found=0;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(array_2d[i][j] == findX)
                {
                    found = 1;
                    rows=i;
                    columns=j;
                    break;
                }
            }
        }
        if(found ==1)
        {
            System.out.printf("Element is present at Index- {%d,%d} ",rows,columns);
        }
        else
            System.out.println("Element is not present in the array");
    }
}
