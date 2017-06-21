import java.util.*;
import java.lang.*;


class Subject
{
	
public static void main (String args[])
{
int a,b,c,d,e;
Scanner input=new Scanner(System.in);
System.out.println("Enter the value of subjectA "); // printing message
		a=input.nextInt();
		System.out.println("Enter the value of subjectB "); // printing message
		b=input.nextInt();
		System.out.println("Enter the value of subjectC "); // printing message
		c=input.nextInt();
		System.out.println("Enter the value of subjectD "); // printing message
		d=input.nextInt();
		System.out.println("Enter the value of SubjectE "); // printing message
		e=input.nextInt();
		
		int sum=a+b+c+d+e;
		System.out.println("your total sum is " +sum);
		
		int percent=sum*100/500;
		System.out.println("your percentage is " +percent);
		
		
		switch(percent)
		{
			char grade;
		}
		case 1:
		if(percent>=80)
		{grade='A';}
	    System.out.println("grade="+grade);
		break;
			}
		
		
		
}
	

	
	
