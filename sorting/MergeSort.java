/*
1.it will follow divide and conquer approach
we need to divide arrays into two halves and then they are combined in a sorted manner.

We can think of it as a recursive algorithm that continuously splits the array in half until it cannot be further divided. This means that if the array becomes empty or has only one element left, the dividing will stop


Time Complexity: O(n log(n))

Space complexity O(n)


*/

import java.util.Scanner;

class MergeSort {


    void merge(int arr[], int l, int m, int r) {
        int n2 = r - m;
        int n1 = m - l + 1;
        int temp[] = new int[n1];
        int temp1[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            temp[i] = arr[i + l];
        }
        for (int i = 0; i < n2; i++) {
            temp1[i] = arr[m + i + 1];
        }

        int k = l;
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (temp[i] <= temp1[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp1[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = temp[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = temp1[j];
            j++;
            k++;
        }
    }

    void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left) + (right - left) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        //Scanner is used to get input from user
        Scanner sc = new Scanner(System.in);
        //No of elements in unsorted array
        System.out.println("Enter array size");
        int noOfElements = sc.nextInt();
        //Declaring array and getting
        System.out.println("Enter array elements");
        int nums[] = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            nums[i] = sc.nextInt();
        }
        MergeSort m = new MergeSort();
        m.sort(nums, 0, noOfElements-1);

        for (int i = 0; i < noOfElements; i++) {
            System.out.print(nums[i]+" ");
        }

    }
}