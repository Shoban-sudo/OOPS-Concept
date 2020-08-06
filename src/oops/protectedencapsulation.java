package oops;

import java.util.Scanner;

class h
{
	protected int a,b;
	void geta()
	{
	Scanner Sc=new Scanner(System.in);	
	a=Sc.nextInt();
	b=Sc.nextInt();
	}
	
}
class h1 extends h
{
	protected int c;
	
		void add()
		{
			
			c=(a+b);
			System.out.println(c);
		}
	}

public class protectedencapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		h1 obj=new h1();
		obj.geta();
		obj.add();

	}

}
