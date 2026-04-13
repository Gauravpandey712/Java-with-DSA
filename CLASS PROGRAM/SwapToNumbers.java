//class SwapToNumbers
//{
//public static void main(String[] args)
//{
//int a=10;
//int b= 20;
//a=a+b;
//b=a-b;
//a=a-b;
//System.out.println(a+""+b);
//}
//}
//Using bitwise operatores to perform the swapping of to numbers

class SwapToNumbers2
{
public static void main(String[] args)
{
int a=10;
int b= 20;
a=a^b;
b=a^b;
a=a^b;
System.out.println(a+""+b);
}
}
