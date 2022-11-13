import java.util.Scanner;
class MiddleNum
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Give Three Numbers ");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if((num1>num2 && num1<num3) || (num1>num3 && num1<num2))
		{
			System.out.println("Middle Number Is "+num1);
		}
		else if( (num2>num1 && num2<num3)  || (num2>num3 && num2<num1))
		{
			System.out.println("Middle Number is "+num2);
		}
		else if ((num3> num1 && num3<num2) || (num3> num2 && num3<num1))
		{
			System.out.println("Middle Number Is "+num3);
		}
		
		else
		{
			System.out.println("Worng Values");
		}
	}

}