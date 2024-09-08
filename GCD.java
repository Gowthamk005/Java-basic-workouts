import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        int hcd=0;
        Scanner gcdScanner=new Scanner(System.in);
        System.out.println("---------------Finding The Two Factor Number Of GCD---------------");
        System.out.print("Enter The First Number:");
        int num1=gcdScanner.nextInt();
        System.out.print("Enter The First Number:");
        int num2=gcdScanner.nextInt();
        for(int i=1;i<=num1 && i<=num2;i++)
        {
            if(num1 % i == 0 && num2 % i == 0){
                hcd=i;
            }
        }
            System.out.println("The GCD:" + hcd);
            gcdScanner.close();        
    }
    
}
