//2d array
import java.util.*;
class TwoD1
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
System.out.println("now printing the array");
for (int r=0;r<3;r++)
{
for(int c=0;c<3;c++)
{
System.out.print(a[r][c]+"\t");//for print output using print instead  of println for single line output and +" " is used to give space. \t is used to create space like table between columns
}
System.out.println("\n");//print output in 3 lines or rows showing matrix.\n is used to create space like table between rows
}


}
}