import java.util.Scanner;
public class Count_digits_in_a_number {
    public static void main(String args[]){
        Scanner you=new Scanner(System.in);
        System.out.print("Enter Numbers:");
        long num=you.nextLong();
        long count=0;
        while (num>0) {
            num=num/10;
            count=count+1;
        }
        System.out.println("The Number of " + count + " digits");
        you.close();
    }
    
}
