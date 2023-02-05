package leetcode;

public class Numberof1Bits {
	public int hammingWeight(int n) {
		int result = 0;
		int mask = 1;
		for (int i = 0; i < 32; i++) {
			if ((n & mask) != 0) {
				result++;
			}
			n = n >> 1;

		}
		return result;
	}
}
