package Eg_200924_Patterns;

import java.util.Scanner;

public class Lab28_Pattern3 {
    public static void main(String[] args) {
        /*
            1
           23
          456
         78910
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows= sc.nextInt();
        int counter=1;

        for(int i=1;i<=rows;i++)
        {
            for(int j=rows-i;j>=0;j--)
            {
                System.out.print(" ");

            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }

    }
}
