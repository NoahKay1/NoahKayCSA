//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{
		maze = new int [][]{};
		
		
	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		Scanner scan = new Scanner(line);
		for (int i = 0; i < size; i++){
			for (int j = 0; j < size; j++){
				maze[i][j] = scan.nextInt();
			}
		}

	}

	public void hasExitPath(int r, int c)
	{
		if (r >= 0 && c>= 0 && r<maze.length && c<maze[r].length && maze[r][c] == 1){
			maze[r][c] = 4;
			if (maze[r-1][c] == 1){
				hasExitPath(r-1,c);
			}
			else if (maze[r+1][c] == 1){
				hasExitPath(r+1,c);
			}
			else if (maze[r][c-1] == 1){
				hasExitPath(r,c-1);
			}
			else if (maze[r][c+1] == 1){
				hasExitPath(r,c+1);
			}
			
		}
		
		if (maze[r][c] == 1 && c==maze[r].length){
			System.out.println("exit found");
		}
		else if (c!=maze[r].length){
			System.out.println("exit not found");
		}
	}

	public String toString()
	{
		String output="";





		return output;
	}
}