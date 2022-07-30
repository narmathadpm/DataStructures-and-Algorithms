package sorting;/*
The lower bound for Comparison based sorting algorithm (Merge Sort, Heap Sort, Quick-Sort .. etc) is Ω(nLogn),
i.e., they cannot do better than nLogn. Counting sort is a linear time sorting algorithm that sort in O(n+k)
time when elements are in the range from 1 to k.


e can’t use counting sort because counting sort will take O(n2) which is worse than comparison-based sorting algorithms.
Can we sort such an array in linear time?


Radix Sort is the answer. The idea of Radix Sort is to do digit by digit sort starting from least
 significant digit to most significant digit. Radix sort uses counting sort as a subroutine to sort.


 Original, unsorted list: 170, 45, 75, 90, 802, 24, 2, 66 Sorting by least significant digit (1s place) gives:
 [*Notice that we keep 802 before 2, because 802 occurred before 2 in the original list, and similarly for pairs 170 & 90
 and 45 & 75.] 170, 90, 802, 2, 24, 45, 75, 66 Sorting by next digit (10s place) gives: [*Notice that 802 again comes
 before 2 as 802 comes before 2 in the previous list.] 802, 2, 24, 45, 66, 170, 75, 90 Sorting by the most significant
 digit (100s place) gives: 2, 24, 45, 66, 75, 90, 170, 802
Best Case	Ω(n+k)
Average Case	θ(nk)
Worst Case	O(nk)
 */


import java.util.Scanner;

public class Radix {
    void sort(int[] nums,int i,int n)
    {
        int count[]=new int[10];
        int output[]=new int[n];
        for(int j=0;j<n;j++)
        {

            count[(nums[j]/i)%10]++;
        }
        for(int j=1;j<10;j++)
        {
            count[j]=count[j]+count[j-1];
        }


        for (int j = n - 1; j >= 0; j--) {
            output[count[(nums[j]/i)%10] - 1] = nums[j];
            count[(nums[j]/i)%10]--; // decrease count for same numbers
        }

        for(int j=0;j<n;j++)
        {
            nums[j]=output[j];
        }
    }
    void max(int[] nums,int n)
    {
        int max=nums[0];
        for(int i=0;i<n;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
        }

        for(int i=1;max/i>0;i=i*10)
        {
            sort(nums,i,n);
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
        Radix c = new Radix();
        c.max(nums, noOfElements );

        for (int i = 0; i < noOfElements; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
