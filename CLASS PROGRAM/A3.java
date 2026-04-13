import java.util.*;
public class A3
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
int arr[]=new int[5];
System.out.println();
int c=0; int d=0;
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt(" enter the second no"+i);
c= c+arr[i];
 d=d++;
}
System.out.println(Arrays.toString(arr));
System.out.println("Sum of arrry is : "+c);
 d=c/arr.length;

System.out.println("average value is: "+d);
}
}