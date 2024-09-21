package Eg_200924_Patterns;

import java.util.Scanner;

public class Lab34_Pattern9 {
    /*
            4321
            4321
            4321
            4321
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Rows");
        int rows = sc.nextInt();

        for(int i =1;i<=rows;i++)
        {
            for(int j=rows;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
