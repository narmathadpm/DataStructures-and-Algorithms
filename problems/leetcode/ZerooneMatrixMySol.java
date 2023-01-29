package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ZerooneMatrixMySol {
	public int[][] updateMatrix(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		int[][] result = new int[n][m];
		Queue<int[]> temp = new LinkedList<>();
		boolean[] visited = new boolean[n*m];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				if(mat[i][j] != 0)
				{
					result[i][j] = -1;
				}
				else{
					visited[i*m+j] = true;
					temp.offer(new int[]{i,j,0});
				}
			}
		}
		while(!temp.isEmpty())
		{
			int[] current = temp.poll();
			int i = current[0];
			int j = current[1];
			int sum = current[2];
			if(i-1 >= 0 && !visited[(i-1)*m+j])
			{
				visited[(i-1)*m+j] = true;
				result[i-1][j] = sum+1;
				temp.offer(new int[]{i-1,j,sum+1});
			}

			if(i+1 < n && !visited[(i+1)*m+j])
			{
				visited[(i+1)*m+j] = true;
				result[i+1][j] = sum+1;
				temp.offer(new int[]{i+1,j,sum+1});
			}
			if(j-1 >= 0 && !visited[(i)*m+j-1])
			{
				visited[i*m+j-1] = true;
				result[i][j-1] = sum+1;
				temp.offer(new int[]{i,j-1,sum+1});
			}
			if(j+1 < m && !visited[i*m+j+1])
			{
				visited[i*m+j+1] = true;
				result[i][j+1] = sum+1;
				temp.offer(new int[]{i,j+1,sum+1});
			}
		}
		return result;
	}

}
