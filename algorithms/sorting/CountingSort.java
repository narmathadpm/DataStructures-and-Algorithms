package sorting;/*
 Counting sort is a sorting technique that is based on the keys between specific ranges.
 In coding or technical interviews for software engineers, sorting algorithms are widely asked.
  So, it is important to discuss the topic


  This sorting technique doesn't perform sorting by comparing elements.
   It performs sorting by counting objects having distinct key values like hashing.
   After that, it performs some arithmetic operations to calculate each object's index position in the output sequence.


   Counting sort is effective when range is not greater than number of objects to be sorted.
    It can be used to sort the negative input values.


    Time Complexity: O(n+k) where n is the number of elements in the input array and k is the range of input.
Auxiliary Space: O(n+k)


 */

import java.util.Scanner;

public class CountingSort {
    void sort(int[] nums,int noOfElements)
    {
       int max=nums[0];
       for(int i=0;i<noOfElements;i++)
       {
           if(max<nums[i])
           {
               max=nums[i];
           }
       }
       int result[]=new int[max+1];
       int output[]=new int[noOfElements];
       for(int i=0;i<noOfElements;i++)
       {

           result[nums[i]]++;
       }

       for(int i=1;i<=max;i++)
       {
           result[i]=result[i]+result[i-1];
       }


        for (int i = noOfElements - 1; i >= 0; i--) {
            output[result[nums[i]] - 1] = nums[i];
            result[nums[i]]--; // decrease count for same numbers
        }


        for(int i=0;i<noOfElements;i++)
        {
            nums[i]=output[i];
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
        CountingSort c = new CountingSort();
        c.sort(nums, noOfElements );

        for (int i = 0; i < noOfElements; i++) {
            System.out.print(nums[i] + " ");
        }

    }

}
