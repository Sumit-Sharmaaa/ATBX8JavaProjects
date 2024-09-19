package SEPT24.Eg_Loops_190924;

import java.util.Scanner;

public class Lab25_FistBuzz {
    public static void main(String[] args) {
        // program to print the no's b/w 1 to 100
        // print Fizz for the multiples of 3
        // print 5 for the multiple of 5
        // print fizzBuzz for the multiple of both

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int num = sc.nextInt();

        for(int i=1 ; i<num ; i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
                continue;
            }
           else if(i%3==0)
            {
                System.out.println("Fizz");
                continue;
            }
           else if (i%5==0) {
                System.out.println("Buzz");
                continue;
            }
            else
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
