// import java.util.Scanner;
public class Sixth_Assignment_of_Java {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // Problem No 01
        {
            // float [] arr = {19.5f, 50.55f, 28.9f, 23.23f, 260.3f};
            // float sum = 0f;
            // for (float f : arr) {
            // sum += f;
            // System.out.println(sum);
            // }
            // System.out.println("\n"+sum);
        }

        // Problem No 02
        {
            // System.out.println("Enter a number from these numbers \" 19.5, 50.55, 28.9,
            // 23.23, 260.3 \"");
            // float n = sc.nextFloat();
            // float [] arr = {19.5f, 50.55f, 28.9f, 23.23f, 260.3f};
            // for (float f : arr) {
            // if (f == n) {
            // System.out.println("Work is done");
            // }
            // }
        }

        // Problem No 03
        // {
        // int [] physics = {90,50,60,30,20,50,80};
        // float avg = 0;
        // for (float f : physics) {
        // avg += f;
        // }
        // avg = avg/7;
        // System.out.println(avg);
        // }

        // Problem No 04
        {
            // int [][] arr = {{1,2,3},
            // {4,5,6}};
            // for (int[] i : arr) {
            // for (int j : i) {
            // System.out.print(j+" ");
            // }
            // System.out.println("");
            // }
        }

        // Problem No 05
        {
            // int [][] arr1 = {{1,5,6},{9,5,2}};
            // int [][] arr2 = {{9,5,2},{1,5,6}};
            // int [][] Result = {{0,0,0},{0,0,0}};
            // for (int i = 0; i < arr1.length; i++) {
            // for (int j = 0; j < arr1[i].length; j++) {
            // Result[i][j] = arr1[i][j] + arr2[i][j];
            // System.out.print(Result[i][j]+" ");
            // }
            // System.out.println("");
            // }
        }

        // Problem No 06
        {
            // {
            // int [][] arr = {{9,8,7,6,5,4,3,2,1},{1,2,3,4,5,6,7,8,9}};
            // for (int i = 0; i < arr.length ; i++) {
            // for (int j = arr[i].length-1; j >= 0; j--) {
            // System.out.print(arr[i][j] + " ");
            // }
            // System.out.println("");
            // }
            // System.out.println(arr.length);
            // System.out.println(arr[0].length);
            // }

            // {
            // int [] arr = {9,8,7,6,5,4,3,2,1};
            // for (int i = arr.length; i > 0 ; i--) {
            // System.out.print(i + " ");
            // }
            // }
        }

        // Problem No 07
        {
            {
                // int [] arr = {9,8,7,6,5,4,3,2,1};
                // int max = 0;
                // for (int i : arr) {
                // if (i>max) {
                // max = i;
                // }
                // }
                // System.out.println(max);
            }

            {
                // int [] arr = {9,8,7,6,5,4,3,2,1};
                // int max = Integer.MIN_VALUE;
                // for (int i : arr) {
                // if (i>max) {
                // max = i;
                // }
                // }
                // System.out.println(max);
            }
        }

        // Problem No 08
        {
            // {
            // int [] arr = {9,8,7,6,5,4,3,2,1};
            // int min = 10;
            // for (int i : arr) {
            // if (i<=min) {
            // min = i;
            // }
            // }
            // System.out.println(min);
            // }

            // {
            // int [] arr = {9,8,7,6,5,4,3,2,1};
            // int min = Integer.MAX_VALUE;
            // for (int i : arr) {
            // if (i<=min) {
            // min = i;
            // }
            // }
            // System.out.println(min);
            // }
        }

        // Problem No 09
        {
            boolean sorted = true;
            int [] arr = {9,8,7,6,5,4,3,2,1};
            // int [] arr = {1,2,3,4,5,6,7,8,9};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr[i+1]) {
                    sorted = false;
                    System.out.println("This array is not sorted");
                    break;
                }
                if (sorted != false) {
                    System.out.println("This array is sorted");
                    break;
                }
            }
        }
    }
}