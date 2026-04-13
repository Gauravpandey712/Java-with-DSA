import java.util.*;
class ArmstrongNumber
{
String method(int n)
{
int a = 0;
int b = 0;
int k = 0;
k=n;
while(n!=0)
{
a= n%10;
b=(a*a*a)+b;
n=n/10;
}
if(k==b)
{
return "Armstrong";
}
else
{
return "Not Armstrong";
}
}
public static void main(String[] args)
{



Scanner sc = new Scanner(System.in);
int n =sc.nextInt();
ArmstrongNumber obj =new ArmstrongNumber();
String g=obj.method(n);
System.out.println(g);
}
}