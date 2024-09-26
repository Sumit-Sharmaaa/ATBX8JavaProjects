package SEPT24.Eg_200924_Patterns;

import java.util.Scanner;

public class Lab38_Pattern13 {
    /*
            E
            DE
            CDE
            BCDE
            ABCDE
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Rows");
        int rows = sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            char ch= 'E';
            ch = (char)(ch-i+1);
            for (int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
