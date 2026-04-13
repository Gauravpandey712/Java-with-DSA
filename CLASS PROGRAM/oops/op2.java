class op2
{
public static void main(String[] args)
{
myclass obj=new myclass();
obj.setValue(25,26);
obj.sum();

}
}






class myclass
{
int a;
int b;
public void setValue(int a,int b)
{
this.a=a;
this.b=b;
}
public void sum()
{
int sum=a+b;
System.out.println("sum:"+sum);
}
}