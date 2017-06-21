class x extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" i = "+i);
		}	
	}
}

		
	

class ThreadDemo2
{
	public static void main(String args[]) throws Exception
	{
		x t=new x();
		t.start();
	
		for(int j=1;j<=10;j++)
		{
			if(j==8)
			{
				t.suspend();
			}
		}
	}
}