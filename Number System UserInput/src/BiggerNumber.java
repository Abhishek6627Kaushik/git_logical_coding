// User Input print Bigger Number 

import java.util.Scanner;

class UserInputBiggerNumber
{
		public static void main(String[] args)
		
		{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Frist Number");		
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();

			if(num1>num2)
			{
				System.out.println("Bigger number is"+ num1);
			}
			else if(num2>num1)
			{
				System.out.println("Bigger Number Is"+num2);
			}
		}	
			
}