package Eg_200924_Patterns;

import java.util.Scanner;

public class Lab33_Pattern8 {
    /*
            A
            BB
            CCC
            DDDD
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Rows");
        int rows = sc.nextInt();
        char c = 'A';

        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }
}
