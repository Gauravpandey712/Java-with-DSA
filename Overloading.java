import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        //method overloading is a feature in java that allows a class to have more than one method with the same name, but different parameters
        //method overloading is used to increase the readability of the program

        Overloading o=new Overloading();
        o.sum(1,2);
        o.sum(1,2,3);
        
        o.demo(1, 2, 3, 4, 5);
       
       o.demo("Hello", "World");
    }
    int sum(int a,int b){
        return a+b;
//if the method is in static then we can call it without creating an object of the class
    }//then we just used direct class name to call the method
    int sum(int a,int b,int c){
        return a+b+c;
    }
     void demo(int ...v){
    System.out.println(Arrays.toString(v));
    }
      void demo(String ...v){
    System.out.println(Arrays.toString(v));
    }


