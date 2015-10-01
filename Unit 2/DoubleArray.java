
import java.util.ArrayList;


public class DoubleArray 
{
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(5);
		intList.add(10);
		intList.add(11);
		
		ArrayListDouble.getDoubleArray(intList);
		System.out.println(intList);
		

	}

}

class ArrayListDouble
{
	
	public static void getDoubleArray(ArrayList<Integer> list)
	{	
		int n = list.size();
		for (int i = 0; i < n; i++)
		{
			list.add(list.get(i));
			list.set(i, 2 * list.get(i));
			
		}
		
	}
}