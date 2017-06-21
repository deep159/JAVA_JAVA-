// Super Keyword
class SuperClass2 // Base class
{
	SuperClass2()
	{
		System.out.println("Hello... WelCome (*_*) ");
	}
}
class SubClass2 extends SuperClass2// Drived class
{
	SubClass2(String name)
	{
		System.out.println(name);
	}
	public static void main(String args[])
	{
		SubClass2 c=new SubClass2("STS");
		
		if(c instanceof SuperClass2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
	}
}