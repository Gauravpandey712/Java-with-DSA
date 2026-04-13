class op9
{
public static void main(String[] args)
{
Document obj = new Document();
obj.print();
obj.show();
}
}
interface printable
{
void print();
}
interface Showable
{
void show();
}
class Document implements printable,Showable
{
public void print()
{
System.out.println("Document printer");
}
public void show()
{
System.out.println("document showable");
}
}