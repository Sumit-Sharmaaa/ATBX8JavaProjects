package SEPT24.SelfPractise_DailyOfficeChallenge;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int input = sc.nextInt();
        for (int i = 1; i<=input; i++)
        {
            for(int j =0 ; j<i; j++)
            {
                result = (i+j)%2;
                System.out.print(result);
            }
            System.out.println();
        }
    }
}
