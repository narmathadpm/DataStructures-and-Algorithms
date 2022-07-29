/*


The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
from unsorted part and putting it at the beginning.
Lets consider the following array as an example: arr[] = {64, 25, 12, 22, 11}

First pass:

For the first position in the sorted array, the whole array is traversed from index 0 to 4 sequentially.
The first position where 64 is stored presently, after traversing whole array it is clear that 11 is the lowest value.
   64   	   25   	   12   	   22   	   11
Thus, replace 64 with 11. After one iteration 11, which happens to be the least value in the array,
tends to appear in the first position of the sorted list.
   11   	   25   	   12   	   22   	   64
Second Pass:

For the second position, where 25 is present, again traverse the rest of the array in a sequential manner.
   11   	   25   	   12   	   22   	   64


 */
import java.util.Scanner;
class SelectionSort {
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

        //Selection Sort will move minimum element to starting of the array.
        //we need to find smallest element in unsorted subarray and move that to sorted array

        //Time complexity O(n^2) and space complexity is O(1) to store temp value
        //total swaps needed is O(n)

        for(int i=0;i<noOfElements-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<noOfElements;j++)
            {
                if(nums[min_index]>nums[j])
                {
                    min_index=j;
                }
            }
            int temp=nums[min_index];
            nums[min_index]=nums[i];
            nums[i]=temp;

        }

        // printing sorted elements

        for (int i=0;i<noOfElements;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}