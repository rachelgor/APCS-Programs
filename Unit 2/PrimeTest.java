import java.util.Arrays;


public class PrimeTest
{
	public static void main(String[] args) 
	{
		
		System.out.println(PrimeTest.countPrimes(100));
	}
	
	public static int countPrimes(int n)
	{
		int numPrimes = 0;
		
		for(int i = 2; i <= n; i++)
		{
			boolean prime = true;
			for (int j = 2; j < i; j++)
			{
				if (i % j == 0)
				{
					prime = false;
					break; 
				}
				
			}
			
			if (prime)
			{
				numPrimes++;
			}
			
		}
		
		
		return numPrimes;
		
		
	}

}
