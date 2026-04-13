//wap tio demonstrate hierarichal inheritance usng aniimal class as the  base class and dog and cat as sub classs each with their like brk() and meow()
class op8
{
public static void main(String[] args)
{
Dog obj =new Dog();
obj.eat();
obj.bark();
Cat ob = new Cat();
ob.eat();
ob.meow();
}
}

class  Animal
{
public void eat()
{
System.out.println("animal is eating");
}
}
class  Dog extends Animal
{
public void bark()
{
System.out.println("dog is barking....");
}
}
class  Cat extends Animal
{
public void meow()
{
System.out.println("cat is mewoingg.....");
}
}