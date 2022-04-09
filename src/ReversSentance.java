
public class ReversSentance {

	public static void main(String[] args) {
	
		String s= "I love coding";
		
		String[] split=s.split(" ");
		
		//System.out.println(s.charAt(2));
	/*    for(int i=s.length()-1;i>=0;i--)
	    {
	    	char r=s.charAt(i);
	    	System.out.print(r);
	    }          */
		
		
		for(int i=split.length-1;i>=0;i--)
		{
			System.out.print(split[i]+" ");
		
		  
		}

	}

}
