//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
			
			Scanner file = new Scanner(new File("C:\\Users\\kayn2930\\Desktop\\NoahKayCSA\\Unit12\\src\\lab18e.dat"));
			int size = file.nextInt();
			file.nextLine();
			Word2[] list = new Word2[size];
			for(int i = 0; i < size; i++) {
				list[i] = new Word2(file.next());
			} file.close();
			
		
			for(int i = 0; i < list.length; i++) {
				for(int j = 0; j < list.length-1; j++) {
					if(list[j].compareTo(list[j+1]) == -1) {
						Word2 t = list[j];
						list[j] = list[j+1];
						list[j+1] = t;
					}
				}
			}
					
			
			for(Word2 w : list) out.println(w);
		}











	}
