package SEPT24.Eg_160924_Math.Class;

public class Lab12_mathClass1 {
    public static void main(String[] args) {
        int x = 10;
        double y = 12.4; //12.4
        double z = 56.78; //56.78

        Double result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);

    }
}
