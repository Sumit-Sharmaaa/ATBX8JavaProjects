package Eg_200924_Patterns;

import java.util.Scanner;

public class Lab36_Pattern11 {
    /*
                ABCD
                BCDE
                CDEF
                DEFG
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows = sc.nextInt();

        for (int i=0;i<rows;i++)
        {
            char ch = 'A';
            ch= (char)(ch+i);
            for(int j=1;j<=rows;j++)
            {
                System.out.print(ch);
                ch++;
            }
            ch='A';
            System.out.println();
        }
    }
}
