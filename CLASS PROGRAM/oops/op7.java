//wap to crate multi level inheritence
class op7
{
public static void main(String[] args)
{
Puppy obj = new Puppy();
obj.eat();
obj.bark();
obj.weep();
}
}
class Animal
{
public void eat()
{
System.out.println("Animal can eat");
}
}
class Dog extends Animal
{
public void bark()
{
System.out.println("Dog is barking");
}
}
class Puppy extends Dog
{
public void weep()
{
System.out.println("puppy is crying");
}
}