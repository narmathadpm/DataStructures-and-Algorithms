package sorting;/*
The data items in the bucket sort are distributed in the form of buckets. In coding or technical interviews
for software engineers, sorting algorithms are widely asked. So, it is important to discuss the topic.

Bucket sort is a sorting algorithm that separate the elements into multiple groups said to be buckets.
 Elements in bucket sort are first uniformly divided into groups called buckets, and then they are sorted
 by any other sorting algorithm. After that, elements are gathered in a sorted manner.


 First, partition the range into a fixed number of buckets.
Then, toss every element into its appropriate bucket.
After that, sort each bucket individually by applying a sorting algorithm.
And at last, concatenate all the sorted buckets.


Bucket sort is commonly used -

With floating-point values.
When input is distributed uniformly over a range.


Scatter-gather approach is used in bucket sorting


Now, create buckets with a range from 0 to 25. The buckets range are 0-5, 5-10, 10-15, 15-20, 20-25.
Elements are inserted in the buckets according to the bucket range. Suppose the value of an item is 16,
 so it will be inserted in the bucket with the range 15-20. Similarly, every item of the array will insert accordingly.

This phase is known to be the scattering of array elements.

Best Case	O(n + k)
Average Case	O(n + k)
Worst Case	O(n2)
 */

import java.util.Scanner;

public class BucketSort {
    void sort(int[] nums,int n)
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
        }

        int[] count=new int[max+1];
        for(int i=0;i<n;i++)
        {
            count[nums[i]]++;
        }

        for (int i = 0, j = 0; i <= max; i++)
        {
            while (count[i] > 0)
            {
                nums[j++] = i;
                count[i]--;
            }
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
        BucketSort b=new BucketSort();
        b.sort(nums,noOfElements);

        for (int i = 0; i < noOfElements; i++) {
            System.out.print(nums[i]+" ");
        }

    }
}
