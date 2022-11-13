class DispPatt5
{
	public static void main(String[] args) 
	{
		for (char x = 'A' ;x <='E' ; x++)
		{
			for (char y = 'A'; y<='E';y++ )
			{
				System.out.print(y+" ");
			}
				System.out.println();
		}
	
	}
}


/*

D:\Logical coding Practice\Pattern\src>javac -d ../classes DispPatt5.java

D:\Logical coding Practice\Pattern\src>java -cp ../classes DispPatt5
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E



*/