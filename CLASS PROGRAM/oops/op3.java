
public class op3
{
public static void main(String[] args)
{
 myclass obj = new myclass();
 obj.setValue(1002,"gaurav",2000,"btech",'A');
 obj.display();
}
}
class myclass
{
int studentid;
String studentname;
int fees;
String  studentcourse;
char section;
}
public void setValue(int studentid,String studentname, int fees ,String studentcourse,char section)
{
this.studentid = studentid;
this.studentname = studentname;
this.studentcourse = studentcourse;
this.section = section;
this.fees = fees;

}

public void display()
{
System.out.println("give id: "+studentid);
System.out.println("Student name"+studentname);

System.out.println("fees:"+fees);
System.out.println("Student course:"+studentcourse);
System.out.println("Student section:"+section);
}
}