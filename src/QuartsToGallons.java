
public class QuartsToGallons 
{
	public static void main (String [] args)
	{
		final int QUARTS_IN_GALLON = 4;
		int QuartsNeeded = 25;
		int Gallons;
		int Quarts;
		
		Gallons = QuartsNeeded/QUARTS_IN_GALLON;
		Quarts = QuartsNeeded % QUARTS_IN_GALLON;
		
		System.out.println("A job that needs " +QuartsNeeded+ " quarts, requires "+
	                          Gallons +" Gallons and " +Quarts+ " quarts");
		
	}
}
