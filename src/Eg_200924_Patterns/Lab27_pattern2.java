package Eg_200924_Patterns;

import java.util.Scanner;

public class Lab27_pattern2 {
    public static void main(String[] args) {
        /*
        1
        23
        456
        78910
        12121314
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n = sc.nextInt();
        int counter = 1;
        int i =1;
        while(i<=n)
        {
            int j =1;
            while(j<=i)
            {
                System.out.print(counter);
                counter++;
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
