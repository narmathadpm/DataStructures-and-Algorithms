/*

https://leetcode.com/problems/number-of-zero-filled-subarrays/

Given an integer array nums, return the number of subarrays filled with 0.

A subarray is a contiguous non-empty sequence of elements within an array.

 
*/

package leetcode;

public class NumberofZeroFilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {
        long result=0;
        long start=-1;
        long end=-1;
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]==0)
            {
                start=i;
                while(i<nums.length&&nums[i]==0)
                {
                    i++;
                }
                end=i;
              
                result=result+(((end-start)*(end-start+1))/2);
               
            }
            i++;
            
        }
        return result;
        }
    }


