//single dimension array
import java.util.*;
class Array3
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int size;
System.out.println("enter the size of array");
size=sc.nextInt();
int array[]=new int[size];

System.out.println("name of class of array"+array.getClass().getName());

System.out.println("enter the elements of array");
for (int i=0;i<size;i++)
{
array[i]=sc.nextInt();
}
System.out.println("now printing the array");
for(int i=0;i<size;i++)
{
	System.out.println(array[i]);
}
}
}