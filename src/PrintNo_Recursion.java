import java.util.stream.IntStream;

public class PrintNo_Recursion {

	public static void main(String[] args) {
	
		//printNum(1);
	    //printNumber(101,106);
		IntStream.range(10, 17).forEach(s->System.out.println(s));// using java Stream

	}
	// using recursive - 1st method
	public static void printNum(int num)
	{
		
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printNum(num);
		}
		
	}
	// 2nd method
	
	public static void printNumber(int StNo, int EndNo)
	{
		
		if(StNo<=EndNo)
		{
			System.out.println(StNo);
			StNo++;
			printNumber(StNo,EndNo);
			
		}
		
	}

}
