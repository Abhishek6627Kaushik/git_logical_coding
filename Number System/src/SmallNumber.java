class SmallNumber
{
	public static void main(String[] args)
	{
		int num1 = 20;
		int num2 = 10;
		int num3 = 5 ;
 		
		if (num1 < num2 && num2 < num3)
		{
			System.out.println("Num1 Is Smaller");
		}
		else if(num2 < num1 && num2 < num3)
		{
			System.out.println("Num2 Is Smaller");
		}
		
		else if(num3< num1 && num3 < num2)
		{
			System.out.println("Num3 Is Smaller");
		}
	}
}