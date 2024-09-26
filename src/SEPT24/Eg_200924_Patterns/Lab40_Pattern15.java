package SEPT24.Eg_200924_Patterns;

import java.util.Scanner;

public class Lab40_Pattern15 {
    public static void main(String[] args) {
        /*
                        1
                       12
                      123
                     1234
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows = sc.nextInt();

        for(int i=1; i<=rows;i++)
        {
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
