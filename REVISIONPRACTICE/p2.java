// WAP to calculate phone bill
import java.util.Scanner;
//phonr bill code for calculating the bill 
public class p2
   {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("give the minutes person talked:=");
        int minutes = sc.nextInt();
        double bill = 0;
        
        if (minutes <= 50) {
            bill = 0;
        } else if (minutes <= 150) {
            bill = (minutes - 50) * 1;
        } else {
            bill = 100 + (minutes - 150) * 2;
        }
        
        System.out.println(bill);
       
    }
}