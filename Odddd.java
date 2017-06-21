import java.io.*;
import java.lang.*;
public class Odddd
{
public static void main(String args[]) throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter  no ");
int i= Integer.parseInt(br.readLine());
int n[]= new int [10];
int x;
int Even=0,Odd=0;
while(i!=0)
{
x=i%10;
if(x%2==0)
{
Even=Even+x;
}
else
{
Odd=Odd+x;
}
i=i/10;

}
System.out.println("sum od odd no "+Odd);
System.out.println("sum of even no "+Even);
} 






}