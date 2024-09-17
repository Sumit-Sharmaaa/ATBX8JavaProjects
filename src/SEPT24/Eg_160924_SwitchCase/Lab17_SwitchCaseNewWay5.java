package SEPT24.Eg_160924_SwitchCase;

import java.util.Scanner;

public class Lab17_SwitchCaseNewWay5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char code = sc.next().charAt(0);
        int val = switch(code) {
            case 'A':
                yield 65;
            case 'B':
                yield 66;
            default:
                System.out.println("Not able to find");
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
}
