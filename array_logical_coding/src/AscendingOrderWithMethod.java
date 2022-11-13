class AscendingOrderWithMethod 
{

	static void ascend()
	{
			int[] array = {10,53,45,4,49,89,90};

			int swap = 0;

			System.out.println("Original Array is ");
			for (int i = 0; i<array.length;i++ )
			{
				
				System.out.print(array[i]+" ");
			}
					

				System.out.println("\nAfter Swaping");
				
				for (int i =0;i<array.length ; i++)
				{
					for (int j =i+1;j<array.length ;j++ )
					{
						if (array[i]>array[j])
						{
							swap =  array[i];
							array[i]= array[j];
							array[j]=swap;

						}					
						
					}
					System.out.print(array[i]+" ");

				}
	}
	public static void main(String[] args) 
	{
		ascend();
	}
}
