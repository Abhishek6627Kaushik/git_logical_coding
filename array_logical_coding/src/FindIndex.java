import java.util.Arrays;
class FindIndex 
{ 
	public static void main(String[] args) throws Exception
	{

			int[] a = {20, 49 ,47 ,58, 85, 95, 90};
			int[] b = {81, 94, 48,494,6 ,94,48};
			int j = 0;
			for(int i = 0 ; i<a.length;i++)
				{
				for ( j=0;j<b.length ;j++ )
				{
				
            //a[i] = a[i] + b[i];
            b[j] = a[i]; 
			} //a[i] = a[i] - b[i];
			  System.out.println(b[j]);

        }
        //3/28/2022System.out.println(a[i]);
      	}
}
