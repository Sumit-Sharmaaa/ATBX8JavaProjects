package Eg_200924_Patterns;

import java.util.Scanner;

public class Lab29_Pattern4 {
    public static void main(String[] args) {
        /*
                     *
                    ***
                   *****
                  *******
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Rows");
        int rows = sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=rows-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=((2*i)-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
