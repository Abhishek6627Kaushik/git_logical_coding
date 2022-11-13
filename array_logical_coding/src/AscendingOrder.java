class AscendingOrder
{
	public static void main(String[] args) 
	{

		int[] array = {74,46,42,32,40,6,2,44};
			int swap = 0;
		System.out.println("Original Elements is");

		for (int i = 0;i<array.length ;i++ )
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();

		for (int i = 0;i<array.length ;i++ )
		{
			for (int j =i+1;j<array.length ;j++ )
			{
				if (array[i]>array[j])
				{
				
				 swap = array[i];
				 array[i]= array[j];
				 array[j]= swap;

				}
			}
			
		}
				System.out.println("After swaping ");
		for (int i = 0;i<array.length ;i++ )
		{

			System.out.print(array[i]+"  ");
		}

	}
}
