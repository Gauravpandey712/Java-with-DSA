//FACTORIAL USING RECURRSION
import java.util.*;
public class R1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print(" enter the number to find factorial:");
int  num = sc.nextInt();

int f = fact(num);
System.out.println(" factorial:"+f);

}
public static int fact(int n)
{
if(n==0 || n==1)
{
return 1;
}
 return n*fact(n - 1);
}
}