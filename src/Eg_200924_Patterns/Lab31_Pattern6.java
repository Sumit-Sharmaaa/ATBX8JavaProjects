package Eg_200924_Patterns;

import java.util.Scanner;

public class Lab31_Pattern6 {
    /*
                 1
                121
               12321
              1234321
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows = sc.nextInt();

        for (int i=1;i<=rows;i++)
        {
            for(int j=0;j<rows-i;j++)
            {
                System.out.print(" ");
            }
                for (int k = 1; k <= i; k++)
                {
                    System.out.print(k);
                }

                for(int m=i-1;m>0;m--)
                {
                    System.out.print(m);
                }

            System.out.println();
            }

        }
    }

