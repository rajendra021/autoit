package exceptions;

import java.io.PrintWriter;

public class trycatch {

	public static void main(String[] args) 
	{
		int i=100;
		int j= 0;
		int z;
		
		
		try{
			
			 z=i/j;
		}
		catch (Exception e)
		{
			 System.out.println(e);
			System.out.println(z=i/(j+2));
		}
		 
		
		int[] x ={10,20,30};
		try
		{
			System.out.println(x[5]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		 

		
		PrintWriter pw;
		try
		{
			pw = new PrintWriter("onlyraj.txt");
				pw.println("saved");
		}
		catch(Exception e)
		{
			System.out.println(e);
		} 
	}

}
