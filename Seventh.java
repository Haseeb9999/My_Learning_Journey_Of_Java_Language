import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Seventh {
    // With Static method
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = x * y;
        }
        return z;
    }

    // Without Static method
    int loic(int x, int y) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter a value of A: ");
        x = sc.nextInt();
        System.out.print("Enter a value of B: ");
        y = sc.nextInt();
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = x * y;
        }
        return z;
    }

    // With static void method
    static void joke() {
        System.out.println("No Joke you Fool");
    }

    // With static void method and no return in variable
    static void change(int x) {
        x = 59;
    }

    // With static void method and no return in array
    static void change2(int[] arr) {
        arr[0] = 59;
    }

    // Make a same variable method with integer A (Does not make an error)
    static void joke(int a) {
        System.out.println("Good morning " + a + " How are you my Friend");
    }

    // Make a same variable method with integer A (Does not make an error)
    static void joke(int a, int b) {
        System.out.println("Good morning " + a + " How are you my Friend");
        System.out.println("Good morning " + b + " How are you my Friend");
    }

    // Make a same variable method with String A (Does not make an error)
    static void joke(String a) {
        System.out.println("Good morning " + a + " How are you my Friend");
    }

    // Make an array Method to sum all the numbers who's user input
    static int sum(int x, int ... arr) {
        int result = x;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    // Method of Factorial
    static int Factorial(int n){
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * Factorial(n-1);
        }
    }
    
    // Method of Factorial in other ways
    static int Factorial1(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = 0;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    // Fibonacci Series
    static int Fibonacci(int a){
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        } else if (a == 2) {
            return 1;
        } else {
            int n1 = 1;
            int n2 = 1;
            System.out.print("0 "+n1+" ");
            System.out.print(n2+" ");
            for (int i = 3; i < a; i++) {
                n2 = n1 + n2;
                n1 = n2 - n1;
                System.out.print(n2+" ");
            }
            System.out.println("");
            return n2;
        }
    }

    public static void main(String[] args) {
        // Create an object of method "loic"
        Seventh lo = new Seventh();

        // Create an object of method "Scanner"
        Scanner sc = new Scanner(System.in);

        // initializeing the variable
        int x, y, z;

        // Method with static and without refrence
        // {
        // System.out.print("Enter a value of A: ");
        // x = sc.nextInt();
        // System.out.print("Enter a value of B: ");
        // y = sc.nextInt();
        // z = logic(x, y);
        // System.out.println("The value of C is: " + z);
        // }

        // Method without static and with refrence
        // {
        // System.out.print("\n\nEnter a value of A: ");
        // x = sc.nextInt();
        // System.out.print("Enter a value of B: ");
        // y = sc.nextInt();
        // z = lo.loic(x, y);
        // System.out.println("The value of C is: " + z);
        // }

        // Method of joke in void
        // {
        // joke();
        // }

        // Variable and array change with the help of method
        // {
        // x = 50;
        // change(x);
        // System.out.println(x);
        // int[] marks = { 41, 51, 62, 61, 95, 65, };
        // change2(marks);
        // System.out.println(marks[0]);
        // }

        // Overloading Method
        // {
        // joke(3000,5000);
        // joke("Haseeb");
        // joke();
        // joke(3000);
        // }

        // Printing the method
        // {
        //     System.out.println("The sum of all these number is " + sum(5,9,6,5,6,3,5,2));
        // }

        // Recursion in java
        // Factorial Function in java
        // {
        //     System.out.println("Enter the value of n: ");
        //     int n = sc.nextInt();
        //     System.out.println("The factorial of "+n+" is: "+Factorial(n));
        //     System.out.println("The factorial of "+n+" is: "+Factorial1(n));
        // }

        // {
        //     int result = 0;
        //     for (int i = 1; i < 6; i++) {
        //         result += i;
        //     }
        //     System.out.println(result);
        // }

        // Fibonacci Series
        {
            System.out.println("Enter the value of n: ");
            int n = sc.nextInt();
            System.out.println(Fibonacci(n));
        }
    }
}
