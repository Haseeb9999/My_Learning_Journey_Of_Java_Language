import java.util.Scanner;

public class Seventh_Assignment_Of_Java {

    // Problem No 01
    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }

    // Problem No 02
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    // Problem No 03
    static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    // Problem No 04
    static void pattern2(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    // Problem No 05
    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return n-1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    // Problem No 06
    static int avg(int a, int ...b) {
        Scanner sc = new Scanner(System.in);
        int sum = a;
        for (int j : b) {
            sum += j;
        }
        sum = sum/(b.length+1);
        return sum;
    }

    // Problem No 07
    static void pat_4_rec(int n){
        if (n > 0) {
            pat_4_rec(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print(" * ");
            }
        }
        System.out.println("");
    }

    // Problem No 08
    static void pat_2_rec(int n){
        if (n > 0) {
            pat_2_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print(" * ");
            }
        }
        System.out.println("");
    }

    // Problem No 09
    static float cel_into_far(Float a) {
        float f = (a* 9/5)+32;
        return f;
    }
        
    // Problem No 10
    static int fib(int a) {
        int n1 = 0, n2 = 1;
        System.out.print(0);
        for (int i = 2; i <= a; i++) {
            n2 = n1+n2;
            n1 = n2-n1;
            System.out.print(" "+n1);
        }
        System.out.println("");
        return n1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Problem No 01
        // Table of n number
        // {
        // System.out.print("Enter a value of n: ");
        // int n = sc.nextInt();
        // table(n);
        // }

        // Problem No 02
        // Star Pattern
        // {
        // System.out.print("Enter a value of n: ");
        // int n = sc.nextInt();
        // pattern(n);
        // }

        // Problem No 03
        // {
        // System.out.print("Enter a value of n: ");
        // int n = sc.nextInt();
        // int c = sum(n);
        // System.out.println(c);
        // }

        // Problem No 04
        // Star Pattern
        // {
        // System.out.print("Enter a value of n: ");
        // int n1 = sc.nextInt();
        // pattern2(n1);
        // }

        // Problem No 05
        // Fibonacci Series
        // {
        //     System.out.print("Enter a value of n: ");
        //     int n = sc.nextInt();
        //     System.out.println("\n"+fibonacci(n));
        // }

        // Problem No 06
        // {
        //     System.out.println(avg(5, 4,5,6,7,8,9)); 
        // }

        // Problem No 07
        // Pattern of 4 recursive
        // {
        //     System.out.print("Enter a value of n: ");
        //     int n = sc.nextInt();
        //     pat_4_rec(n);
        // }

        // Problem No 08
        // Pattern of 2 recursive
        // {
        //     System.out.print("Enter a value of n: ");
        //     int n = sc.nextInt();
        //     pat_2_rec(n);
        // }

        // Problem No 09
        // {
        //     System.out.println("How many degree celcius:");
        //     float c = sc.nextFloat();
        //     System.out.println(cel_into_far(c)); 
        // }
        
        // Problem No 10
        {
            System.out.println("Enter the value of a:");
            int a = sc.nextInt();
            System.out.println(fib(a));     
        }
    }
}