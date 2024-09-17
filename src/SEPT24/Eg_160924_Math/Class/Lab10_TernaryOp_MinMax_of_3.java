package SEPT24.Eg_160924_Math.Class;

public class Lab10_TernaryOp_MinMax_of_3
{
    public static void main(String[] args) {
        int a = 10;
        int b =30;
        int c = 20;
        int Result = (a>b)?(a>c? a:c) : (b>c ? b:c) ;
        System.out.println(Result);
    }
}
