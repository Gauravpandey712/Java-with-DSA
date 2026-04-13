import java.util.*;
class primeno
{
String method(int n)
{
if(n==0 || n==1)
{
return "not prime";
}



for (int i=2;i<n;i++)
{
  if(n%i==0)
{
return "not prime";
}

}
return "prime";

}
   public static void main(String a[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
primeno obj = new primeno();

String g = obj.method(n);

System.out.println(g);



}
}  
