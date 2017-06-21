class TOne extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" i = "+i);
		}	
	}
}
class Ttwo extends Thread
{
	public void run()
	{
		for(int j=1;j<=10;j++)
		{
			System.out.println("j = "+j);
		}
	}
}
class ThreadDemo
{
	public static void main(String args[]) throws Exception
	{
		
		TOne t=new TOne();// born stage;
		t.setName("one");
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();// runnable stage	
		//t.join();
		
		if(t.isAlive())
		{
			System.out.println(t.getName()+" Alive");	
		}
		else
		{
			System.out.println(t.getName()+" Dead");
		}
		
		t.suspend();
		t.resume();
		System.out.println("Details => "+t);
		TOne t2=new TOne();
		t2.setName("two");
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		System.out.println("Details => "+t2);
		
		
	}
}