import java.util.*;
class Od
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0;
System.out.println("enter value");
int a[]=new int [10];
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}

for(int i=0;i<a.length;i++)
{
if(i%2!=0)
{
sum=sum+a[i];
}
}
System.out.println("sum of odd places is "+sum);
}
}