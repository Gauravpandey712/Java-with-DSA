//WAP to find all prime no in given series
import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("give the starting of the series:=");
        int start = sc.nextInt();
	System.out.print("give the ending of the series:=");
        int end = sc.nextInt();
        prime(start, end);
       
    }

    public static void prime(int start, int end) {
        for (int num = start; num <= end; num++) {
            boolean prime = true;
            for (int i = 2; i <= num / 2; i++) 
            {
                if (num % i == 0) 
		{
                    prime = false;
                    break;
                }
            }
            if (prime && num > 1) 
		{
                System.out.println(num);
                }
           }
    }
}
