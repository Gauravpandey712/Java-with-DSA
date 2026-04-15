public class pat {
    public static void main(String[] args) {
   
 for (int i = 5; i >= 1; i--) 
   {
   for (int j = 1; j <= i; j++) 
        {
        System.out.print("* ");
        }
            System.out.println();
}


// pattern 2   
public void pat2() {
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 5; j++) {
            if (i == 1 || i == 5 || j == 1 || j == 5) {
                System.out.print("* ");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

// pattern 3
public void pat3() {
   
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
    }
}

// pattern 4
public void pat4() {
   
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
}

// pattern 5
public void pat5() {
   
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
    public void pat8() {
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
    }

    // Pattern 9: Empty Triangle
    public void pat9() {
   
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
    }

    // Pattern 10: Hourglass Pattern
    public void pat10() {
    
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
    public void pat12() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("*");
        }
    }

    // Pattern 13: Number Pattern (Continuous Numbers)
    public void pat13() {
  
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("*");
        }
    }

    // Pattern 14: Fibonacci Series in a Pattern
    public void pat14() {
    
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
    }
    }