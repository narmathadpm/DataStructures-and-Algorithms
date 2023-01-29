package leetcode;

public class ZeroOneMatrixOptimal {
	public int[][] updateMatrix(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		for(int r = 0; r < n; r++)
		{
			for(int c = 0; c < m; c++)
			{
				if(mat[r][c] > 0)
				{
					int left = n+m;
					int top = n+m;
					if (r - 1 >= 0) top = mat[r - 1][c];
					if (c - 1 >= 0) left = mat[r][c - 1];
					mat[r][c] = Math.min(top, left) + 1;
				}
			}
		}

		for(int r = n-1; r >= 0; r--)
		{
			for(int c = m-1; c >= 0; c--)
			{

				if(mat[r][c] > 0)
				{
					int right = n+m;
					int bottom = n+m;
					if (r + 1 < n) bottom = mat[r + 1][c];
					if (c + 1 < m) right = mat[r][c + 1];
					mat[r][c] = Math.min(mat[r][c], Math.min(bottom, right) + 1);
				}
			}
		}

		return mat;
	}
}
