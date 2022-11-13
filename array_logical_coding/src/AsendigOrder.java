class AsendigOrder 
{
	public static void main(String[] args) 
	{
		int[]  array =  {10,35, 74, 73,64, 48,23};
			
			int temp=0;
		for (int i =0; i<array.length;i++ )
		{
			for (int j=i+1; j< array.length;j++ )
			{
				if (array[i] > array[j])
				{
					temp= array[i];
					array[i]= array[j];
					array[j]= temp;
				}
			}
			System.out.println(array[i]);
		}
        } 
			}

