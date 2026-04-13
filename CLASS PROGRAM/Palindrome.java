import java.util.*;// There are 5 ways to write the palindrome code .

class Palindrome
{
String method(int n)
{
int b=0;
int k=n;
while(n!=0)
{
int a = n%10;
b = b*10+a;
n = n /10;
}
if(k==b){
return "Palindrome";
}
else{
return "Not Palindrome";}
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
Palindrome obj = new Palindrome();
String g = obj.method(n);

System.out.println(g);

}
}