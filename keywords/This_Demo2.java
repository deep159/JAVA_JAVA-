// this keyword with varible

class This_Demo2 // Drived class
{
	public void wish()
	{
		System.out.println("Hello .... good day");
	}
	public void getName(String name) // local varible
	{
		wish();
		System.out.println(name);
	}	

	public static void main(String args[])
	{
		This_Demo2 d=new This_Demo2();
		d.getName("sts");
	}
}