import java.util.*;

class Test{
	public boolean checkNumber(int number)
	{
		if((number&1)==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
}

class Method_Demo // main class
{
	public static void main(String args[]) // main function
	{
		Scanner s=new Scanner(System.in);
		System.out.println("please Enter number");
		int number=s.nextInt();
		
		Test t=new Test();
		boolean x=t.checkNumber(number);
		
		if(x==true)
		{
			System.out.println("even");
		}
		else{
			System.out.println("ODd");
		}
		
		
		
		
/*		Test t=new Test();
		int x=t.sum(10,20);
		System.out.println("your sum is "+x);
		x++;
		System.out.println(x);
		x=x+100;
		System.out.println(x); */
	}
}