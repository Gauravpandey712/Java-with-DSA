import java.util.Scanner;
class p7{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no:A");
int a= sc.nextInt();

System.out.println("enter the no 2:");
int b= sc.nextInt();

System.out.println("before swapping A="+a+" b="+b);

int temp;
temp=a;
a=b;
b=temp;

System.out.println("after swapping A="+a+" b="+b);
}
}