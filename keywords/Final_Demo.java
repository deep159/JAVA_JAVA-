// Final Keyword
final class Bank
{
	final public void addMoney(int money)
	{
		String account="3000044";
		System.out.println(money+" Money added to account number "+account);
	}
	
}
class Final_Demo 
{
	public static void main(String args[])
	{
		Bank d=new Bank();
		d.addMoney(2000000);
	}
}