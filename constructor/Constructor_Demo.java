// constructor demo

class Constructor_Demo
{
	
	int a;
	int b;
	
	Constructor_Demo(int a,int b)
	{
		System.out.println(a+"  "+b);
	}
	
	public static void main(String args[])
	{
		//Constructor_Demo d=new Constructor_Demo();
		Constructor_Demo d2=new Constructor_Demo(20,20);
	}
}