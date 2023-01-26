package leetcode;
/*
An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same
color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace
the color of all of the aforementioned pixels with color.

Return the modified image after performing the flood fill.
 */
public class FloodFill {
	int n;
	int m;
	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
		n = image.length;
		m = image[0].length;
		if(image[sr][sc] != color)
			fillcolor(image, color, image[sr][sc],sr,sc);
		return image;

	}

	public void fillcolor(int[][] image,int color, int current, int row, int col)
	{
		if(image[row][col] == current)
		{
			image[row][col] = color;
			if(row+1 < n) fillcolor(image, color, current, row+1,col);
			if(row-1 >= 0) fillcolor(image, color, current, row-1,col);
			if(col+1 < m) fillcolor(image, color, current, row,col+1);
			if(col-1 >= 0) fillcolor(image, color, current, row,col-1);
		}
	}
}
