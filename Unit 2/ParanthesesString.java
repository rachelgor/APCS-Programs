
public class ParanthesesString 
{
	
	public static void main(String[] args) 
	{
		
		ParenthString parentheses = new ParenthString();
		String newStr = parentheses.getSubString("abc(b(a)aac)(ccc(aa(b))ad)", 19);
		String newStr2 = parentheses.getSubString("(a(b)c)", 2);
		System.out.println(newStr2);
		
	}

}

class ParenthString
{
	
	public String getSubString(String str, int index)
	{
		String sub = "";
		int n = str.length();
		int countOpen = 0;
		int countClose = 0;
		for (int i = index; i < n; i++)
		{
			if (str.charAt(i) == '(')
			{
				countOpen++;
			}
			
			else if (str.charAt(i) == ')')
			{
				countClose++;
			}
			
			if (countOpen == countClose)
			{
				sub = str.substring(index + 1, i);
				break;
			}
			
		}
		
		
		return sub;
	}
	
}