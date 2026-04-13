class op10
{
public static void main(String[] args)
{
Display obj=new Display();
obj.showmessage();
obj.showmessage("Gaurav Pandey");
obj.showmessage("Gaurav Pandey",21);
}
}
class Display
{
public void showmessage( )
{
System.out.println("how are you");
}
public void showmessage( String name)
{
System.out.println("What is your name"+name);
}
public void showmessage(String name, int age)
{
System.out.println("Name"+name+"AGE:"+age);
}
}