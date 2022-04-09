
public class palindrome {

	public static void main(String[] args) {
		int no= 125521;
		int p=no;
		int rem;
		int rev=0;
		while(p!=0)
		{
			rem= p%10;
			rev=rev*10+rem;
			p= p/10;
			
		}
	if(no==rev)
	{
		System.out.println("no is pelindrome");
	}
	else
	{
		System.out.println("no is not palindrome");
	}

	}

}
