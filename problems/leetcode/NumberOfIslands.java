package leetcode;

public class NumberOfIslands {
	int[] arr;
	int m;
	int n;
	int[] rank;
	int count;

	public int find(int x)
	{
		if(arr[x] == x)
		{
			return x;
		}
		return arr[x] = find(arr[x]);
	}

	public void union(int x, int y)
	{
		int rootX = find(x);
		int rootY = find(y);
		if(rootX != rootY)
		{
			if(rank[rootX] < rank[rootY])
			{
				arr[rootX] = rootY;
			}
			else if(rank[rootX] > rank[rootY])
			{
				arr[rootY] = rootX;
			}
			else
			{
				arr[rootY] = rootX;
				rank[rootX]++;
			}
			count--;
		}
	}



	public int numIslands(char[][] grid) {
		n = grid.length;
		m = grid[0].length;
		arr = new int[n*m];
		rank = new int[m*n];
		for(int i = 0; i < n*m ; i++)
		{
			arr[i] = i;
			rank[i] = 1;
		}

		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				if(grid[i][j] == '1')
				{
					count++;
				}
				if(grid[i][j] == '0')
				{
					continue;
				}
				else{
					dfs(grid, i, j);
				}


			}
		}
		return count;

	}

	public void dfs(char[][] grid, int i , int j)
	{
		if(i-1 >= 0 && grid[i-1][j] == '1')
		{
			union(m*(i-1)+j,m*i+j);
		}
		if(i+1 < n && grid[i+1][j] == '1')
		{
			union(m*i+j,m*(i+1)+j);
		}
		if(j-1 >= 0 && grid[i][j-1] == '1')
		{
			union(m*i+j,m*i+(j-1));
		}
		if(j+1 < m && grid[i][j+1] == '1')
		{
			union(m*i+j,m*i+(j+1));
		}
	}
}
