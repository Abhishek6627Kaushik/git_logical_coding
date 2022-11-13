import java.util.Scanner;
// sum of an array user input
class SumOfArrayUI
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the 8 value in array");
		int n = sc.nextInt();
		int[] arr =  new int[8];
		int sum = 0;
		for (int i = 0 ;i<n ; i++)
		{
			arr[i] =sc.nextInt();	
		}
		for (int ar= 0;ar<arr.length ;ar++ )
		{
			sum = sum + arr[ar];
		}
				System.out.println("Sum Of given array is "+ sum);
	}
}
