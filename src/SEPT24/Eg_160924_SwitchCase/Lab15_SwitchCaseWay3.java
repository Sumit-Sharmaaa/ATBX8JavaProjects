package SEPT24.Eg_160924_SwitchCase;

import java.util.Scanner;

public class Lab15_SwitchCaseWay3 {
    public static void main(String[] args) {
        // Write a program to check browser input and print the following output:-Starting the ____browser.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser Name");
        String browserName = sc.nextLine();
        browserName = browserName.toLowerCase();

        switch (browserName){
            case("chrome"):
                System.out.println("Starting the Chrome Browser");
                break;
            case("edge"):
                System.out.println("Starting the Edge Browser");
                break;
            case("firefox"):
                System.out.println("Starting the FireFox Browser");
                break;
            default:
                System.out.println("Not such Browser found");
                break;
            }
    sc.close();
        }

}
