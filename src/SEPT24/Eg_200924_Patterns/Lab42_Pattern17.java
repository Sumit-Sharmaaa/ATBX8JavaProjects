package SEPT24.Eg_200924_Patterns;

import java.util.Scanner;

public class Lab42_Pattern17 {
    public static void main(String[] args) {
        /*          *
                   ***
                  *****
                 *******
                  *****
                   ***
                    *        */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of Rows");
        int rows= scanner.nextInt();
        int upperRows= (rows+1)/2;
        int lowerRows= (rows-1)/2;

        for(int i=1;i<=upperRows;i++)
        {
            for(int j=1;j<=upperRows-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int m=1;m<=lowerRows;m++)
        {
            for(int n=1;n<=m;n++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=(2*lowerRows)-(2*m)+1;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
