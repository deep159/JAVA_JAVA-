// this keyword with varible

class This_Demo5 // Drived class
{
	public This_Demo5 getInstance()
	{
		return this;
	}
	public void check()
	{
		System.out.println("Done");
	}
	public static void main(String args[])
	{
		This_Demo5 d=new This_Demo5();
		This_Demo5 d2=d.getInstance();
		d2.check();
	}
}