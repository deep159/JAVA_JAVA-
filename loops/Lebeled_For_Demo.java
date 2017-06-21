class Lebeled_For_Demo // class
{
	public static void main(String args[]) // main fucntion
	{
	
		first:
		for(int a=1;a<=10;a++) // simple for loop
		{	
			second:
			for(int j=1;j<=10;j++)
			{
					if(a==5 && j==5)
					{
						continue second;
						continue first;
					}
					
					System.out.print(" "+a+" "+j+" ");
			}
			System.out.println("");
		}
	
	}
}