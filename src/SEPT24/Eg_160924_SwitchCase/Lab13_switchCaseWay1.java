package SEPT24.Eg_160924_SwitchCase;

import java.util.Scanner;

public class Lab13_switchCaseWay1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number b/w 1-7");
        int day = sc.nextInt();

        switch (day){
            default:
                System.out.println("Wrong No Entered, Enter No b/w 1-7");
                break;
            case 1 :
                System.out.println("Day is Monday");
                break;
            case 2 :
                System.out.println("Day is Tuesday");
                break;
            case 3 :
                System.out.println("Day is Wednesday");
                break;
            case 4 :
                System.out.println("Day is Thursday");
            case 5 :
                System.out.println("Day is Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
        }

    }
}
