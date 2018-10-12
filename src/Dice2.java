
public class Dice2 
{
	private int count;

	
	public Dice2()
	{
		count = 0;

	}
	
	public String roll()
	{
		int dieFace = (int) (6 * Math.random()) + 1;
		
		count++;
		
		return "You Rolled a " + dieFace;
	}
	
	public void reset()
	{
		count = 0;
	}
	
	public String numRolls()
	{
		return "You Rolled " + count + " Times.\n";
	}
}
