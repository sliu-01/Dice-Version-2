import java.util.Scanner;

public class DiceMain2 {

	public static void main(String[] args) {
		Dice2 diceA = new Dice2();
		Dice2 diceB = new Dice2();
		
		int rollFaceA = diceA.roll();
		int rollFaceB = diceB.roll();
		
		int totalRoll = rollFaceA + rollFaceB;
		
		System.out.println(rollFaceA + " + " + rollFaceB + " = " + totalRoll);
		
		int count = 1;
		
		while (rollFaceA != rollFaceB)
		{
			count++; 
			
			rollFaceA = diceA.roll();
			rollFaceB = diceB.roll();
			
			totalRoll = rollFaceA + rollFaceB;
			
			System.out.println(rollFaceA + " + " + rollFaceB + " = " + totalRoll);
		}
		
		System.out.println("\nYou rolled " + count + " times.");
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("\nPlease insert a target value between 2 and 12 inclusive: ");
		int target = in.nextInt();
		
		while (target>12)
		{
			System.out.print("Please insert a valid value between 2 and 12 inclusive: ");
			target = in.nextInt();
			if (target < 2)
				target = 13;
		}
		
		totalRoll = 0;
		count = 0;
		
		while (target != totalRoll)
		{
			count++; 
			
			rollFaceA = diceA.roll();
			rollFaceB = diceB.roll();
			
			totalRoll = rollFaceA + rollFaceB;
			
			System.out.println(rollFaceA + " + " + rollFaceB + " = " + totalRoll);
		}
		
		System.out.println("\nYou rolled " + count + " times.");
		
	}

}
