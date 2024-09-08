import java.util.Scanner;
public class ReverseNumbers {
    public static void main(String[] args) {
        long reverse=0;
        Scanner you=new Scanner(System.in);
        System.out.println("------------REVERSE A NUMBER--------------");
        System.out.print("Enter number to reverse=");
        long num=you.nextLong();
        while (num>0) {
            long lastDigit=num%10;
            num=num/10;
            reverse=reverse*10+lastDigit;
        }
        System.out.println(reverse);
        you.close();
    }
    
}
