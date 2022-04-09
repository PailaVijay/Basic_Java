
public class LargeNumber {

	public static void main(String[] args) {
		
		int [] arr= {12,5,6,45,36,14,10};
		
		int val=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>val)
			{
				val= arr[i];
			}
			
		}
		System.out.println(val);

	}

}
