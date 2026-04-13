//WAP TO FIND THE SIMPLE INTEREST 
import java.util.*;

public class p8
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the principal balance");
int p = sc.nextInt();
System.out.println("Enter the rate:=");
int r = sc.nextInt();
System.out.println("enter the  time:=");
int t = sc.nextInt();
int a = (1+(r*t));
System.out.println("Simple interest :="+a);
}
}