//inheritance
class Fruit //base class
{
String property="good for health";
public void displayProperty()
{
System.out.println(property);
}
}
class Apple extends Fruit
{
public static void main(String args[])
{
Apple a=new Apple();
a.displayProperty();
}
}