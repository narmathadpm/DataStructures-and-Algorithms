/*
Heap sort is a comparison-based sorting technique based on Binary Heap data structure.
 It is similar to selection sort where we first find the minimum element and place the minimum
 element at the beginning. We repeat the same process for the remaining elements.


 A Binary Heap is a Complete Binary Tree where items are stored in a special order such that the value in a parent node
  is greater(or smaller) than the values in its two children nodes.
   The former is called max heap and the latter is called min-heap. The heap can be represented by a binary tree or array.


   Since a Binary Heap is a Complete Binary Tree, it can be easily represented as an array and the array-based representation
    is space-efficient. If the parent node is stored at index I, the left child can be calculated by 2 * I + 1 and the right
    child by 2 * I + 2 (assuming the indexing starts at 0).


    Heap Sort Algorithm for sorting in increasing order:

Build a max heap from the input data.
At this point, the largest item is stored at the root of the heap. Replace it with the last item of the heap followed by
reducing the size of heap by 1. Finally, heapify the root of the tree.
Repeat step 2 while the size of the heap is greater than 1.


Input data: {4, 10, 3, 5, 1}

         4(0)
        /   \
 10(1)   3(2)
       /   \
  5(3)    1(4)

The numbers in bracket represent the indices in the array representation of data.

Applying heapify procedure to index 1:

         4(0)
         /   \
  10(1)    3(2)
        /   \
   5(3)    1(4)

Applying heapify procedure to index 0:

        10(0)
         /  \
    5(1)  3(2)
        /   \
   4(3)    1(4)

The heapify procedure calls itself recursively to build heap in top down manner.


Best Case	O(n logn)
Average Case	O(n log n)
Worst Case	O(n log n)


Space Complexity	O(1)

 */


import java.util.Scanner;

public class HeapSort {
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
