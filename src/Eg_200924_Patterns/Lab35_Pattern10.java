package Eg_200924_Patterns;

import java.util.Scanner;

public class Lab35_Pattern10 {
    /*
            1
            21
            321
            4321
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows = sc.nextInt();

        for (int i=1;i<=rows;i++)
        {
            int k =i;
            for (int j=1;j<=i;j++)
            {
                System.out.print(k);
                k--;
            }
            System.out.println();
        }
    }
}
