
public class FibonacciTest 
{

	
	public static void main(String[] args) 
	{
		Fibonacci sequence = new Fibonacci();
		System.out.println(sequence.fibonacci(8));

	}

}

class Fibonacci 
{
	
	public int fibonacci(int n)
	{	
		int firstNum = 0;
		int secondNum = 1;
		
		for (int i = 0; i < n ; i++)
		{
			secondNum = firstNum + secondNum;
			firstNum = secondNum - firstNum;

		}
		
		return secondNum - firstNum;
		
	}
	
}
