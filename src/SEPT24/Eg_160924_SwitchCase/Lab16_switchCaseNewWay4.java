package SEPT24.Eg_160924_SwitchCase;

public class Lab16_switchCaseNewWay4 {
    public static void main(String[] args) {
        // We can also arrow sign -> , Here there is no need of break statement.

        int itemCode = 001;

        switch (itemCode){
            case 001,002 -> System.out.println("It's an Electronic Gadget");
            case 003 -> System.out.println("It's a Toy");
        }
    }
}
