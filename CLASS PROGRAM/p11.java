//Wap a program to print seasin using month numbers:

import java.util.Scanner;
public class p11
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the month");
int  n=sc.nextInt();
switch(n)
{
case 1:
case 2:
case 11:
case 12:
	System.out.println("winter");
	break;
case 3:
case 4:
case 5:
case 6:
	System.out.println("summer");
	break;
case 7:
case 8:
case 9:
case 10:
	System.out.println("rainy");
	break;
default:
	System.out.println("invalid input");
}
}
}

  