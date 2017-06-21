class Super
{
public void Msg()
{
System.out.println("super the boss");
}
}
class Sub extends Super
{
public void callMsg()
{
	super.Msg();
System.out.println("Subclass the boss");
}
public static void main(String args[])
{
Sub c=new Sub();
c.callMsg();
}


}