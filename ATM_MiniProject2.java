import java.util.Scanner;
class UserAccount
{
    public static void main(String[] args) {
        
    Scanner userinput=new Scanner(System.in);
    System.out.print("Enter your name:");
    String name=userinput.next();
    System.out.print("Enter your bank pin number:");
    int pwd=userinput.nextInt();
    System.out.print("Re-Enter your pin:");
    int reenter=userinput.nextInt();
    if (name.isEmpty() || pwd==reenter)
{
    System.out.println("Welcome to our bank "+name);
}
else{
    System.out.println("Your name or pin may be wrong");

}
System.out.println("\t\t\t---------------WELCOME TO OUR JAVA BANK---------------");
    System.out.println("\t\t\t\t1.Deposit");
    System.out.println("\t\t\t\t2.Balance");
    int balance=200000;
    System.out.println("\t\t\t\t3.Withdraw");    
    System.out.println("\t\t\t\t4.Pin Change");
    System.out.print("Press Number To Choice Account Type:");
    int choice=userinput.nextInt();

switch (choice) {
    case 1:
        System.out.print("Enter to deposit:");
        int deposit=userinput.nextInt();
        balance= deposit+balance;
        System.out.println("You deposited: " + deposit);
        System.out.println("Your current balance: " + balance);
        break;
        case 2:
        System.out.print("Your Current Balance: "+balance);
        break;
        case 3:
        System.out.print("Enter to withdraw:");
        int withdraw=userinput.nextInt();
        if (balance>=withdraw) {
            balance=balance-withdraw; 
            System.out.println("Your Withdrawal= "+withdraw);
            System.out.println("Your Balance: "+balance);    
        }
        else{
            System.out.println("Money Not enough");
        }
        break;
        case 4:
        System.out.println("Enter Your oldest Pin: "+pwd);
        System.out.print("Enter New Pin:");
        int newpin=userinput.nextInt();
        if (pwd != newpin) {
            System.out.println("Your Pin is changed"); 
        }
        else{
            System.out.println("You enterd same pin try again");
        }
        break;
    default:
        System.out.println("Thanks For Visiting Our Bank "+name);
        break;

}
userinput.close();
}
}