package ifcondition;

public class reverseString {

	public static void main(String[] args) 
	{
	 String NAme="Raja Sahoo";
	 StringBuilder st = new StringBuilder();
	 st.append(NAme);
	 st.reverse();
	 System.out.println(st);
	 
	 
	 String str = "raj";
		StringBuffer b = new StringBuffer();
		b.append(str);
		System.out.println(b.reverse());
     
		
		String bb="only";
		StringBuilder jb = new StringBuilder();
		jb.append(bb);
		System.out.println(jb.reverse());
	}

}
