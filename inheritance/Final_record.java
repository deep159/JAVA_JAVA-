//inheritance
class Student
{
int roll_no=12;
String name="jaggi";
public void display()
{
System.out.println("roll_no "+roll_no);
System.out.println("name "+name);
}}
class Trade extends Student
{
String trade="MCA";
public void displayTrade()
{
System.out.println("trade "+trade);
}}
class Section extends Trade{
String section="A";
public void displaySection()
{
System.out.println("section "+section);
}
}
class Final_record extends Section
{
	public static void main(String args[])
{
Final_record r=new Final_record();
r.display();
r.displayTrade();
r.displaySection();
}
}