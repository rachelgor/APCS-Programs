
public class MathTest 
{

	public static void main(String[] args)
	{
		Operations math = new Operations();
		
		int x = Operations.add(3, 4);
		int y = Operations.subtract(3, 4);
		int z = Operations.multiply(3, 4);
		double w = Operations.divide(3.0, 4.0);
		int h = Operations.power(3, 3);
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.printf("%.1f\n", w);
		System.out.println(h);
		
		
		System.out.println(Operations.getCount());

	}

}

class Operations 
{
	private static int counter = 0;
	
	public Operations()
	{
		counter++;
	}
	
	public static int getCount()
	{
		return counter;
		
	}
	
	public static int add(int x, int y)
	{
		int z = x + y;
		return z;
		
	}
	
	public static int subtract(int x, int y)
	{
		int z = x - y;
		return z;
		
	}
	
	public static int multiply(int x, int y)
	{
		int z = x * y;
		return z;
		
	}
	
	public static double divide(double x, double y)
	{
		double z = (double)(x) + (double)(y);
		return z;
		
	}
	
	public static int power(int x, int y)
	{
		int w = x;
		for (int i = 0; i < (y - 1); i++)
		{
			x = x * w;
		}
		
		return x;
		
		
	}
	
}

