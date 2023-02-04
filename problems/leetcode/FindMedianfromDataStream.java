package leetcode;

import java.util.PriorityQueue;

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
