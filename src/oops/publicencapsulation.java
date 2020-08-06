package oops;

import java.util.Scanner;

class m11
{
	public int a,b;
	void geta()
	{
	Scanner Sc=new Scanner(System.in);	
	a=Sc.nextInt();
	b=Sc.nextInt();
	}
	
}
class m12 extends y
{
	public int c;
	
		void add()
		{
			c=(a+b);
			System.out.println(c);
		}
	}

public class publicencapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m12 obj=new m12();
		obj.geta();
		obj.add();
		

	}

}
