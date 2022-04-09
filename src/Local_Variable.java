
public class Local_Variable {
	
	void show()
	{
		int a = 10; // local variable
		System.out.println(a);
	}
	
	public Local_Variable()
	{
		int a = 20; // local variable with in constructor
		System.out.println(a);
		
	}
	

	public static void main(String[] args) {
		int a= 30;
		//System.out.println(a);
		Local_Variable lv= new Local_Variable();
		lv.show();
		System.out.println(a);

	}

}
