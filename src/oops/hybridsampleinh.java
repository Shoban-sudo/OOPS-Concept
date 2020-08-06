package oops;
import java.util.Scanner;
class z1

{
int a,b;
void sun()
{
	Scanner Sc=new Scanner(System.in);
	a=Sc.nextInt();
	b=Sc.nextInt();
	
}
}
class z2 extends z1
{
	void sun1()
	{
		switch(a)
		{
		case 1:System.out.println("sunday");
		break;
		case 2:System.out.println("monday");
		break;
		default:System.out.println("invalid");
		break;
		
		}
	}
}
class z3 extends z1
{
	void sun2()
	{
		switch(b)
		{
		case 3:System.out.println("tuesday");
		break;
		case 4:System.out.println("wednesday");
		break;
		default:System.out.println("invalid");
		break;
		
		}
	}
}
class z4 extends z2
{
	int c;
	void sun3()
	{
	Scanner Sc=new Scanner(System.in);
	c=Sc.nextInt();
	switch(c)
	{
	case 5:System.out.println("thusday");
	break;
	case 6:System.out.println("friday");
	break;
	default:System.out.println("invalid");
	
	}
	
	}
	}
class z5 extends z3
{
	int d;
	void sun4()
	{
	Scanner Sc=new Scanner(System.in);
	d=Sc.nextInt();
	switch(d)
	{
	case 5:System.out.println("saturday");
	break;
	
	default:System.out.println("invalid");
	
	}
	
	}
	}
	

public class hybridsampleinh {

	public static void main(String[] args) 
	{
		z4 obj=new z4();
		obj.sun();
		obj.sun1();
		obj.sun3();
		z5 obj1=new z5();
		obj1.sun();
		obj1.sun2();
		obj1.sun4();
		
		
	}

}
