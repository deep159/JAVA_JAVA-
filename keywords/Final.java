//initialize final keyword value within block method
import java.lang.*;
class Final
{
int a;
final int b=20;
final static int c;//or final int c;
static {c=10;}//or {c=10;}

public void show()
{
System.out.println(a);
System.out.println(b);
System.out.println(c);

}


public static void main(String args[])
{
Final m=new Final();
m.show();
}

}