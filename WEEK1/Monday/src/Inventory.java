import java.util.Scanner;

public class Inventory{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("please fill in number of bankoes:");
        int bankoe = scan.nextInt();

        System.out.println("Balance:" + " " + bankoe);

        System.out.print("What would you consider rich:");
        int threshold = scan.nextInt();

        String stat_balance;
        

        if (bankoe > threshold){
            stat_balance = "Rich";
        }
            
        else {
            stat_balance = "Poor";
        }
            
        System.out.println("Current status:" + " " + stat_balance);

        String reaction = scan.next();
        System.out.println("User says:" + " " + reaction);
        
    
    }
}
