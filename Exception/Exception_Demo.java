//Exception Handling
class Exception_Demo
{
	public static void main(String args[])
	{
		System.out.println("now starting program....");
		System.out.println("Exception Handling program");
		int a=10;
		int b=0;
		System.out.println("now divinding a to b");
		try
		{
			int c=a/b; // Exception	
		}
		catch(Exception e)
		{
			System.out.println( "error >>>> "+e);
		}
		finally
		{
			System.out.println("after try block");
		}
		
		System.out.println("calculaton is done ");
		System.out.println("now ending the program");
		System.out.println("End");
	}
}