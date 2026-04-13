//Wap to calculate no is armstrong or not:
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        int temp = num;
        int digits = 0;

        while (temp != 0) {
            digits++;
            temp =temp/10;
        }

        while (num != 0) {
            int remainder = num % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power =power*remainder;
            }
            sum =sum+power;
            num = num/10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        sc.close();
    }
}
