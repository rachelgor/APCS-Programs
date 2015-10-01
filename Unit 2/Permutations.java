import java.util.Arrays;


public class Permutations 
{
	
	public static void main(String[] args) 
	{
		
		int[] permutation = new int[] {1, 2, 3, 4, 5};
		NextPermutation next = new NextPermutation();
		 
		for (int i = 0; i < 120; i++) {
		String nextList = Arrays.toString(permutation);
		System.out.println(nextList);
		next.getNext(permutation);


		}
		
		


	}
	
}

class NextPermutation
{
	
	public void getNext(int[] list)
	{
		int n = list.length;
		int[] last = new int[n];
		
		for (int t = n; t >= 1; t--)
		{
			last[t - 1] = (n + 1) - t;
			
		}
		
		if (Arrays.equals(list, last))
		{
			Arrays.sort(list);
		}
		
		else
		{
			for (int i = n - 1; i > 0; i--)
			{	
				if (list[i] > list[i - 1])
				{
					int switchNum = list[i - 1]; 
					int min = n + 1;
					int index = 0;
					for (int j = n - 1; j > i - 1; j--)
					{
						
						if (switchNum < list[j])
						{
							if(list[j] - switchNum < min)
							{
								min = list[j] - switchNum;
								index = j;
							}
							
							
							if (j == i)
							{
								list[i - 1] = list[index];
								list[index] = switchNum;
								
							}	
								
						}
						
						
						
					}
					
					  
					for (int m = i, k = n - 1; m < k; m++, k--)
					{
						int reverse = list[m];
						list[m] = list[k];
						list[k] = reverse;
						
						
					}
					
					
					break;
					
				}
	
			}
			
			
			
		}
			
	
	}




}
