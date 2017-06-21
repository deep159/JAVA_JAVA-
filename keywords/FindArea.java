// Final Keyword

class FindArea
{
	final double pie; // constan
	
	
	public void findArea(int r)
	{
		double area=pie*r*r;
		System.out.println("Area is "+area);
	}
	
	public static void main(String args[])
	{
		FindArea a=new FindArea();
		a.findArea(10);
	}
}