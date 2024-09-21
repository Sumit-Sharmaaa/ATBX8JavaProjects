package Eg_200924_Patterns;

import java.util.Scanner;

public class Lab41_Pattern16 {
    /*
                ****    4444
                ***     333
                **      22
                *       1
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of Rows");
        int rows= sc.nextInt();
        for (int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows-i+1;j++)
            {
                System.out.print(rows-i+1);
            }
            System.out.println();
        }
    }
}
