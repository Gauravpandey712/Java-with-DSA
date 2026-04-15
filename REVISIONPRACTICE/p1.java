import java.util.Scanner;

public class p1 
 {
  public static void main(String[] args) 
 {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the value of farenheit");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);
        sc.close();
  }
}