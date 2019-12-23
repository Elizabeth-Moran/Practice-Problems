import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    //Create hashset to keep track of "seen" socks
    //Create counter to keep track of sock pair amount
    HashSet<Integer> h = new HashSet<Integer>(); 
    int counter = 0;

    //iterate through sock array
    for(int i = 0; i < n; i++)
    {
       //if we've "seen" the sock, remove it from hashset and increment counter
       //else, add the sock to the hashset
       if (!h.contains(ar[i])) h.add(ar[i]);
       else
       {
          h.remove(ar[i]);
          counter++;
       }
    }

    return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
