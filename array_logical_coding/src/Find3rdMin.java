class Find3rdMin
{
	public static void main(String[] args) 
	{
		int[] array = {10 , 20, 30 ,40 ,50 ,60 ,70, 80, 90};

	
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
 		for (int i = 0;i<array.length ;i++ )
		{
			 if (array[i]<first)
			 {
				 third= second;
				 second= first;
				  first= array[i];
			 }
			 else if (array[i]<second)
			 {
				 second = array[i];
			 }

			 else if (array[i]< third)
			 {	
					third = array[i];
			 }
		}
		System.out.println("3rd min  is "+third);
		System.out.println("2nd min is "+second );
		System.out.println("1st min is"+first);
	}
}
