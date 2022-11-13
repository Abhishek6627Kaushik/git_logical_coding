import java.util.Scanner;
class B1 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the no of Rows");
		int rows =sc.nextInt();
		System.out.println("Enter The no of coloms");
		int colm = sc.nextInt();
		System.out.println();
		for (int  i = 1 ; i <=rows ; i++ )
		{
			for (int j = 1 ;j <= colm ;j++ )
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
