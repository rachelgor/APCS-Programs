import java.util.ArrayList;


public class Pascals
{

	public static void main(String[] args) 
	{
		int n = 10;
		
		int[][] triangle = new int[n + 1][n + 1];
		
		for (int i = 1; i <= n; i++)
		{	
			for (int j = 0; j < i; j++)
			{
				if (j == 0)
				
				{
					
					triangle[i][j] = 1;
				
				}
				else
				{
					triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
				}
			}
			
		}
		
			for (int t = 1; t <= n; t++)
		
			{
			
				for (int l = 0; l < t; l++)
			
				{	
				
					System.out.print(triangle[t][l] + " ");
			
				}
			
				System.out.println("");
		
			}
		
	
		
	}

}
