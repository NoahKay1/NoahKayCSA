
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
   private boolean exitFound = false;
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
			if(c == maze.length - 1){
				exitFound = true;
			}
			else{
				maze[r][c] = 4;
				hasExitPath(r-1,c);
				hasExitPath(r+1,c);
				hasExitPath(r,c-1);
				hasExitPath(r,c+1);
			}
			
		}
		
	}

	public String toString()
	{
		hasExitPath(0,0);
		String output="";
		for(int i = 0; i < maze.length; i++){
			for(int j = 0; j < maze.length; j++){
				if(maze[i][j] == 4){
					output += 1 + " ";
				}
				else{
					output += 0 + " ";
				}
			}
			output += "\n";
		}
		if(exitFound){
			output += "exit found\n";
		}
		else{
			output += "exit not found\n";
		}
		return output;
	}
}