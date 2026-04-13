//check whether the no is a even or odd
import java.util.*;
class Classname1{

	 String EvenorOdd(int n){
	
	if(n%2==0)
{
return "even";
}
else
{
return "odd";
}
}
}
public class Classname{

public static void main(String a[])
{
Scanner sc =new Scanner(System.in);
int n =sc.nextInt();
Classname1 obj = new Classname1();
String g=obj.EvenorOdd(n);

System.out.println(g);
}

}