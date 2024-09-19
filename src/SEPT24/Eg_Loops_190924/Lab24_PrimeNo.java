package SEPT24.Eg_Loops_190924;

import java.util.Scanner;

public class Lab24_PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No till when you want to print Prime No's");
        int primeNoTill = sc.nextInt();

        System.out.printf("Prime No's b/w 1 to %d are :",primeNoTill);
        System.out.println();

        for (int i = 2 ; i<=primeNoTill ; i++)
        {
            int flag = 0;
          for (int j =2 ; j<=i/2 ; j++)
          {
              if(i==2)
              {
               break;
              }
              if ((i%j)==0)
              {
                  flag=1;
                  break;
              }
          }
          if (flag==0)
          {
              System.out.println(i);
          }

        }


    }
}
