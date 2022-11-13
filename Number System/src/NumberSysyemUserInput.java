import java.util.Scanner;
class NumberSystemUserInput
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Frist Number");
		int num1 =sc.nextInt();
		System.out.println("Enter The Second Number");
		int num2 =sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println(num1+" is Greater");
		}
		else if(num2>num1)
		{
			System.out.println(num2+" is Greater");
		}
	}
}
