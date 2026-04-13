//Wap to inherite a class and create and create a method  sum(a,b)
class op6
{
public static void main(String[] args)
{
B obj = new B();
obj.sum(25,25);
obj.sub(15,14);
}
}

class A
{
public void sum(int x,int y)
{
int s= x+y;
System.out.println("sum = "+s);
}
}

class B extends A
{
public void sub(int x,int y)
{
int s= x+y;
System.out.println("sum = "+s);
}
}