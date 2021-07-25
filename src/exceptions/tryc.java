package exceptions;

public class tryc {

	public static void  validate(int age) throws Exception
	{
		 

		if(age<18)
		 
			 throw new Exception("not valid");
			 
		else
		
			{System.out.println("welcome to vote");}
		 
	}
		public static void main(String[] args) throws Exception
		{
			validate(24);
	}

}
