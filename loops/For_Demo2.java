class For_Demo2 // class
{
	public static void main(String args[]) // main function
	{
		int EVEN_COUNT=0;
		int ODD_COUNT=0;
		
			for(int i=1;i<=50;i++)
			{
				if(i%2==0)
				{
					EVEN_COUNT++;
					System.out.println("EVEN = "+i);
				}
				else
				{
					System.out.println("ODD  = "+i);
					ODD_COUNT++;
				}
			}
			
			System.out.println("Total Even Numbers : "+EVEN_COUNT);
			System.out.println("Total Odd  Numbers : "+ODD_COUNT);
	}
}