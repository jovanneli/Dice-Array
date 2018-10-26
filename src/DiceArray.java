
public class DiceArray 

{
	public static void main(String[] args)
	{
		Dice awesome = new Dice();
		Dice fantastic = new Dice();
		
		int[] count = new int[13];
		
		for (int i = 1; i <= 1000; i++)
		{
			int roll1 = awesome.roll();
			int roll2 = fantastic.roll();
			int sum = roll1 + roll2;
			
			if (sum == 2)
			{
				count[2] += 1;
			}
			else if (sum == 3)
			{
				count[3] += 1;
			}
			else if (sum == 4)
			{
				count[4] += 1;
			}
			else if (sum == 5)
			{
				count[5] +=1;
			}
			else if (sum == 6)
			{
				count[6] += 1;
			}
			else if (sum == 7)
			{
				count[7] += 1;
			}
			else if (sum == 8)
			{
				count[8] += 1;
			}
			else if (sum == 9)
			{
				count[9] += 1;
			}
			else if (sum == 10)
			{
				count[10] += 1;
			}
			else if (sum == 11)
			{
				count[11] += 1;
			}
		}
		System.out.println("Number of times you rolled 2: " + count[2]);
		System.out.println("Number of times you rolled 3: " + count[3]);
		System.out.println("Number of times you rolled 4: " + count[4]);
		System.out.println("Number of times you rolled 5: " + count[5]);
		System.out.println("Number of times you rolled 6: " + count[6]);
		System.out.println("Number of times you rolled 7: " + count[7]);
		System.out.println("Number of times you rolled 8: " + count[8]);
		System.out.println("Number of times you rolled 9: " + count[9]);
		System.out.println("Number of times you rolled 10: " + count[10]);
		System.out.println("Number of times you rolled 11: " + count[11]);
	}
}
