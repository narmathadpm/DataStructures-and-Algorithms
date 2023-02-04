package leetcode;

import java.util.PriorityQueue;
/*
The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value, and the median is the mean of the two middle values.

For example, for arr = [2,3,4], the median is 3.
For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
Implement the MedianFinder class:

MedianFinder() initializes the MedianFinder object.
void addNum(int num) adds the integer num from the data stream to the data structure.
double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.
 */
public class FindMedianfromDataStream {
	PriorityQueue<Integer> small;
	PriorityQueue<Integer> big;
	private boolean even = true;

	public FindMedianfromDataStream() {
		small = new PriorityQueue<>((a, b) -> (Integer.compare(b, a)));
		big = new PriorityQueue<>();
	}

	public void addNum(int num) {
		if (even) {
			big.offer(num);
			small.offer(big.poll());
		} else {
			small.offer(num);
			big.offer(small.poll());
		}
		even = !even;
	}

	public double findMedian() {
		if (even) {
			return (small.peek() + big.peek()) / 2.0;
		} else {
			return small.peek();
		}
	}
}
