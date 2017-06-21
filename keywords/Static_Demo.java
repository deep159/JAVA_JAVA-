// Static keyword

class Static_Demo
{
	int count=10;
	
	static public void addCount()
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String args[])
	{
		Static_Demo.addCount();
		
	/*	Static_Demo d1=new Static_Demo();
		d1.addCount(); // method call
		Static_Demo d2=new Static_Demo();
		d2.addCount(); // method call
		Static_Demo d3=new Static_Demo();
		d3.addCount(); // method call
	*/	
	}
}