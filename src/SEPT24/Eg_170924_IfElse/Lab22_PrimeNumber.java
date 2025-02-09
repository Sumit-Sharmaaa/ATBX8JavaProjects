package SEPT24.Eg_170924_IfElse;

import java.util.Scanner;

public class Lab22_PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no to check");
        int flag=0;
        int num = s.nextInt();
        for( int i=2 ; i<=Math.sqrt(num) ; i++)
        {
            if((num % i)==0)
            {
                System.out.println("No is not Prime");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("No is Prime" );
        }
        s.close();

    }

}
