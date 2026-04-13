import java.util.*;
public class R3
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
double b= sc.nextDouble();
int exp= sc.nextInt();
double result= power(b,exp);
System.out.print("power value ="+result);
}
public static double power(double base,int exp)
{
if (exp==0)
{
 return 1;
}
else
{
return base*power(base,exp-1);
}
}
}
