//2d array
class TwoD
{
public static void main(String args[])
{
int a[][]=new int [3][3];
a[0][1]=5;
a[0][2]=6;
a[2][0]=7;
a[2][1]=10;
a[2][2]=47;

System.out.println(a[0][2]+"  "+a[2][2]);
}
}