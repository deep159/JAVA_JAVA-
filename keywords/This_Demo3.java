// this keyword with varible

class This_Demo3 // Drived class
{
	This_Demo3() // default constructor
	{
		System.out.println("Your marks are : ");
	}
	This_Demo3(int marks)
	{	
		System.out.println(marks);
		this("GGS","good");
	}
	This_Demo3(String college,String msg)
	{
		System.out.println(college+" "+msg);
	}

	public static void main(String args[])
	{
		This_Demo3 d=new This_Demo3(80);
		
	}
}