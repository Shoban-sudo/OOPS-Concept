package oops;

import java.util.Scanner;

class h5
{
	 int a,b;
	void geta()
	{
	Scanner Sc=new Scanner(System.in);	
	a=Sc.nextInt();
	b=Sc.nextInt();
	}
	
}
class h6 extends h5
{
        int c;
	
		void add()
		{
			
			c=(a+b);
			System.out.println(c);
		}
	}

public class defaultencapsulation {

	public static void main(String[] args) {
	h6 obj=new h6 ();
	obj.geta();
	obj.add();

	}

}
