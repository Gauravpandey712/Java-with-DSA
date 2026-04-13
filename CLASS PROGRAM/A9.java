import java.util.*;
public class A9
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int arr1[][]=new int[3][3];

System.out.println("Give first array element");
for(int i=0; i<arr1.length;i++)
{
for(int j=0; j<arr1[i].length;j++)
{

arr1[i][j]=sc.nextInt();
}
}
int arr2[][]=new int[3][3];
System.out.println("Give second array element");
for(int i=0; i<arr2.length;i++)
{
for(int j=0; j<arr2[i].length;j++)
{

arr2[i][j]=sc.nextInt();
}
}
System.out.println("first Aray element");
for(int a2[] : arr1)
{
for(int n:a2)
{
System.out.print(n+" ");
}
System.out.println();
}
System.out.println("Second Array element");
for(int a1[] : arr2)
{
for(int n:a1)
{
System.out.print(n+" ");
}
System.out.println();
}
int mult[][]=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0; j<3;j++)
{
for(int k=0; k<3;k++)
{
mult[i][j]=mult[i][j]+arr1[i][k]*arr2[k][j];
}
}
}
System.out.println("final multiplied matrix :");
for(int mlt[] : mult)
{
for(int n:mlt)
{
System.out.print(n+" ");
}
System.out.println();
}
}
}