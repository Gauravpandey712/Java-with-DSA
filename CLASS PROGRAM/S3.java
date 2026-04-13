import java.util.*;
public class S3
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the string you want to count:-");
String n=sc.nextLine();
int length=n.length();
int constt = 0;
int vowel = 0;
for(int i=0;i<length; i++)
{
if(n.charAt(i) == 'a'|| n.charAt(i) =='A'||
n.charAt(i) == 'e' || n.charAt(i) =='E'||
n.charAt(i) == 'i' || n.charAt(i) =='I'||
n.charAt(i) == 'o' || n.charAt(i) =='O'||
n.charAt(i) == 'u' || n.charAt(i) =='U')
{
vowel = vowel+1;
}
else
{
constt = constt+1;
}
}
System.out.println("constant:"+constt+"vowel:"+vowel);
}
}