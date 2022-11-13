import java.util.Scanner;
class  DispPatt6UserInput
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The loop Values");
		int row =  sc.nextInt();
		int col =  sc.nextInt();

		for (int i =row; i>=1 ;i-- )
		{
			for (int j =col;j>=1 ;j-- )
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
