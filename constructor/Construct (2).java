//initialize final keyword value within block method
import java.lang.*;
//initialize final keyword value within constructor method
class Construct
{
int a;
final int b=20;
final int c;
Construct(int x)
{
c=x;
}

public void show()
{
System.out.println(a);
System.out.println(b);
System.out.println(c);

}


public static void main(String args[])
{
Construct m=new Construct(12);
m.show();

}

}