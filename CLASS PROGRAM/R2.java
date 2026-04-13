// program using factoial
import java.util.*;
public class R2
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter then no:"); 
int a=sc.nextInt();
int  n=num(a);
System.out.println("SUM:"+n); 
}
public static int num(int x)
{
if(x==0){
   return 0;
}
 return x+num(x-1);
}
}