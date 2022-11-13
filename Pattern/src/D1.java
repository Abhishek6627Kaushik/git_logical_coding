import java.util.Scanner;
class D1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		char row = sc.next().charAt(0);
		System.out.println("Enter the colms");
		 char colm = sc.next().charAt(0);
		 for (char c = 'A';  c <=row ; c++ )
		{
			System.out.print(c+" ");
			for (char d = 'A'; d <=colm ; d++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
