import java.util.*;
class exception_demo
{
	public static void main(String args[])
	{
		int a;
		int b;
		int c=0;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		try{
			  c=a/b;
		}
		catch(Exception e)
		{
			System.out.println("zeor can not be divided by any number " +e);
		
		
		}

System.out.println("result is "+c);		
		
	
		
	}
}