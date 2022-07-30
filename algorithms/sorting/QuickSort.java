package sorting;/*
Quick sort also follows divide and Conquer algorithm
it will pick any element as pivot in given array and divide array using that pivot

we can pick pivot in different ways

Always pick the first element as a pivot.
Always pick the last element as a pivot (implemented below)
Pick a random element as a pivot.
Pick median as the pivot.


PARTITION (array A, start, end)
{
 1 pivot ? A[end]
 2 i ? start-1
 3 for j ? start to end -1 {
 4 do if (A[j] < pivot) {
 5 then i ? i + 1
 6 swap A[i] with A[j]
 7  }}
 8 swap A[i+1] with A[end]
 9 return i+1
}



Best Case	O(n*logn)
Average Case	O(n*logn)
The Worst Case	O(n2)


Space Complexity	O(n*logn)
Stable	NO


 */


import java.util.Scanner;

public class QuickSort {

    /* function that consider last element as pivot,
    place the pivot at its exact position, and place
    smaller elements to left of pivot and greater
    elements to right of pivot.  */

    int partician(int[] arr, int l, int r) {
        int i = l - 1;
        int p = arr[r];
        for (int j = l; j <= r - 1; j++) {
            if (arr[j] < p) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return (i + 1);

    }

    void sort(int[] arr, int left, int right) {
        if (left < right) {
            int p = partician(arr, left, right);
            sort(arr, left, p - 1);
            sort(arr, p + 1, right);
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
        QuickSort q = new QuickSort();
        q.sort(nums, 0, noOfElements - 1);

        for (int i = 0; i < noOfElements; i++) {
            System.out.print(nums[i] + " ");
        }

    }

}
