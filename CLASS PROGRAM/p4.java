// WAP to print a student data using user input
import java.util.Scanner;
class p4
{
  public static void main(String[] args)
  {
Scanner sc= new Scanner(System.in);
System.out.println("Enter student name :");
String name = sc.nextLine();

System.out.println("Enter student AGE :");
int age = sc.nextInt();

sc.nextLine();
System.out.println("Enter student course :");
String course = sc.nextLine();

System.out.println("Enter student fees :");
int fees = sc.nextInt();


System.out.println("Enter student section :");
 char section = sc.next().charAt(0);

System.out.println("Student  is present (true/false) :");
boolean ispresent = sc.nextBoolean();

System.out.println("Enter student name :"+name);
System.out.println("Enter student AGe:"+age);
System.out.println("Enter student course :"+course);
System.out.println("Enter student fees:"+fees);
System.out.println("Enter student section :"+section);
System.out.println("student is present  :"+ispresent);

  }
}
