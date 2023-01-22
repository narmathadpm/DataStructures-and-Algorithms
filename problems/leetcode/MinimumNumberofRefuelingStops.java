package leetcode;

import java.util.PriorityQueue;

/*
A car travels from a starting position to a destination which is target miles east of the starting position.

There are gas stations along the way. The gas stations are represented as an array stations where stations[i] = [positioni, fueli]
indicates that the ith gas station is positioni miles east of the starting position and has fueli liters of gas.

The car starts with an infinite tank of gas, which initially has startFuel liters of fuel in it. It uses one liter of gas per
one mile that it drives. When the car reaches a gas station, it may stop and refuel, transferring all the gas from the station into the car.

Return the minimum number of refueling stops the car must make in order to reach its destination. If it cannot reach the destination, return -1.

Note that if the car reaches a gas station with 0 fuel left, the car can still refuel there. If the car reaches the destination
with 0 fuel left, it is still considered to have arrived.
 */

/*
Time Complexity - O(NlogN)
Space Complexity -- O(N)
 */
public class MinimumNumberofRefuelingStops {
	public int minRefuelStops(int target, int startFuel, int[][] stations) {
		PriorityQueue<Integer> temp = new PriorityQueue<>((a,b)->(Integer.compare(b,a)));
		int stationsLength = stations.length;
		int current = 0;
		int result = 0;
		while(startFuel < target)
		{
			while(current < stationsLength && startFuel >= stations[current][0])
			{
				temp.offer(stations[current++][1]);
			}

			if(temp.isEmpty()) return -1;
			startFuel = startFuel + temp.poll();
			result++;

		}
		return result;
	}
}
