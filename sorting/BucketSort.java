import java.util.Scanner;

public class BucketSort {

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
        QuickSort q=new QuickSort();
        q.sort(nums,0,noOfElements-1);

        for (int i = 0; i < noOfElements; i++) {
            System.out.print(nums[i]+" ");
        }

    }
}
