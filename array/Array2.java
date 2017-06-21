//single dimension array
import java.util.*;
class Array2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int array[]=new int[10];
System.out.println("enter the elements of array");

for (int i=0;i<10;i++)
{
array[i]=sc.nextInt();
}
System.out.println("now printing the array");
for(int i=0;i<10;i++)
{
	System.out.println(array[i]);
}
}
}