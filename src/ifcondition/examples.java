package ifcondition;

import java.util.ArrayList;

public class examples {

	public static void main(String[] args)
	{
		String str1,str2;
		str1="my self raj";
		str2="my name is rajendra";
		
		if(str1.equals(str2))
		{
			System.out.println("the strings are equal");
			
		}else
		{
			System.out.println("the strings are different");
		}
		
		//write a script to print the biggest no between two integer
		
		int int1,int2;
		int1=12;
		int2=12;
		if(int1 ==int2)
		{
			System.out.println("both no.s are same");
			
		}else if(int1>int2)
		{
			System.out.println("int1 is big");
			
		}else
		{
			System.out.println("int2 is big");
		}


		//for each loop
		java.util.List<String> ilist=new ArrayList<>();
		ilist.add("new1");
		ilist.add("new2");
		ilist.add("c");
		int t= ilist.size();
		System.out.println(t);
		for(String name:ilist)
		{
			 
			System.out.println(name);
			 
		}
			
	 
		 
	}

}
