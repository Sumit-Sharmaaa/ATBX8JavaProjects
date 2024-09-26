package SEPT24.Eg_200924_Patterns;

import java.util.Scanner;

public class Lab30_Pattern5 {
    public static void main(String[] args) {
        /*
                    *******
                     *****
                      ***
                       *
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of Rows");
        int rows = sc.nextInt();

        for(int i =1;i<=rows;i++)
        {
            for(int j=i-1;j>0;j--)
            {
                System.out.print(" ");
            }
            for (int k=(2*rows)-i;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
