/*
Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands.
The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at
 the correct position in the sorted part.


This algorithm is one of the simplest algorithm with simple implementation
Basically, Insertion sort is efficient for small data values
Insertion sort is adaptive in nature, i.e. it is appropriate for data sets which are already partially sorted.


First Pass:

Initially, the first two elements of the array are compared in insertion sort.
   12   	   11   	   13   	   5   	   6
Here, 12 is greater than 11 hence they are not in the ascending order and 12 is not at its correct position. Thus, swap 11 and 12.
So, for now 11 is stored in a sorted sub-array.
   11   	   12   	   13   	   5   	   6


Second Pass:

 Now, move to the next two elements and compare them
   11   	   12   	   13   	   5   	   6

Here, 13 is greater than 12, thus both elements seems to be in ascending order, hence, no swapping will occur.
12 also stored in a sorted sub-array along with 11

 */


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class InsertionSort {
    public static void main(String[] args) {
        //Scanner is used to get input from user
        Scanner sc=new Scanner(System.in);
        //No of elements in unsorted array
        System.out.println("Enter array size");
        int noOfElements =sc.nextInt();
        //Declaring array and getting
        System.out.println("Enter array elements");
        int nums[] = new int[noOfElements];
        for (int i=0;i<noOfElements;i++)
        {
            nums[i]=sc.nextInt();
        }

        //Insertion sort will find the correct position of given element.
        //we need to check all previous elements and move to correct position


        for(int i=1;i<noOfElements;i++)
        {
            int j=i-1;
            int key=nums[i];
            while(j>=0&&key<nums[j])
            {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;

            for (int k=0;k<noOfElements;k++)
            {
                System.out.print(nums[k]+" ");
            }
            System.out.println();
        }

        // printing sorted elements

        for (int i=0;i<noOfElements;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}