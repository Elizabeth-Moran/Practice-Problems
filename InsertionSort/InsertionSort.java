import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {

        int keyValue = arr[n-1];
        boolean exit = false;

        for(int i = n-1; i >= 0; i--)
        {
            if(i == 0 || arr[i-1] < keyValue)
            {
               arr[i] = keyValue;
               exit = true; 
            } 
            else arr[i] = arr[i-1];

            //Print steps along the way
            for(int j = 0; j < n; j++) System.out.print(arr[j] + " ");
            System.out.println();
            if(exit) break;
        }
        

        
        //When the next lower indexed value is smaller than insertion value, insert the            stored value at the current index and print the entire array

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}

//O(N^2) Time
//O(1) Space
