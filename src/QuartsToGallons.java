import java.util.Scanner;
public class QuartsToGallons 
{
	public static void main (String [] args)
	{
		final int QUARTS_IN_GALLON = 4;
		int QuartsNeeded;
		int Gallons;
		int Quarts;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter needed amount of quarts >> ");
		QuartsNeeded = input.nextInt();
		
		Gallons = QuartsNeeded/QUARTS_IN_GALLON;
		Quarts = QuartsNeeded % QUARTS_IN_GALLON;
		
		System.out.println("A job that needs " +QuartsNeeded+ " quarts, requires "+
	                          Gallons +" Gallons and " +Quarts+ " quarts");
		
	}
}
