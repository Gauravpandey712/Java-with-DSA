//wap for encapsulation  and getter and setter:
class op5
{
public static void main(String[] args)
{
logindata obj=new logindata();

System.out.println(obj.getusername());
System.out.println(obj.getpassword());
obj.setpassword("pandey123");
System.out.println(obj.getpassword());
}
}
class logindata
{
private String username = "gaurav pandey";
private String password = "gaurav678";

public String getusername()
{
return username;
}
public String getpassword()
{
return password;
}
public void setpassword(String password)
{
this.password=password;
}
public  void setusername(String username)
{
this.username=username;
}

}