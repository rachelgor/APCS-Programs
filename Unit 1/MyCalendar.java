
import java.util.Calendar;
import java.util.Scanner;

import java.util.Scanner;

public class MyCalendar 
{
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		int numTests = scan.nextInt();
		
		
		
		for (int i = 0; i < numTests; i++)
		{
			int date = scan.nextInt();
			int month = scan.nextInt();
			int year = scan.nextInt();
	
		
			
			CalendarDate cal = new CalendarDate(date, month, year);
			
			cal.setDateMonthYear();
			
			String dayOfWeek = cal.getDay();
			
			System.out.println(dayOfWeek);
			
		}
		
		scan.close();
		
	}

}

class CalendarDate
{

	public CalendarDate()
	{
		
	}
	
	
	public CalendarDate(int aDate, int aMonth, int aYear)
	{ 
		date = aDate;
		month = aMonth - 1;
		year = aYear;
		
		
	}
	
	public void setDateMonthYear()
	{
		cal = Calendar.getInstance();
		cal.set(year, month, date);
		
	}
	
	
	
	public String getDay()
	{
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String day = "";
		if (dayOfWeek == Calendar.SUNDAY)
		{
			return "Sunday";
		}
		else if (dayOfWeek == Calendar.MONDAY)
		{
			day = "Monday";
		}
		else if (dayOfWeek == Calendar.TUESDAY)
		{
			day = "Tuesday";
		}
		else if (dayOfWeek == Calendar.WEDNESDAY)
		{
			day = "Wednesday";
		}
		else if (dayOfWeek == Calendar.THURSDAY)
		{
			day = "Thursday";
		}
		else if (dayOfWeek == Calendar.FRIDAY)
		{
			day = "Friday";
		}
		else if (dayOfWeek == Calendar.SATURDAY)
		{
			day = "Saturday";
		}
		return day;
		
	}
	
	private int date;
	private int month;
	private int year;
	private Calendar cal;
	
}
