import java.util.Scanner;
class SmallNumberUserInput
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Frist Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter The Second Number");
		int num2 = sc.nextInt();
		
		System.out.println("Enter The Third Number");
		int num3 = sc.nextInt();
		
	    if (num1 < num2 && num2 < num3)
		{
			System.out.println(num1+" Is Smaller");
		}
		else if (num2 < num1 && num2 < num3)
		{
			System.out.println(num2+" Is Smaller");
		}
		else if (num3 < num1 && num3 < num2)
		{
			System.out.println(num3+" Is Smaller");
		}
		else{	
			System.out.println("You Provide Invaild Number");
		}
	}
	
}