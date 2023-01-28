package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CourseScheduleanotherSol {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		Map<Integer, List<Integer>> temp = new HashMap<>();
		int[] indegree = new int[numCourses];
		Queue<Integer> que = new LinkedList<>();
		for(int[] temp1 : prerequisites)
		{
			List<Integer> current = temp.containsKey(temp1[1]) ? temp.get(temp1[1]) : new ArrayList<>();
			current.add(temp1[0]);
			temp.put(temp1[1], current);
			indegree[temp1[0]]++;
		}

		System.out.println(temp);

		for(int i = 0; i < numCourses; i++)
		{
			if(indegree[i] == 0)
			{
				que.offer(i);
			}
		}
		int count = 0;
		while(!que.isEmpty())
		{
			count++;
			int node = que.poll();
			if(temp.containsKey(node))
			{
				List<Integer> current = temp.get(node);
				for(int i = 0; i < current.size(); i++)
				{
					indegree[current.get(i)]--;
					if(indegree[current.get(i)] == 0)
					{
						que.add(current.get(i));
					}
				}
			}
		}
		return count == numCourses;



	}
}
