import java.util.*;
class NoisPostiveNegativeorZero{

  String method(int n)
{
if(n<0)
{
return "negative";
}
else if(n>0)
{
return  "postive";

}
else
{
return "zero"; 
}
}
public static void main(String a[])
{
Scanner sc = new Scanner(System.in);
int  n= sc.nextInt();
NoisPostiveNegativeorZero obj = new NoisPostiveNegativeorZero();

String g = obj.method(n);
System.out.println(g);



}
}




