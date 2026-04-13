import java.util.*;
public class A6
{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int arr[]=new int[5];

for(int i=0;i<arr.length;i++)
 {
  arr[i]=sc.nextInt();
}
 int secondlargest=arr[0];
 int largest=arr[0];
 for(int i=0;i<arr.length;i++)
 {
  if(largest<arr[i])
  {
    
   secondlargest = largest;
largest= arr[i];
  }
 else if(secondlargest < arr[i] && arr[i] != largest)
{
   secondlargest =arr[i];
}
 }
System.out.println("largest element: "+largest);
}
}