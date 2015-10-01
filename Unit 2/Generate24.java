
import java.util.Scanner;

public class Generate24 
{

	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int total = n;
		
		if (n == 1 || n == 2 || n == 3)
		{
			System.out.println("NO");
			
		}
		else if (n == 4)
		{
			System.out.println("YES");
			System.out.print("1 * 2 = 2 \n3 * 4 = 12 \n2 * 12 = 24");
		}
		
		else if (n == 5)
		{
			System.out.println("YES");
			System.out.print("3 + 2 = 5 \n4 * 5 = 20 \n5 - 1 = 4 \n20 + 4 = 24");
		}
		
		else
		{
			System.out.println("YES");
			
			if (n % 2 == 0)
			{
				
				for (int i = 1; i <= (total - 4) / 2; i++)
				{
					System.out.println(n + " - " + (n - 1) + " = 1");
					n = n - 2; 
					if ( i > 1)
					{
						System.out.println("1 * 1 = 1");
					}
					
				}
				
				System.out.print("1 * 1 = 1 \n1 * 2 = 2 \n3 * 4 = 12 \n2 * 12 = 24");
				
			}
			
			else if (n % 2 != 2)
			{
				
				for (int i = 1; i <= (total - 5) / 2; i++)
				{
					
					System.out.println(n + " - " + (n - 1) + " = 1");
					n = n - 2;
					if (i > 1)
					{
						System.out.println("1 * 1 = 1");
					}
					
				}
				
				System.out.print("3 + 2 = 5 \n5 * 1 = 5 \n4 * 5 = 20 \n5 - 1 = 4 \n20 + 4 = 24");
			}

		}	
	}

}

