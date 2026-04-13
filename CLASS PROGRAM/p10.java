
//WAp to check that given no is postive ,negative or zero
import java.util.Scanner;
class p10
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number:-");
int n= sc.nextInt();
if(n > 0)
{
System.out.println(n+" is postive.");
}
else if(n<0)
{
System.out.println(n+"is negative");
}
else
{
System.out.println(n+"is zero");
}
}
}

