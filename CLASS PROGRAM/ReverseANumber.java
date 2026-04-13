import java.util.*;
class ReverseANumber
{
	int method(int n)
	{
	int a=0;
        int b=0;
        int k=0;
		while(n!=0)
		{
		a=n%10;
		b=b*10+a;
                 n=n/10;
		}
	return b;
	}



public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n =sc.nextInt();
ReverseANumber obj= new ReverseANumber();
int g =obj.method(n);
System.out.println(g);
}
}