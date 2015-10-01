
import java.util.Scanner;


public class Elections 
{

	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int numCandidates = scan.nextInt();
		int numCities = scan.nextInt();
		
		int[] numCitiesWon = new int[numCandidates];
		
		for (int i = 0; i < numCities; i++)
		
		{
			
			int[] cityVotes = new int[numCandidates];
			
			int max = 0;
			
			int index = 0;
			for (int j = 0; j < numCandidates; j++)
			{
				int vote = scan.nextInt();
				
				cityVotes[j] = vote;
				
				if (max < cityVotes[j])
				{
					max = cityVotes[j];
					
					index = j;
				}
				
				
				if (j == numCandidates - 1)
				
				{
					
					numCitiesWon[index]++;
					
				
				}
	
			
			}
			
		
		}
		
		int winner = 0;
		
		int indexWin = 0;
		
		for (int t = 0; t < numCandidates; t++)
		{
			
			if (winner < numCitiesWon[t])
			{
				
				winner = numCitiesWon[t];
				
				indexWin = t + 1;
			}
			
		
		}
		
		
		
		System.out.println(indexWin);
		

	}

}
