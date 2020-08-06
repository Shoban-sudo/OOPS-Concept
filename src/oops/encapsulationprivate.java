package oops;

import java.util.Scanner;

class y11
{
	private int a,b;
	void geta()
	{
	Scanner Sc=new Scanner(System.in);	
	a=Sc.nextInt();
	b=Sc.nextInt();
	}
	
}
class y12 extends y
{
	private int c;
	
		void add()
		{
			c=(a+b);
			System.out.println(c);
		}
	}
	

public class encapsulationprivate {

	public static void main(String[] args) {
	y12 obj=new y12();
	obj.geta();
	obj.add();
	}

}
