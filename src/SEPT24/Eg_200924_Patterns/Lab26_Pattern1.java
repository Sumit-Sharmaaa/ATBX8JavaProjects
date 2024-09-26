package SEPT24.Eg_200924_Patterns;

import java.util.Scanner;

public class Lab26_Pattern1 {
    public static void main(String[] args) {
        /*
        1
        12
        123
        1234
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int n = sc.nextInt();

        for(int i = 1;i<=n ; i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
