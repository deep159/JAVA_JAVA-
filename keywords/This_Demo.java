// this keyword with varible

class This_Demo // Drived class
{
	String msg=""; // class varible
	public void printMsg(String msg) // local varible
	{
		this.msg=msg;
	}	
	public void displayOut()
	{
		System.out.println("your msg is "+msg);
	}
	public static void main(String args[])
	{
		This_Demo d=new This_Demo();
		d.printMsg("good morning...");
		d.displayOut();
	}
}