package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseSchedule {
	boolean[] visited;
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		Map<Integer, List<Integer>> temp = new HashMap<>();
		for(int[] temp1 : prerequisites)
		{
			List<Integer> current = temp.containsKey(temp1[1]) ? temp.get(temp1[1]) : new ArrayList<>();
			current.add(temp1[0]);
			temp.put(temp1[1], current);
		}
		visited = new boolean[numCourses];
		boolean result = true;
		for(int i = 0; i < numCourses ;i++)
		{
			result = result && check(temp, i);
			if(!result) return result;
		}

		return result;
	}

	public boolean check( Map<Integer, List<Integer>> temp , int start)
	{
		if(visited[start])
		{
			return false;
		}
		if(temp.containsKey(start))
		{
			List<Integer> current = temp.get(start);
			visited[start] = true;
			boolean result = true;
			for(int i = 0; i < current.size(); i++)
			{
				result = result && check(temp, current.get(i));
				if(!result)
					break;
			}
			visited[start] = false;
			if(result)temp.remove(start);
			return result;
		}else return true;
	}


}
