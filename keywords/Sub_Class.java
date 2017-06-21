// Super Keyword
class Super_Class // Base class
{
	int marks=10; // base class variable
}
class Sub_Class extends Super_Class // Drived class
{
	int marks=80; // parent class variable
	public void printMarks()
	{
		System.out.println("Marks are "+super.marks);
	}
	public static void main(String args[])
	{
		Sub_Class c=new Sub_Class();
		c.printMarks();
	}
}