package oops;

import java.util.Scanner;

class a11
{
	int a;
	void get11()
	{
		Scanner Sc=new Scanner(System.in);
		a=Sc.nextInt();
	}
}
class b11 extends a11
{
	int b;
	void get22()
	{
		Scanner Sc=new Scanner(System.in);
		b=Sc.nextInt();
	}

}
class c11 extends b11
{
	int c;
	void sub()
	{
		
		c=(a-b);
		System.out.println(c);
		
	}
	
	
}
class d11  extends c11
{
	int d;
	void add()
	{
		//Scanner Sc=new Scanner(System.in);
		//c=Sc.nextInt();
		d=(a+b+c);
		System.out.println(d);
		
	}
}
public class hierarichicalinh {

	public static void main(String[] args) {
		c11 obj=new c11();
		obj.get11();
		obj.get22();
		obj.sub();
		d11 obj1=new d11();
		obj1.get11();
		obj1.get22();
		obj1.sub();
		obj1.add();
		
		

	}

}
