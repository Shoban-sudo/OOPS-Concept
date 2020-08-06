package oops;

import java.util.Scanner;

class s1
{
	int a,b;
	void sata()
	{
		Scanner Sc=new Scanner(System.in);
		a=Sc.nextInt();
		b=Sc.nextInt();
	}
}
class s2 extends s1
{
	int c;
	void add()
	{
		c=a+b;
		System.out.println(c);
	}
}
class s3 extends s2
{
	int d;
	void sub()
	{
		d=a-b;
		System.out.println(d);
	}
}

public class hirareichicalsamleinh {

	public static void main(String[] args) {
		s2 obj=new s2();
		obj.sata();
		obj.add();
		s3 obj1=new s3();
		obj1.sata();
		obj1.sub();
		
		// TODO Auto-generated method stub

	}

}
