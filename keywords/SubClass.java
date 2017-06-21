// Super Keyword
class SuperClass // Base class
{
	public void Msg()
	{
		System.out.println("hello dear...m Super and m the Boss");
	}
}
class SubClass extends SuperClass // Drived class
{
	public void Msg()
	{
		System.out.println("hello dear...m Sub and m the Boss");
	}
	
	public void callMsg()
	{
		super.Msg();
	}
	
	public static void main(String args[])
	{
		SubClass c=new SubClass();
		c.callMsg();
	}
}