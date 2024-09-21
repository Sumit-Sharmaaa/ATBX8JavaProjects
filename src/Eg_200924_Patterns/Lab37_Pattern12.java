package Eg_200924_Patterns;

import java.util.Scanner;

public class Lab37_Pattern12 {
    /*
            A
            BC
            CDE
            DEF
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows = sc.nextInt();

        for(int i=1;i<=rows;i++)
        {   char ch='A';
            ch= (char)(ch+i-1);
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
