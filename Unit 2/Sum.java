
public class Sum 
{

	public static void main(String[] args) 
	{

		SumUp aSum = new SumUp();
		int sum = aSum.sumUp(10);
		System.out.println(sum);

	}
		
	
}

class SumUp
{

	public int sumUp(int n)
	{
		int sum = 0;
		for (int i = 1; i <= n; i++)
		{
			sum = sum + i;
			
		}
		
		return sum;
	}



}
