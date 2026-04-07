public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5);

    }
static void multiple(int a,int b ,String ...v){
//the rule is var arags are always the last parameter in the method
    System.out.println("the value of a is "+a);
    System.out.println("the value of b is "+b);
    System.out.println("the length of the array is "+v.length);
    for(String i:v){
        System.out.print(i+" ");
    }
} 

    static void fun(int ...v){
        System.out.println("the length of the array is "+v.length);
        for(int i:v){
            System.out.print(i+" ");
        }
    
}
