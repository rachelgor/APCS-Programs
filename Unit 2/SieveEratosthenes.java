
public class SieveEratosthenes
{
	
	public static void main(String[] args) 
	{
		
		int n = 100;
		int prime = 2;
		boolean[] notPrime = new boolean[n];
		notPrime[0] = true;
		for (int i = 1; i <= n; i++)
		{	
			if (i > 2)
			{
				prime = i;
			}
			
			if (!(notPrime[i - 1]))
			{
				for(int j = i * i; j <= n; j+=i)
				{
						notPrime[j - 1] = true;
					
					
				}
			}
			
		}
		
		for (int m = 1; m <= n; m++)
		{
			
			if (!(notPrime[m - 1]))
			{
				System.out.println(m);
			}
			
		}
		
		

	}
	
	

}

