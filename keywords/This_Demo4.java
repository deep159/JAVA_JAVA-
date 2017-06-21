// this keyword with varible

class This_Demo4 // Drived class
{
	public void getInstance(This_Demo4 obj)
	{
		System.out.println("sts ");
	}

	public void getObj()
	{
		getInstance(this);
	}
	s
	public static void main(String args[])
	{
		This_Demo4 d=new This_Demo4();
		d.getObj();
	}
}