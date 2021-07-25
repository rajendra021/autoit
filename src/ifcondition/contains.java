package ifcondition;

public class contains {

 
		   
	    public  void raj()
	    {
	   	 System.out.println("rajj");
	    }
		 
	    public void raj(String name)
	    {
	   	  name="only";
	   	  System.out.println(name);
	    }
	    
	    
	}

	 //method overriding
	 class only
	 {
		  public  void raj()
		     {
		    	 System.out.println("rajj");
		     }
	 }
	 class rajj extends only
	 {
		public void rj()
		{
			System.out.println("rj");
		}

		  public  void raj()
		     {
		    	 System.out.println("j");
		     }
	 }
	 
	 class OverridingTest{
		    public static void main(String [] args)
		    {
	         only r = new rajj();
	         r.raj();

		   
	         
		    }

	}

 
