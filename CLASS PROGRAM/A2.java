import java.util.*;
public class A2
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
int arr[]=new int[10];
System.out.println("Enter array element:-");

for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
System.out.println(Arrays.toString(arr));


}
}