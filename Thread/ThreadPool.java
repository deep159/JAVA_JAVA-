import java.util.concurrent.*;

class TestThread extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadPool
{
	public static void main(String args[])
	{
		ExecutorService pool=Executors.newFixedThreadPool(3);
		for(int i=1;i<=10;i++)
		{
			TestThread t=new TestThread();
			pool.execute(t);
		}
		pool.shutdown();
	}
}