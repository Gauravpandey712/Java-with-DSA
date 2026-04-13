//wap check that  no is even or odd 
import java.util.Scanner;
class p12{

public static void main(String[] args){

Scanner sc= new Scanner(System.in);
int num = sc.nextInt();

String result = (num%2==0)?(num+"is an even no ):(num+"is an odd no");
System.out.println(result);
}

 }