class small implements Runnable
{
	public void run()
	{
		System.out.println("Runnable Thread");
	}
}

class RunnableDemo
{
	public static void main(String args[])
	{
		small s=new small(); // born
		Thread t=new Thread(s);
		t.start();
	}
}