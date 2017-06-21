abstract class A{
	
	abstract public void printMsg(); // abstract method
}

class B extends A
{
	public void printMsg()
	{
		System.out.println("hello");
	}
	
	public static void main(String args[])
	{
		B b=new B();
		b.printMsg();
	}

}