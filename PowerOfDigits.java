import java.util.Scanner;
public class PowerOfDigits{
    public static void main(String args[]){
        Scanner powerofdigits =new Scanner(System.in);
        System.out.print("Enter the base number=");
        long base=powerofdigits.nextLong();
        System.out.print("Enter the exponent number=");
        long exponent=powerofdigits.nextLong();
        System.out.print("The result of the power ="+ Math.pow(base,exponent));
    }
}
