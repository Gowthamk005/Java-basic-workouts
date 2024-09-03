import java.util.Scanner;
import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner me=new Scanner(System.in);
        System.out.printf("Enter the number of rage=");
        int sizes =me.nextInt();
        int number[]=new int[sizes];
        System.out.printf("Enter " + sizes + " Numbers=");
        for(int i=0;i<sizes;i++)
        {
            number[i]=me.nextInt();
        
        if(number[i]%2==0){
              System.out.printf("%d is  even number\n",number[i]);
        }
        else{
             System.out.printf("%d is odd number\n",number[i]);
        }
    }
}
}
