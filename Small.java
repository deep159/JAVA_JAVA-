//smallest number
import java.util.*;
class Small
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int [3][3];

System.out.println("enter the elements of array");
for (int r=0;r<3;r++)
{
for(int c=0;c<3;c++)
{
a[r][c]=sc.nextInt();//for input
}
}
int min=a[0][0];
for (int r=0;r<3;r++)
{
for(int c=1;c<3;c++)
{
	if(min>a[r][c])
	{
min=a[r][c];
	}
}
}

System.out.println("smallest number is "+min);







}
}