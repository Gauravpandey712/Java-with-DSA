//Wap   to check the no is prime or not:
 import java.util.Scanner;
 class p17
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

 System.out.println("write th starting no of series");
 int start = sc.nextInt(); 
System.out.println("write th ending no of series");
 int end = sc.nextInt(); 
for(int k=start;k<=end;k++)
{
 
 int count=0;
 for(int i=1;i<=k;i++)
{
if(k%i==0)
{
 count++;
}
}
if(count==2)
{
  System.out.println(k+ "prime");
}
else
{
  System.out.println(k+ "not prime");
}
}
}
}