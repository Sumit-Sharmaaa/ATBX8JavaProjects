package Eg_200924_Patterns;

import java.util.Scanner;

public class Lab39_Pattern14 {
    /*
                    *
                   **
                  ***
                 ****
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Rows");
        int rows = sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for (int j=rows-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
