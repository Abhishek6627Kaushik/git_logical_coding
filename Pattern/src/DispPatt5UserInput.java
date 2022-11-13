import java.util.Scanner;
class  DispPatt5UserInput
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Char Values");

		char row = sc.next().charAt(0);
		char col = sc.next().charAt(0);
		for (char x = 'A'; x<=row ;x++ )
		{
			for (char y ='A'; y<=col;y++ )
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}


/*

A B C D E
A B C D E
A B C D E
A B C D E
A B C D E


*/