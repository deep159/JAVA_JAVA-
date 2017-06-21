//method overloading
class My_Methods
{
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("your sum is "+c);
	}
	public void add(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("your sum is "+sum);
	}
	public void add(int a,int b,int c,int d)
	{
		int sum=a+b+c+d;
		System.out.println("your sum is "+sum);
	}
	public void add(double a,double b)
	{
		double c=a+b;
		System.out.println("your sum is "+c);
	}
}

class Method_Overloading
{
	public static void main(String args[])
	{
			My_Methods d=new My_Methods();
			d.add(20,20);
			d.add(20,20,20);
			d.add(20,20,20,20);
			d.add(12.44,45.20);
	}
}
