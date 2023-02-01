package leetcode;

public class TrappingRainwater {
	public int trap(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int leftMax = Integer.MIN_VALUE;
		int rightMax = Integer.MIN_VALUE;
		int result = 0;
		while(left < right)
		{
			leftMax = Math.max(leftMax,height[left]);
			rightMax = Math.max(rightMax,height[right]);
			if(height[left] < height[right])
			{
				result = result + (leftMax - height[left]);
				left++;
			}else{
				result = result + (rightMax - height[right]);
				right--;
			}
		}
		return result;
	}

}
