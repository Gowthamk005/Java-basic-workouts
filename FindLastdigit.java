import java.util.Scanner;

public class FindLastdigit {
    public static void main(String[] args) {
        Scanner you=new Scanner(System.in);
        System.out.println("Enter Numbers");
        int count=you.nextInt();
        int num[]=new int[count];
        System.out.println("Enter "+count +" Numbers");
        for(int i=0;i<count;i++)
        {
            num[i]=you.nextInt();
        } 
        for(int i=0;i<count;i++)
        {
            int lastdigit =Math.abs(num[i])%10;
            System.out.printf("The Last Digit Number%d=%d\n",num[i],lastdigit);

        }

        you.close();   
    }
    
}
