/*
Given an array arr[] containing positive elements.
 A and B are two numbers defining a range. The task is to check if the array contains all elements in the given range.
 */

//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java


import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class ElementsintheRange {
    boolean check_elements(int arr[], int n, int A, int B) {
        int[] result = new int[B - A + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= A && arr[i] <= B) {

                result[arr[i] - A]++;
            }
        }
        for (int i = 0; i < B - A + 1; i++) {
            if (result[i] == 0) {
                return false;
            }
        }
        return true;

    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n = Integer.parseInt(q[0]);
            int k = Integer.parseInt(q[1]);
            int y = Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }

            ElementsintheRange ob = new ElementsintheRange();
            boolean ans = ob.check_elements(a, n, k, y);
            if (ans)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }
}




