import java.util.*;

public class Array {
    public static void main(String[] args) {
        //array is a data structure that can store multiple values of the same type in a single variable
        //array is used to store a collection of data, but it is not a collection class like ArrayList, LinkedList, etc.
        //array is a fixed size data structure, which means that once we declare an array, we cannot change its size
        //why array is used to store the same type of data because it is more efficient in terms of memory and performance
      //  String[] arr=new String[5];
        String[] arr = {"a","r","ui","hh","gh"};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       //any reference value we have is null by default
       // inputs using for loops 
       Scanner sc=new Scanner(System.in);
       for (int i=0;i<arr.length;i++){
        arr[i]=sc.nextLine();
       }
       // for output of array using for loop 
       //for(int i=0;i<arr.length;i++){
        //System.out.print(arr[i]+" ");
       //} OR 
         for(String i:arr){
          System.out.print(i+" ");
         }
       //we just used an enhanced for loop to print the array
       // or just used .to String method to print the array met see 
       System.out.println(Arrays.toString(arr));
        
    }
}
