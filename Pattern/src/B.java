class B 
{
	public static void main(String[] args) 
	{
	
		for (int i = 1; i <= 5; i++)
		{
			for (int j =1 ;j <= 5 ; j++ )
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}


/*

D:\Logical coding Practice\Pattern\src>javac -d ../classes B.java

D:\Logical coding Practice\Pattern\src>java -cp ../classes B
11111
22222
33333
44444
55555
*/
