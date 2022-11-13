//1. Find the sum of all given elements from an int array?
class SumOfArray
{
	public static void main(String[] args) 
	{
		int[] i = { 20 ,24 ,364, 85,60 ,58,28 };

					int sum = 0;
					
					for (int j = 0; j<i.length;j++ )
					{
						sum = sum + i[j];// this is the logic for find um of an array 
					
					}
					System.out.println(sum);
	}
}
