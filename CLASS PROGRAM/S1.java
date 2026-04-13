import java.util.*;
public class S1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String a= new String("Gaurav pandey");// or =>(String a="Gauravpandey";)

System.out.println("differance betwwen nextLline and next");
String name =sc.nextLine();
System.out.println("nextLline"+a);
String a= sc.next();
System.out.println(" next"+a);
}
}