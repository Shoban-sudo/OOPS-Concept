package oops;
import java.util.Scanner;
class x
{
	int a,b;
	void geta()
	{
		Scanner Sc=new Scanner(System.in);
		a=Sc.nextInt();		b=Sc.nextInt();
		
	}
}
class y extends x
{
	int c;
	void add()
	{
		if(a>b)
		{
			System.out.println("distinction");
		}
		else if(a<b)
		{
			System.out.println("first class");
		}
		else if(a>=b)
		{
			System.out.println("second class");
		}
		else
		{
			System.out.println("avg");
		}
//		c=a+b;
//		System.out.println(c);	
	}
	
}


public class inhsingle {

	public static void main(String[] args) {
		y obj=new y();
		obj.geta();
		obj.add();
		

	}

}
