import java.util.Scanner;

public class WhichSeason 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter your birth month(as a number): ");
		int month = user.nextInt();
		
		if(month<1 || month>12)
		{
			System.out.print("That is a invalid month");
		}
		else if(month==12 || month<=2)
		{
			System.out.print("You were born in Winter");
		}
		else if(month<=5)
		{
			System.out.print("You were born in Spring");
		}
		else if(month<=8)
		{
			System.out.print("You were born in Summer");
		}
		else if(month<=11)
		{
			System.out.print("You were born in Fall");
		}
	}

}
