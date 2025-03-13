package CORE_JAVA.JAVA21_ENUM;

import java.awt.*;

public class Lab86_Enum_UseCase {
    public static void main(String[] args) {
        System.out.println(color.RED.getHexcode());
        System.out.println(color.BLUE.getHexcode());
        System.out.println(color.GREEN.getHexcode());

        if(color.BLUE.getHexcode()=="#3377FF"){
            System.out.println("Color is Blue");
        }
    }
}

enum  color{
    RED("#FF0000"),            // way to initialise using constructor in Enum
    GREEN("#61FF33"),
    BLUE("#3377FF");

    private String hexcode;

    color(String hexcode) {             // Constructor
        this.hexcode = hexcode;
    }

    public String getHexcode() {
        return hexcode;
    }

    public void setHexcode(String hexcode) {
        this.hexcode = hexcode;
    }
}
