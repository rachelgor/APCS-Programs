import java.util.Scanner;


public class NumBacteria 
{
	
	public static void main(String[] args) 
	{	
		int count = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	
		while (n > 0)
		{
			if (n % 2 == 1)
			{
				count++;
			}
			
			n = n / 2;
		}
		
		System.out.println(count);
	}

}
