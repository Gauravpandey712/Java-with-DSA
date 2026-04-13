class void pat1{
public class void main(String[] args) {
   
 for (int i = 5; i >= 1; i--) 
   {
   for (int j = 1; j <= i; j++) 
        {
        System.out.print("* ");
        }
            System.out.println();
    }
    }

 //pattern 2   
    
 for (int i = 1; i <= 5; i++) 
 {
     for (int j = 1; j <= 5; j++) 
    {
       if (i == 1 || i == 5 || j == 1 || j == 5) 
          {
             System.out.print("* ");
           } 
           else 
              {
                    System.out.print(" ");
               }
            }
            System.out.println();
        }
    
//pattern 3
   
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    
//pattern 4
   
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    
//pattern 5
   
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 6: Pyramid
    public void pat6() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 7: Diamond Pattern
    public void pat7() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 8: Diagonal Pattern
    
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j || i + j == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    

    // Pattern 9: Empty Triangle
   
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 5 || j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    

    // Pattern 10: Hourglass Pattern
    
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    

    // Pattern 11: Number Pattern (Repeating Numbers)
    public void pat11() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("*");
        }
    }

    // Pattern 12: Number Pattern (Sequential Numbers)
    
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("*");
        }
    

    // Pattern 13: Number Pattern (Continuous Numbers)
  
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("*");
        }
    

    // Pattern 14: Fibonacci Series in a Pattern
    
        for (int i = 1; i <= 5; i++) {
            int a = 0, b = 1, c;
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("*");
        }
    