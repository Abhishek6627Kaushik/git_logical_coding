import java.util.Scanner;
class C1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows");
		int rows = sc.nextInt();
		System.out.println("Enter the  Colums");
		int colm =  sc.nextInt();
		System.out.println();
		for (int i =1; i<=rows ; i++ )
		{
			for (int j = 1; j <= colm ; j++ )
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
