import java.util.*;

public class Method{
    public static void main(String[] args) {

        //dry means  don't repeat yourself 
        //method is a block of code which only runs when it is called
        //method is used to perform certain action, and it is also known as function
        //method is used to reuse code: define the code once, and use it many times
       
        Method m=new Method();
        m.sum();
    }
    void sum(){
         Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);
        sc.close();
    }
}